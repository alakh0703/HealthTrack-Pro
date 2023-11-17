package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.Nurse
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.NurseDatabase
import com.example.labassignment4_comp304_004_alakh_dhrumit.R
import com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel.NurseViewModel
import com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel.NurseViewModelFactory

class SignUp : AppCompatActivity() {
    private lateinit var viewModel: NurseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val loginAccountTextView: TextView = findViewById(R.id.textViewLogin)

        // Set onClickListener for the "Create your account" TextView
        loginAccountTextView.setOnClickListener {
            // Start the SignUpActivity when the TextView is clicked
            startActivity(Intent(this, Login::class.java))
        }

        val signUpBtn : Button = findViewById(R.id.buttonSignUp)
        signUpBtn.setOnClickListener {
            createAccount()
        }
        // Initialize ViewModel using ViewModelProvider and NurseViewModelFactory
        val dao = NurseDatabase.getInstance(applicationContext).nurseDao()
        viewModel = ViewModelProvider(this, NurseViewModelFactory(dao)).get(NurseViewModel::class.java)
    }
        private fun createAccount(){
        val firstNameEdit: EditText = findViewById(R.id.editTextFirstName)
        val lastNameEdit: EditText = findViewById(R.id.editTextLastName)
        val nurseIdEdit: EditText = findViewById(R.id.editTextNurseId)
        val passwordEdit: EditText = findViewById(R.id.editTextPassword)
        val spinner: Spinner = findViewById(R.id.spinnerDepartment)

        val firstName = firstNameEdit.text.toString().trim()
        val lastName = lastNameEdit.text.toString().trim()
        var nurseId = nurseIdEdit.text.toString().trim()
        val password = passwordEdit.text.toString().trim()
        val department = spinner.selectedItem.toString()
        if (validateInput(firstName, lastName, nurseId, password, department)) {
            // TODO: Add Nurse to the Database and redirect to the login page
            val nurse = Nurse(nurseId=nurseId, firstName = firstName, lastName = lastName, department = department, password = password)
            viewModel.insertNurse(nurse)
        } else {
            makeToast("Please fill all the fields!")
        }
    }

    private fun validateInput(
        firstName: String,
        lastName: String,
        nurseId: String,
        password: String,
        department: String,

    ): Boolean {
        // Implement your validation logic here
        // For example, you can check if fields are empty, meet certain length criteria, etc.

        if (firstName.isEmpty() || lastName.isEmpty() || nurseId.isEmpty() || password.isEmpty()
            || department.isEmpty()) {
            // Show error message or set error on respective EditTexts
            return false
        }

        return true
    }

    private fun makeToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}

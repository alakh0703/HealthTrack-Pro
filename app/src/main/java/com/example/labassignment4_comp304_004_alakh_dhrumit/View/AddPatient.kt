package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import android.annotation.SuppressLint
<<<<<<< HEAD
=======
import android.content.Context
>>>>>>> master
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
<<<<<<< HEAD
import com.example.labassignment4_comp304_004_alakh_dhrumit.R
import java.time.ZoneId

class AddPatient : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_patient)
=======
import androidx.lifecycle.ViewModelProvider
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.Nurse
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.Patient
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.PatientDatabase
//import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.PatientDb
import com.example.labassignment4_comp304_004_alakh_dhrumit.R
import com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel.NurseViewModel
import com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel.PatientViewModel
import com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel.PatientViewModelFactory


//class AddPatient : AppCompatActivity() {
//
//    private lateinit var  viewModel: PatientViewModel
//
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_add_patient)
//
//        val cancelBtn: TextView = findViewById(R.id.cancel_btn)
//
//        cancelBtn.setOnClickListener{
//            startActivity(Intent(this, Records::class.java))
//        }
//
//        val addPatientBtn : Button = findViewById(R.id.buttonAddPatient)
//        addPatientBtn.setOnClickListener{
//            addPatient()
//        }
//
//    }
//
//    private fun addPatient() {
//        val patientIdEdit: EditText = findViewById(R.id.editTextPatientId)
//        val firstNameEdit: EditText = findViewById(R.id.editTextFirstName)
//        val lastNameEdit: EditText = findViewById(R.id.editTextLastName)
//        val nurseIdEdit: EditText = findViewById(R.id.editTextNurseId)
//        val roomNoEdit: EditText = findViewById(R.id.editTextRoom)
//        val ageEdit: EditText = findViewById(R.id.editTextAge)
//
//        val departmentSpinner: Spinner = findViewById(R.id.spinnerDepartment)
//
//        val patientId = patientIdEdit.text.toString().trim()
//        val firstName = firstNameEdit.text.toString().trim()
//        val lastName = lastNameEdit.text.toString().trim()
//        val nurseId = nurseIdEdit.text.toString().trim()
//        val roomNo = roomNoEdit.text.toString().trim()
//        val age = ageEdit.text.toString().trim()
//        val department = departmentSpinner.selectedItem.toString()
//        if (validatePatientInput(patientId, firstName, lastName, nurseId, roomNo, age, department)) {
//            // TODO: Add a new patient to the patient table and redirect to viewPatient Activity
//
//            fun savePatientData() {
//                val patient = PatientDb(0, firstName, lastName, department, nurseId, roomNo.toInt())
//                viewModel.insertPatient(patient)
//
//            }
//            savePatientData()
//
//        } else {
//            makeToast("Please fill all the fields!")
//
//        }
//    }
//
//    private fun validatePatientInput(
//        patientId: String,
//        firstName: String,
//        lastName: String,
//        nurseId: String,
//        roomNo: String,
//        age: String,
//        department: String
//    ): Boolean {
//        // Implement your validation logic here
//        // For example, you can check if fields are empty, meet certain length criteria, etc.
//
//        if (patientId.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || nurseId.isEmpty()
//            || roomNo.isEmpty() || age.isEmpty() || department.isEmpty()) {
//
//            return false
//        }
//        // Check if age is a valid number
//        try {
//            val ageValue = age.toInt()
//            val roomValue = roomNo.toInt()
//            if (ageValue <= 0) {
//                // Age should be a positive number
//                makeToast("Age must a positive number")
//                return false
//            }
//            else if(roomValue <= 0){
//                makeToast("Room must a positive number")
//                return false
//            }
//        } catch (e: NumberFormatException) {
//            // Age is not a valid number
//            makeToast("Room and Age Should a valid number")
//            return false
//        }
//
//
//        return true
//    }
//
//
//    private fun makeToast(message: String){
//        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
//    }
//
//}

class AddPatient : AppCompatActivity() {
    private lateinit var patientViewModel: PatientViewModel
    private lateinit var nurseViewModel : NurseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_patient)
        val current_user = getSavedUsername()
        val nurseIdEditText0 : EditText = findViewById(R.id.editTextNurseId)
        makeToast(current_user)
        nurseIdEditText0.setText(current_user)
>>>>>>> master

        val cancelBtn: TextView = findViewById(R.id.cancel_btn)

        cancelBtn.setOnClickListener{
            startActivity(Intent(this, Records::class.java))
        }

        val addPatientBtn : Button = findViewById(R.id.buttonAddPatient)
        addPatientBtn.setOnClickListener{
            addPatient()
        }

<<<<<<< HEAD
    }

    private fun addPatient() {
=======
        // Assuming you've set up PatientDao and PatientDatabase correctly
        val patientDao = PatientDatabase.getInstance(applicationContext).patientDao()

        // Initializing the PatientViewModel using the factory
        patientViewModel = ViewModelProvider(this, PatientViewModelFactory(patientDao)).get(PatientViewModel::class.java)
//        val patient = Patient(patientId = "P123", firstName = "Alice", lastName = "Smith", department = "Cardiology", condition = "Heart Disease")
//
//        patientViewModel.insertPatient(patient)

    }

        private fun addPatient() {
>>>>>>> master
        val patientIdEdit: EditText = findViewById(R.id.editTextPatientId)
        val firstNameEdit: EditText = findViewById(R.id.editTextFirstName)
        val lastNameEdit: EditText = findViewById(R.id.editTextLastName)
        val nurseIdEdit: EditText = findViewById(R.id.editTextNurseId)
        val roomNoEdit: EditText = findViewById(R.id.editTextRoom)
        val ageEdit: EditText = findViewById(R.id.editTextAge)

        val departmentSpinner: Spinner = findViewById(R.id.spinnerDepartment)

        val patientId = patientIdEdit.text.toString().trim()
        val firstName = firstNameEdit.text.toString().trim()
        val lastName = lastNameEdit.text.toString().trim()
        val nurseId = nurseIdEdit.text.toString().trim()
        val roomNo = roomNoEdit.text.toString().trim()
        val age = ageEdit.text.toString().trim()
        val department = departmentSpinner.selectedItem.toString()
        if (validatePatientInput(patientId, firstName, lastName, nurseId, roomNo, age, department)) {
            // TODO: Add a new patient to the patient table and redirect to viewPatient Activity
<<<<<<< HEAD
        } else {
            makeToast("Please fill all the fields!")

        }
=======
            makeToast("FUCK")



                val patient2 = Patient(
                    patientId = patientId,
                    firstName = firstName,
                    lastName = lastName,
                    department = department,
                    nurseId = nurseId,
                    age = age.toInt(),
                    room = roomNo.toInt()
                )

                patientViewModel.insertPatient(patient2)


                finish()
            }
            else {
            makeToast("Nurse ID doesn't Exist")
            }

>>>>>>> master
    }

    private fun validatePatientInput(
        patientId: String,
        firstName: String,
        lastName: String,
        nurseId: String,
        roomNo: String,
        age: String,
        department: String
    ): Boolean {
        // Implement your validation logic here
        // For example, you can check if fields are empty, meet certain length criteria, etc.

        if (patientId.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || nurseId.isEmpty()
            || roomNo.isEmpty() || age.isEmpty() || department.isEmpty()) {

            return false
        }
        // Check if age is a valid number
        try {
            val ageValue = age.toInt()
            val roomValue = roomNo.toInt()
            if (ageValue <= 0) {
                // Age should be a positive number
                makeToast("Age must a positive number")
                return false
            }
            else if(roomValue <= 0){
                makeToast("Room must a positive number")
                return false
            }
        } catch (e: NumberFormatException) {
            // Age is not a valid number
            makeToast("Room and Age Should a valid number")
            return false
        }


        return true
    }
<<<<<<< HEAD
=======
    // Retrieve username from SharedPreferences
    private fun getSavedUsername(): String {
        val sharedPreferences = getSharedPreferences("MyUser", Context.MODE_PRIVATE)
        return sharedPreferences.getString("username", "") ?: ""
    }
>>>>>>> master


    private fun makeToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
<<<<<<< HEAD

}
=======
}

>>>>>>> master

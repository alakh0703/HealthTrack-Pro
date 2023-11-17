package com.example.labassignment4_comp304_004_alakh_dhrumit.View


<<<<<<< HEAD
=======
import android.content.Context
>>>>>>> master
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
<<<<<<< HEAD
import com.example.labassignment4_comp304_004_alakh_dhrumit.R

open class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

=======
//import androidx.lifecycle.ViewModelProvider
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.NurseDatabase
import com.example.labassignment4_comp304_004_alakh_dhrumit.R
import com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel.NurseViewModel
import com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel.NurseViewModelFactory

//open class Login : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//

//    }
//
//    private fun login(){
//        val usernameEdit : EditText = findViewById(R.id.editTextNurseId)
//        val passwordEdit : EditText = findViewById(R.id.editTextPassword)
//
//        val username = (usernameEdit.text).toString()
//        val password = (passwordEdit.text).toString()
//
//        if(username.isEmpty() || password.isEmpty()){
//            makeToast("Please fill all fields!")
//            return
//        }
//        else {
//            val isAuthenticated = checkCredentials(username, password)
//            if(isAuthenticated){
//                // TODO : Save the Nurse ID to preferences
//
//                startActivity(Intent(this,Records::class.java))
//            }
//        }
//    }
//    private fun checkCredentials(username: String, password: String): Boolean {
//        // TODO : Authenticate user from the database
//
//        return true
//    }
//
//    private fun makeToast(message: String){
//        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
//    }
//}


//class Login : AppCompatActivity() {
//
//    private lateinit var nurseViewModel: NurseViewModel
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//
//        // Obtain the NurseViewModel instance
//        val nurseDao = NurseDatabase.getInstance(applicationContext).nurseDao()
//        nurseViewModel = ViewModelProvider(this, NurseViewModelFactory(nurseDao)).get(NurseViewModel::class.java)
//
//        // Use the query function
//        val nurseId = "your_nurse_id"
//        val password = "search_word"
//
//        nurseViewModel.getNurseIdAndPassword(nurseId, password)
//        // Observe LiveData or coroutine results to handle the nurse credentials
//        // Update UI or perform necessary actions with the obtained credentials
//    }
//}

// YourActivity.kt

import androidx.lifecycle.ViewModelProvider
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.Nurse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Login : AppCompatActivity() {
    private lateinit var nurseViewModel: NurseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
>>>>>>> master
        val createAccountTextView: TextView = findViewById(R.id.textViewCreateAccount)
        val loginBtn :Button = findViewById(R.id.buttonLogin)

        loginBtn.setOnClickListener{
            login()
        }
        // Set onClickListener for the "Create your account" TextView
        createAccountTextView.setOnClickListener {
            // Start the SignUpActivity when the TextView is clicked
            startActivity(Intent(this, SignUp::class.java))
        }
<<<<<<< HEAD
=======
        val dao = NurseDatabase.getInstance(applicationContext).nurseDao()
        val factory = NurseViewModelFactory(dao)
        nurseViewModel = ViewModelProvider(this, factory).get(NurseViewModel::class.java)

        val nurseId = "12"
        val password = "123"
//        makeToast("1")
//        GlobalScope.launch(Dispatchers.Main) {
//            val nurse = nurseViewModel.getNurseByCredentials(nurseId, password)
//            makeToast("2")
//            handleLoginResult(nurse)
//        }
    }

    private fun saveUsername(username: String) {
        val sharedPreferences = getSharedPreferences("MyUser", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("username", username)
        editor.apply()
>>>>>>> master
    }

    private fun login(){
        val usernameEdit : EditText = findViewById(R.id.editTextNurseId)
        val passwordEdit : EditText = findViewById(R.id.editTextPassword)

        val username = (usernameEdit.text).toString()
        val password = (passwordEdit.text).toString()

        if(username.isEmpty() || password.isEmpty()){
            makeToast("Please fill all fields!")
            return
        }
        else {
<<<<<<< HEAD
            val isAuthenticated = checkCredentials(username, password)
            if(isAuthenticated){
                // TODO : Save the Nurse ID to preferences
                startActivity(Intent(this,Records::class.java))
            }
        }
    }
    private fun checkCredentials(username: String, password: String): Boolean {
        // TODO : Authenticate user from the database
        return true
    }

    private fun makeToast(message: String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}
=======
            checkCredentials(username, password) {
                isValid->
                if(isValid){
                    saveUsername(username)
                  startActivity(Intent(this,Records::class.java))

                }
            }

        }
    }
    private fun checkCredentials(username: String, password: String, callback: (Boolean) -> Unit) {
        GlobalScope.launch(Dispatchers.Main) {
            val nurse = nurseViewModel.getNurseByCredentials(username, password)
            val isValid = handleLoginResult(nurse)
            callback(isValid)
        }
    }

    private fun handleLoginResult(nurse: Nurse?): Boolean {
//        makeToast("3")
        return if (nurse != null) {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            true
        } else {
            Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            false
        }
    }

    private fun makeToast(mes: String){
        Toast.makeText(this, mes, Toast.LENGTH_SHORT).show()
    }
}



>>>>>>> master

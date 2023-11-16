package com.example.labassignment4_comp304_004_alakh_dhrumit.View


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.labassignment4_comp304_004_alakh_dhrumit.R

open class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

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

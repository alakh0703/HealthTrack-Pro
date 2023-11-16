package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.labassignment4_comp304_004_alakh_dhrumit.R

class MainActivity : AppCompatActivity() {

    private lateinit var loginButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.go2login)

        // Set onClickListener for the login button
        loginButton.setOnClickListener {
            // Start the LoginActivity when the login button is clicked
            startActivity(Intent(this, Login::class.java))
        }
    }
}

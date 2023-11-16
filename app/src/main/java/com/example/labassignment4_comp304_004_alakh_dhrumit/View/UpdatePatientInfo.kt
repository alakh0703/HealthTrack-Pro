package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import com.example.labassignment4_comp304_004_alakh_dhrumit.R

class UpdatePatientInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_patient_info)

        val saveUpdateBtn: Button = findViewById(R.id.buttonSaveUpdate)
        saveUpdateBtn.setOnClickListener{
            updateInfo()
        }

        val cancelBtn : TextView = findViewById(R.id.cancel_btn_edit)

        cancelBtn.setOnClickListener {
finish()        }
    }

    private fun updateInfo(){
        val firstNameEdit : EditText = findViewById(R.id.editTextFirstName)
        val lastNameEdit : EditText = findViewById(R.id.editTextLastName)
        val departmentSpinner : Spinner = findViewById(R.id.editTextDepartment)
        val roomNoEdit : EditText = findViewById(R.id.editTextRoom)

        val firstName = firstNameEdit.text.toString().trim()
        val lastName = lastNameEdit.text.toString().trim()
        val department = departmentSpinner.selectedItem.toString()
        val roomNo = roomNoEdit.text.toString().trim()
        if (firstName.isEmpty() || lastName.isEmpty()  || roomNo.isEmpty()) {
            makeToast("Please fill all the fields!")
            return
        }
        if (!isNumeric(roomNo)) {
            // Show an error message or handle invalid room number
            // For example, you can display an error message to the user
            makeToast("Room number must be a number")
            return
        }

       // TODO: Update Patient's info in the database

    }

    private fun isNumeric(input: String): Boolean {
        return try {
            input.toInt()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }

    private fun makeToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}
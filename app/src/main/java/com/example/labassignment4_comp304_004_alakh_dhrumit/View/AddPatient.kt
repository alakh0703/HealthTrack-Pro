package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import com.example.labassignment4_comp304_004_alakh_dhrumit.R
import java.time.ZoneId

class AddPatient : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_patient)

        val cancelBtn: TextView = findViewById(R.id.cancel_btn)

        cancelBtn.setOnClickListener{
            startActivity(Intent(this, Records::class.java))
        }

        val addPatientBtn : Button = findViewById(R.id.buttonAddPatient)
        addPatientBtn.setOnClickListener{
            addPatient()
        }

    }

    private fun addPatient() {
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
        } else {
            makeToast("Please fill all the fields!")

        }
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


    private fun makeToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}
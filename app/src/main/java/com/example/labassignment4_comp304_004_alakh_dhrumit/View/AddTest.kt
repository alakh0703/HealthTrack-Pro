package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.example.labassignment4_comp304_004_alakh_dhrumit.R
import com.google.android.material.textfield.TextInputEditText

class AddTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_test)

        val addTestBtn : Button = findViewById(R.id.buttonSaveTest)

        addTestBtn.setOnClickListener {
            addTest()
        }
    }
    private fun validateTestInput(testName: String, testResult: String, report: String): Boolean {
        // Check if test name and report are not empty
        if (testName.isEmpty() || report.isEmpty()) {
            return false
        }

        // Check if a test result is selected
        if (testResult.isEmpty()) {
            return false
        }

        return true
    }

    private fun addTest() {
        val testNameEdit: TextInputEditText = findViewById(R.id.editTextTestName)
        val testResultSpinner: Spinner = findViewById(R.id.spinnerTestResult)
        val reportEdit: EditText = findViewById(R.id.editTextTestReport)

        val testName = testNameEdit.text.toString()
        val testResult = testResultSpinner.selectedItem.toString()
        val report = reportEdit.text.toString()

        // TODO: Create a test id

        // TODO: Get NurseID and PatientID from Previous Activity

        if (validateTestInput(testName, testResult, report)) {
            // TODO: Add the test to the test table in database and redirect to previous activity


        } else {
            makeToast("Please fill all the field!")
        }
    }

    private fun makeToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
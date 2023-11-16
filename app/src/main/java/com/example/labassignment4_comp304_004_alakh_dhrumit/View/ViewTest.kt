package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.labassignment4_comp304_004_alakh_dhrumit.R

class ViewTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_test)

        // TODO : Get test id from previous activity and fetch it from database and populate it

        
        // Get test details from intent or wherever you store them
//        val patientId = intent.getIntExtra("patientId", 0)
//        val testName = intent.getStringExtra("testName")
//        val testResult = intent.getStringExtra("testResult")
//        val testReport = intent.getStringExtra("testReport")
//
//        // Set the test details to the TextViews
//        findViewById<TextView>(R.id.textViewPatientId).text = "Patient ID: $patientId"
//        findViewById<TextView>(R.id.textViewTestName).text = "Test Name: $testName"
//        findViewById<TextView>(R.id.textViewTestResult).text = "Test Result: $testResult"
//        findViewById<TextView>(R.id.textViewTestReport).text = "Test Report: $testReport"
    }
}
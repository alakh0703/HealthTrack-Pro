package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.TextPaint
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.labassignment4_comp304_004_alakh_dhrumit.R
import com.example.labassignment4_comp304_004_alakh_dhrumit.View.Patient
import com.example.labassignment4_comp304_004_alakh_dhrumit.View.PatientAdapter

class Records : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_records)

        val addPatientBtn : TextView = findViewById(R.id.add_patientText)

        addPatientBtn.setOnClickListener{
            startActivity(Intent(this,AddPatient::class.java))
        }
// TODO: Add a patient id to the card in recycler list
        // Generate fake patient data
        val fakePatientList = generateFakePatients()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewPatients)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = PatientAdapter(this,fakePatientList)


        recyclerView.adapter = adapter
    }

    private fun generateFakePatients(): List<Patient> {
        val patients = mutableListOf<Patient>()

        // Generate some fake patient data
        for (i in 1..10) {
            val patient = Patient(
                patientId = i.toInt(),
                firstname = "Patient$i",
                lastname = "Lastname$i",
                department = "Department$i",
                nurseId = 101,
                room = "Room $i"
                // Add more fields as needed
            )
            patients.add(patient)
        }

        return patients
    }
}

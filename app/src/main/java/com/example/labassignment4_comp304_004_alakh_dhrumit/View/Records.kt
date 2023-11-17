package com.example.labassignment4_comp304_004_alakh_dhrumit.View

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
<<<<<<< HEAD
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
=======
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.Patient
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.PatientDatabase
import com.example.labassignment4_comp304_004_alakh_dhrumit.R
import com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel.PatientViewModel
import com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel.PatientViewModelFactory

class Records : AppCompatActivity() {

    private lateinit var patientListDb: MutableList<com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.Patient>
>>>>>>> master
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_records)
<<<<<<< HEAD
=======
        val patientDao = PatientDatabase.getInstance(applicationContext).patientDao()
        val patientViewModel = ViewModelProvider(this, PatientViewModelFactory(patientDao)).get(PatientViewModel::class.java)
>>>>>>> master

        val addPatientBtn : TextView = findViewById(R.id.add_patientText)

        addPatientBtn.setOnClickListener{
            startActivity(Intent(this,AddPatient::class.java))
        }
<<<<<<< HEAD
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
=======
        // TODO: Add a patient id to the card in recycler list
        // Generate fake patient data
        patientListDb = generateFakePatients()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewPatients)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = PatientAdapter(this,patientListDb)


        recyclerView.adapter = adapter

        fetchPatients(patientViewModel,adapter)
    }

    private fun fetchPatients(patientViewModel: PatientViewModel,adapter: PatientAdapter) {
            patientViewModel.getAllPatients().observe(this) { patients ->
                patients?.let {
                    patientListDb.clear()
                    patientListDb.addAll(it.toMutableList())
                    adapter.notifyDataSetChanged()
                } ?: run {
                    Toast.makeText(this, "Failed to fetch patients", Toast.LENGTH_SHORT).show()
                }
            }


//        patientViewModel.getAllPatients().observe(this) { patients ->
//            patients?.let {
//
//
//                val viewPatients = patients.map { modelPatient ->
//                    // Convert modelPatient to View's Patient
//                    // Example conversion, adapt as needed
//                    com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.Patient(
//                        // Map properties accordingly
//                        patientId = (modelPatient.patientId),
//                        firstName = modelPatient.firstName,
//                        lastName = modelPatient.lastName,
//                        department = modelPatient.department,
//                        nurseId = (modelPatient.nurseId),
//                        age = modelPatient.age
//
//
//                    )
//                }
//                patientListDb.clear()
//                patientListDb.addAll(viewPatients)
//                adapter.notifyDataSetChanged()
//            } ?: run {
//                Toast.makeText(this, "Failed to fetch patients", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
    }
    private fun generateFakePatients(): MutableList<Patient> {
        val patients = mutableListOf<com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.Patient>()

        // Generate some fake patient data
            val patient = com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.Patient(

                patientId = "3",
                firstName = "Dummy",
                lastName = "1",
                department = "1",
                nurseId = "sfvdf",
                age = 99,
                room = 101
            )
            patients.add(patient)

>>>>>>> master

        return patients
    }
}

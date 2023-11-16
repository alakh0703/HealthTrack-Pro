package com.example.labassignment4_comp304_004_alakh_dhrumit.View

// Inside ViewPatient.kt
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.labassignment4_comp304_004_alakh_dhrumit.R

class ViewPatient : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_patient)

        // TODO: Get the patient id from Previous Activity and Fetch it's data and populate it

        // TODO: Also get all the database and filter it using patient id

        val addTestBtn : TextView = findViewById(R.id.add_testText)

        addTestBtn.setOnClickListener {
            // TODO: Pass the Nurse ID and PatientID to the this activity


            startActivity(Intent(this, AddTest::class.java))
        }

        val editInfoBtn : TextView = findViewById(R.id.textViewEditInfo)
        editInfoBtn.setOnClickListener {
            // TODO: Pass the PatientId and NurseID to this activity


            startActivity(Intent(this, UpdatePatientInfo::class.java))
        }
        // Assuming you have a list of tests for the patient

        // TODO: Try to add the test id to the card in recycler view


        val testList = generateFakeTestList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewTests)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = TestAdapter(this,testList)
        recyclerView.adapter = adapter
    }

    private fun generateFakeTestList(): List<Test> {
        val fakeTests = mutableListOf<Test>()

        // Adding some fake test data
        fakeTests.add(Test("CBC", "Positive"))
        fakeTests.add(Test("Blood Sugar", "Negative"))
        fakeTests.add(Test("X-Ray", "Positive"))
        fakeTests.add(Test("X-Ray", "Positive"))

        fakeTests.add(Test("X-Ray", "Positive"))
        fakeTests.add(Test("X-Ray", "Positive"))
        fakeTests.add(Test("X-Ray", "Positive"))
        fakeTests.add(Test("X-Ray", "Positive"))
        fakeTests.add(Test("X-Ray", "Positive"))


        return fakeTests
    }
}


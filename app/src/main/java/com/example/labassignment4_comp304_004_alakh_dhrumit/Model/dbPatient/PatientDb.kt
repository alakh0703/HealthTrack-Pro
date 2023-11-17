package com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "patient_data_table")
//data class PatientDb(
//
//    @PrimaryKey(autoGenerate = true)
//    var patientId: Int = 0,
//    var firstname: String,
//    var lastname: String,
//    var department: String,
//    var nurseid : String,
//    var room : Int
//
//)

@Entity(tableName = "patient_table")
data class Patient(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val patientId: String,
    val firstName: String,
    val lastName: String,
    val department: String,
    val nurseId : String,
    val age : Int,
    val room: Int
)

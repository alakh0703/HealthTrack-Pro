package com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

//@Dao
//interface PatientDao {
//    @Insert
//    suspend fun insertPatient(patient: PatientDb)
//
//    @Update
//    suspend fun updatePatient(patient: PatientDb)
//
//    @Delete
//    suspend fun deletePatient(patient: PatientDb)
//}

@Dao
interface PatientDao {
    @Insert
    suspend fun insertPatient(patient: Patient)

    @Update
    suspend fun updatePatient(patient: Patient)

    @Delete
    suspend fun deletePatient(patient: Patient)

    @Query("SELECT * FROM patient_table")
    fun getAllPatients():LiveData<List<Patient>>
}


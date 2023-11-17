package com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NurseDao {
    @Insert
    suspend fun insertNurse(nurse: Nurse)

    @Update
    suspend fun updateNurse(nurse: Nurse)

    @Delete
    suspend fun deleteNurse(nurse: Nurse)

//    @Query("SELECT nurseId, password FROM nurse_data_table WHERE nurseId = :nurseId AND password = :password")
//    fun getNurseIdAndPassword(nurseId: String, password: String): List<Nurse>

    @Query("SELECT * FROM nurse_data_table WHERE nurseId = :nurseId AND password = :password")
    suspend fun getNurseByCredentials(nurseId: String, password: String): Nurse?
//
//    @Query("SELECT * FROM nurse_data_table WHERE nurseId = :nurseId")
//    suspend fun checkNurse(nurseId: String)


}

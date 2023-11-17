package com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbTest

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TestDao {
    @Insert
    suspend fun insertTest(test: Test)

    @Update
    suspend fun updateTest(test: Test)

    @Delete
    suspend fun deleteTest(test: Test)

    @Query("SELECT * FROM test_data_table")
    fun getAllTests(): LiveData<List<Test>>
}

package com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "nurse_data_table")
data class Nurse(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nurseId: String,
    val firstName: String,
    val lastName: String,
    val department: String,
    val password: String
)

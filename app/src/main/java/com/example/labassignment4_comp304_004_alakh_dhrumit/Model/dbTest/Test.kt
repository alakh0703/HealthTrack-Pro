package com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbTest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "test_data_table")
data class Test(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "test_id")
    var testId: Int,

    @ColumnInfo(name = "patient_id")
    var patientId: String,

    @ColumnInfo(name = "nurse_id")
    var nurseId: String,

    @ColumnInfo(name = "test_name")
    var testName: String,

    @ColumnInfo(name="test_report")
    var testReport: String,

    @ColumnInfo(name = "test_result")
    var testResult: String
)

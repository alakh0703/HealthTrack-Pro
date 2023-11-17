package com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.PatientDao
import java.lang.IllegalArgumentException

class PatientViewModelFactory(private val patientDao: PatientDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PatientViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PatientViewModel(patientDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

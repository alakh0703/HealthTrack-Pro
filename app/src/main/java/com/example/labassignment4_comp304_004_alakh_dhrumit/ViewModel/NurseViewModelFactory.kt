package com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.NurseDao
import java.lang.IllegalArgumentException

class NurseViewModelFactory(private val dao: NurseDao) : ViewModelProvider.Factory {
     override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NurseViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return NurseViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

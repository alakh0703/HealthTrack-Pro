package com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.Nurse
//import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.NurseDb
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.NurseDao
import kotlinx.coroutines.launch

class NurseViewModel(private val dao: NurseDao) : ViewModel() {
    fun insertNurse(nurse: Nurse) {
        viewModelScope.launch {
            dao.insertNurse(nurse)
        }
    }

    suspend fun getNurseByCredentials(nurseId: String, password: String) = dao.getNurseByCredentials(nurseId, password)

//    suspend fun checkNurseId(nurseId: String) = dao.checkNurse(nurseId)
}



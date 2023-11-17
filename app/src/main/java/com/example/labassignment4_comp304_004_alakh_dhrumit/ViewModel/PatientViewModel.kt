package com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel

//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
////import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.PatientDb
//import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.PatientDao
//import kotlinx.coroutines.launch

//class PatientViewModel(private val dao: PatientDao) : ViewModel() {
//    val patients = dao.getAllPatients()
//
//    fun insertPatient(patient: PatientDb) = viewModelScope.launch {
//        dao.insertPatient(patient)
//    }
//
//    fun updatePatient(patient: PatientDb) = viewModelScope.launch {
//        dao.updatePatient(patient)
//    }
//
//    fun deletePatient(patient: PatientDb) = viewModelScope.launch {
//        dao.deletePatient(patient)
//    }
//}

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse.Nurse
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.Patient
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient.PatientDao
import kotlinx.coroutines.launch

class PatientViewModel(private val patientDao: PatientDao) : ViewModel() {
    fun insertPatient(patient: Patient) {
        viewModelScope.launch {
            patientDao.insertPatient(patient)
        }
    }
    fun getAllPatients(): LiveData<List<Patient>> {
        return patientDao.getAllPatients()
    }

}

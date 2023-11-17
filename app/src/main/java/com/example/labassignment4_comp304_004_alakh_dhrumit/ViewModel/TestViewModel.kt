package com.example.labassignment4_comp304_004_alakh_dhrumit.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbTest.Test
import com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbTest.TestDao
import kotlinx.coroutines.launch

class TestViewModel(private val dao: TestDao) : ViewModel() {
    val tests = dao.getAllTests()

    fun insertTest(test: Test) = viewModelScope.launch {
        dao.insertTest(test)
    }

    fun updateTest(test: Test) = viewModelScope.launch {
        dao.updateTest(test)
    }

    fun deleteTest(test: Test) = viewModelScope.launch {
        dao.deleteTest(test)
    }
}

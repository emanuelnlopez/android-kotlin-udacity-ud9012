package com.example.android.trackmysleepquality.sleepquality

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import java.lang.IllegalArgumentException

class SleepQualityViewModelFactory(
        private val sleepNightkey: Long,
        private val dataSource: SleepDatabaseDao): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SleepQualityViewModel::class.java)) {
            return SleepQualityViewModel(sleepNightkey, dataSource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}

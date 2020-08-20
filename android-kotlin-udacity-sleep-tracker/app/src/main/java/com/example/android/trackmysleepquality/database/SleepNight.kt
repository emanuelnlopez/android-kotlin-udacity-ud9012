package com.example.android.trackmysleepquality.database

data class SleepNight(
        var nightId: Long = 0L,
        var startTimeMilli: Long = System.currentTimeMillis(),
        var endTimeMilli: Long = startTimeMilli,
        var sleepQuality: Int = -1
)
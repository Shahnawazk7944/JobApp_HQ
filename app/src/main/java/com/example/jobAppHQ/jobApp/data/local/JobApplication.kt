package com.example.jobAppHQ.jobApp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class JobApplication(

    val companyName: String,
    val role: String,
    val location: String,
    val appliedDate: Long,
    val status: String,
    val platform: String,
    val description1: String,
    val description2: String,
    val description3: String,
    val hrDetails: String,

    @PrimaryKey(autoGenerate = true)
    val id:Int = 0
)
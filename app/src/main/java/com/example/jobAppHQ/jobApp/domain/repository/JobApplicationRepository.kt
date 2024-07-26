package com.example.jobAppHQ.jobApp.domain.repository

import com.example.jobAppHQ.jobApp.data.local.JobApplication

interface JobApplicationRepository {

    suspend fun insertJobApplication(jobApplication: JobApplication)

    suspend fun updateJobApplication(jobApplication: JobApplication)

    suspend fun deleteJobApplication(jobApplication: JobApplication)

//    suspend fun getAllJobApplications(): List<JobApplication>
//
//    suspend fun getJobApplicationById(id: Int): JobApplication?
}
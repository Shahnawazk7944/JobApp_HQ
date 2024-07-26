package com.example.jobAppHQ.jobApp.data.repository

import com.example.jobAppHQ.jobApp.data.local.JobApplication
import com.example.jobAppHQ.jobApp.data.local.JobApplicationDao
import com.example.jobAppHQ.jobApp.domain.repository.JobApplicationRepository
import javax.inject.Inject

class JobApplicationRepositoryImpl @Inject constructor(
    private val jobApplicationDao: JobApplicationDao
) : JobApplicationRepository {

    override suspend fun insertJobApplication(jobApplication: JobApplication) {
        jobApplicationDao.insertJobApplication(jobApplication)
    }

    override suspend fun updateJobApplication(jobApplication: JobApplication) {
        jobApplicationDao.updateJobApplication(jobApplication)
    }

    override suspend fun deleteJobApplication(jobApplication: JobApplication) {
        jobApplicationDao.deleteJobApplication(jobApplication)
    }
}
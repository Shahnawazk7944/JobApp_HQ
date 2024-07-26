package com.example.jobAppHQ.jobApp.di

import android.content.Context
import com.example.jobAppHQ.jobApp.data.local.JobApplicationDao
import com.example.jobAppHQ.jobApp.data.repository.JobApplicationRepositoryImpl
import com.example.jobAppHQ.jobApp.domain.repository.JobApplicationRepository
import dagger.Provides
import javax.inject.Named


@Provides
fun provideJobApplicationRepository(
    @Named("applicationContext") context: Context,
    jobApplicationDao: JobApplicationDao
): JobApplicationRepository {
    return JobApplicationRepositoryImpl(jobApplicationDao)
}
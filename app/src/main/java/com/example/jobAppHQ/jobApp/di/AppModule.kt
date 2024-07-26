package com.example.jobAppHQ.jobApp.di

import android.app.Application
import android.content.Context
import com.example.jobAppHQ.jobApp.data.local.JobApplicationDao
import com.example.jobAppHQ.jobApp.data.local.JobApplicationDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

//    @Provides
//    inline fun <reified T> provideDatabase(context: Context): T {
//        return Room.databaseBuilder(context, T::class.java, JobApplicationDatabase.DATABASE_NAME)
//            .build()
//    }

    @Provides
    fun provideJobApplicationDao(database: JobApplicationDatabase): JobApplicationDao {
        return database.jobApplicationDao()
    }


}
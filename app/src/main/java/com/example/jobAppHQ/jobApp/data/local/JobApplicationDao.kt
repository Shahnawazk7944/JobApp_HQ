package com.example.jobAppHQ.jobApp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface JobApplicationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertJobApplication(jobApplication: JobApplication)

    @Update
    suspend fun updateJobApplication(jobApplication: JobApplication)

    @Delete
    suspend fun deleteJobApplication(jobApplication: JobApplication)


    @Query("SELECT * FROM jobapplicationdb ORDER BY appliedDate DESC")
    fun getOrderByAppliedDate(): Flow<List<JobApplication>>
    @Query("SELECT * FROM jobapplicationdb ORDER BY companyName ASC")
    fun getOrderByCompanyName(): Flow<List<JobApplication>>

}
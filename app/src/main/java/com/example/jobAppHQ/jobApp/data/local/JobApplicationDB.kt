package com.example.jobAppHQ.jobApp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [JobApplication::class], version = 1)
abstract class JobApplicationDatabase : RoomDatabase() {
    abstract fun jobApplicationDao(): JobApplicationDao

    companion object {
        const val DATABASE_NAME = "jobapplicationdb"

        @Volatile
        private var INSTANCE: JobApplicationDatabase? = null

        fun getInstance(context: Context): JobApplicationDatabase {
            synchronized(this) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        JobApplicationDatabase::class.java,
                        DATABASE_NAME
                    )
                        .build()
                }
                return INSTANCE!!
            }
        }
    }
}
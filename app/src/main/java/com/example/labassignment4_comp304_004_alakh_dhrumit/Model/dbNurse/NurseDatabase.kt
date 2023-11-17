package com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbNurse

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Nurse::class], version = 1, exportSchema = false)
abstract class NurseDatabase : RoomDatabase() {
    abstract fun nurseDao(): NurseDao

    companion object {
        @Volatile
        private var INSTANCE: NurseDatabase? = null

        fun getInstance(context: Context): NurseDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NurseDatabase::class.java,
                    "nurse_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}


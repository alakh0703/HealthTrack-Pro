package com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbPatient

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//@Database(entities = [PatientDb::class], version = 1, exportSchema = false)
//abstract class PatientDatabase : RoomDatabase() {
//    abstract fun patientDao(): PatientDao
//
//    companion object {
//        @Volatile
//        private var INSTANCE: PatientDatabase? = null
//        fun getInstance(context: Context): PatientDatabase {
//            synchronized(this) {
//                var instance = INSTANCE
//                if (instance == null) {
//                    instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        PatientDatabase::class.java,
//                        "patient_data_database"
//                    ).build()
//                }
//                return instance
//            }
//        }
//    }
//}

@Database(entities = [Patient::class], version = 1, exportSchema = false)
abstract class PatientDatabase : RoomDatabase() {
    abstract fun patientDao(): PatientDao

    companion object {
        @Volatile
        private var INSTANCE: PatientDatabase? = null

        fun getInstance(context: Context): PatientDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PatientDatabase::class.java,
                    "patient_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}


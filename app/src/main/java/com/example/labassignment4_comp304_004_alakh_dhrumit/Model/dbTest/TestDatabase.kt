package com.example.labassignment4_comp304_004_alakh_dhrumit.Model.dbTest

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Test::class], version = 1, exportSchema = false)
abstract class TestDatabase : RoomDatabase() {

    abstract fun testDao(): TestDao

    companion object {
        @Volatile
        private var INSTANCE: TestDatabase? = null
        fun getInstance(context: Context): TestDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        TestDatabase::class.java,
                        "test_data_database"
                    ).build()
                }
                return instance
            }
        }
    }
}

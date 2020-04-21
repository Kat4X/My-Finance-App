package com.kat4x.myfinanceapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kat4x.myfinanceapp.db.dao.CardDao
import com.kat4x.myfinanceapp.model.entity.PayCardEntity

@Database(entities = [PayCardEntity::class], version = 1)
abstract class UserRoomDatabase : RoomDatabase() {

    abstract fun cardDao(): CardDao

    companion object {

        @Volatile
        private var INSTANCE: UserRoomDatabase? = null

        operator fun invoke(context: Context): UserRoomDatabase {
            return INSTANCE
                ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                        context.applicationContext,
                        UserRoomDatabase::class.java,
                        "user_database"
                    )
                    .build().also { INSTANCE = it }
            }
        }


    }
}
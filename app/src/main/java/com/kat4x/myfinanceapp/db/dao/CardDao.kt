package com.kat4x.myfinanceapp.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kat4x.myfinanceapp.model.entity.PayCardEntity


@Dao
interface CardDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun savePayment(payCard: PayCardEntity)

    @Query("SELECT * FROM PayCardEntity")
    suspend fun getAllPayment(): MutableList<PayCardEntity>

}
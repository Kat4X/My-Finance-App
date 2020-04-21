package com.kat4x.myfinanceapp.model.transaction

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var cashReceipts: Boolean = false,
    var name: String = "",
    var dateTime: String = "",
    var amount: Float = 0f
)
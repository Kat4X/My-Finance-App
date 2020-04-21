package com.kat4x.myfinanceapp.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kat4x.myfinanceapp.model.PaymentAccount
import com.kat4x.myfinanceapp.model.PaymentType

@Entity
data class PayCardEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var total: Int = 0,
    var incoming: Boolean = false,
    var name: String = "",
    var type: String = "",
//    var paymentType: PaymentType = PaymentType(""),
//    var account: PaymentAccount = PaymentAccount(""),
    var someNote: String = "",
    var time: String = ""
)
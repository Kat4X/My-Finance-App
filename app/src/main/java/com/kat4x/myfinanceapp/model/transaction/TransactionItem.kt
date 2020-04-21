package com.kat4x.myfinanceapp.model.transaction

data class TransactionItem (
    var id: Int = 0,
    var cashReceipts: Boolean = false,
    var name: String = "",
    var dateTime: String = "",
    var amount: Float = 0f
)
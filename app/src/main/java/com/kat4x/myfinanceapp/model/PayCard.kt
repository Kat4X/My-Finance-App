package com.kat4x.myfinanceapp.model

data class PayCard(
    var total: Int = 0,
    var incoming: Boolean = false,
    var name: String = "",
    var type: String = "",
//    var paymentType: PaymentType = PaymentType(""),
    var account: PaymentAccount = PaymentAccount(""),
    var someNote: String = "",
    var time: String = ""
)

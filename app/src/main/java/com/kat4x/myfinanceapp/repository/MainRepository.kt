package com.kat4x.myfinanceapp.repository

import com.kat4x.myfinanceapp.model.PayCard

interface MainRepository {

    suspend fun savePayment(payCard: PayCard)

    suspend fun getAllPayment(): MutableList<PayCard>

}
package com.kat4x.myfinanceapp.repository

import com.kat4x.myfinanceapp.db.dao.CardDao
import com.kat4x.myfinanceapp.model.PayCard
import com.kat4x.myfinanceapp.util.TypeConverters

class MainRepositoryImpl(
    private val cardDao: CardDao
) : MainRepository {

    override suspend fun savePayment(payCard: PayCard) {
        val payment = TypeConverters.payCardToEntity(payCard)
        cardDao.savePayment(payment)
    }

    override suspend fun getAllPayment(): MutableList<PayCard> {
        return TypeConverters.payEntityToCardList(cardDao.getAllPayment())
    }

}
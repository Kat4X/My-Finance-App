package com.kat4x.myfinanceapp.util

import androidx.room.TypeConverter
import com.kat4x.myfinanceapp.model.PayCard
import com.kat4x.myfinanceapp.model.entity.PayCardEntity

class TypeConverters {

    companion object {

        @TypeConverter
        fun payCardToEntity(payCard: PayCard) : PayCardEntity {
            val entity = PayCardEntity()
            entity.total = payCard.total
            entity.incoming = payCard.incoming
            entity.name = payCard.name
            entity.type = payCard.type
//            entity.paymentType = payCard.paymentType
//            entity.account = payCard.account
            entity.someNote = payCard.someNote
            entity.time = payCard.time
            return entity
        }

        @TypeConverter
        fun payEntityToCard(entity : PayCardEntity) : PayCard {
            val card = PayCard()
            card.total = entity.total
            card.incoming = entity.incoming
            card.name = entity.name
            card.type = entity.type
//            card.paymentType = entity.paymentType
//            card.account = entity.account
            card.someNote = entity.someNote
            card.time = entity.time
            return card
        }

        @TypeConverter
        fun payEntityToCardList(entity : List<PayCardEntity>) : MutableList<PayCard> {
            val cardList: MutableList<PayCard> = mutableListOf()

            entity.forEach {
                val card = PayCard()
                card.total = it.total
                card.incoming = it.incoming
                card.name = it.name
                card.type = it.type
//                card.paymentType = it.paymentType
//                card.account = it.account
                card.someNote = it.someNote
                card.time = it.time
                cardList.add(card)
            }

            return cardList
        }

    }

}
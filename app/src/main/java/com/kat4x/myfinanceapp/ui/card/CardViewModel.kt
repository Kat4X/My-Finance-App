package com.kat4x.myfinanceapp.ui.card

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kat4x.myfinanceapp.App
import com.kat4x.myfinanceapp.model.PayCard
import com.kat4x.myfinanceapp.repository.MainRepository
import com.kat4x.myfinanceapp.repository.MainRepositoryImpl

class CardViewModel(application: Application) : ViewModel() {

    var paymentList: MutableLiveData<MutableList<PayCard>> = MutableLiveData()
    private lateinit var repository: MainRepository

    init {
//        UserRoomDatabase(application).apply {
//            repository = MainRepositoryImpl(cardDao())
//        }
    }
}
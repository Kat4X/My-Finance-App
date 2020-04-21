package com.kat4x.myfinanceapp.ui.card.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kat4x.myfinanceapp.R
import kotlinx.android.synthetic.main.balance_card.view.*

class DemonViewPagerAdapter: RecyclerView.Adapter<DemonViewPagerAdapter.EventViewHolder>() {

    private val cardList = listOf(0, 1, 2)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        return EventViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.balance_card, parent, false))
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.itemView.name_card_bank.text = "Page ${cardList[position]}"
    }

    class EventViewHolder(view: View) : RecyclerView.ViewHolder(view)

}
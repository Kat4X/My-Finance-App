package com.kat4x.myfinanceapp.ui.card.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kat4x.myfinanceapp.R
import com.kat4x.myfinanceapp.model.PaymentCard
import kotlinx.android.synthetic.main.balance_card.view.*
import kotlinx.android.synthetic.main.history_item.view.*

class CardAdapter(
    private val ctx: Context,
    private val interaction: Interaction? = null
) : RecyclerView.Adapter<CardAdapter.ItemViewHolder>() {

    var listCards: MutableList<PaymentCard> = mutableListOf()

    fun submitList(paymentCard: List<PaymentCard>) {
        listCards.clear()
        listCards.addAll(paymentCard)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val card = listCards[position]
        holder.bind(card)

        holder.itemView.setOnClickListener {
            interaction?.onItemSelected(position, card)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.history_item, parent, false)

        return ItemViewHolder(itemView)
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(card: PaymentCard) {
            itemView.name_transaction.text = card.userName
        }
    }

    override fun getItemCount(): Int {
        return listCards.size
    }

    interface Interaction {
        fun onItemSelected(position: Int, item: PaymentCard)
    }
}
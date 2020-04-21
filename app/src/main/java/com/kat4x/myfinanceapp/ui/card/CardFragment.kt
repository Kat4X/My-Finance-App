package com.kat4x.myfinanceapp.ui.card

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayoutMediator

import com.kat4x.myfinanceapp.R
import com.kat4x.myfinanceapp.model.PaymentCard
import com.kat4x.myfinanceapp.ui.card.adapters.CardAdapter
import com.kat4x.myfinanceapp.ui.card.adapters.DemonViewPagerAdapter
import kotlinx.android.synthetic.main.card_fragment.*


class CardFragment : Fragment(), CardAdapter.Interaction {

    private lateinit var cardAdapter: CardAdapter
    private var users: MutableList<PaymentCard> = mutableListOf()
    private lateinit var demonViewPagerAdapter: DemonViewPagerAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.card_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        demonViewPagerAdapter = DemonViewPagerAdapter()

        view_pager2.adapter = demonViewPagerAdapter
        TabLayoutMediator(tabLayout, view_pager2,
            TabLayoutMediator.TabConfigurationStrategy { tab, position -> /*tab.text = "Tab $position"*/ }).attach()


        users.add(PaymentCard("Alex"))
        users.add(PaymentCard("Alex"))
        users.add(PaymentCard("Alex"))
        users.add(PaymentCard("Alex"))
        users.add(PaymentCard("Alex"))
        users.add(PaymentCard("Alex"))

        initUi()
    }

    private fun initUi() {
        history_recycler.apply {
            cardAdapter = CardAdapter(context, this@CardFragment)
            this.layoutManager = LinearLayoutManager(context)
            cardAdapter.submitList(users)
            this.adapter = cardAdapter
        }
    }

    override fun onItemSelected(position: Int, item: PaymentCard) {
        //TODO Not yet implemented
    }

}

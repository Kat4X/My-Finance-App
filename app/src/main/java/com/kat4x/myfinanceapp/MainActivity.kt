package com.kat4x.myfinanceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TabHost
import androidx.navigation.Navigation
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.kat4x.myfinanceapp.ui.card.adapters.DemonViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private lateinit var demonViewPagerAdapter: DemonViewPagerAdapter
//    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
//        when(it.itemId) {
//            R.id.homeFragment ->
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(main_toolbar)

//        demonViewPagerAdapter = DemonViewPagerAdapter()
//
//        view_pager2.adapter = demonViewPagerAdapter
//        TabLayoutMediator(tabLayout, view_pager2,
//            TabLayoutMediator.TabConfigurationStrategy { tab, position -> /*tab.text = "Tab $position"*/ }).attach()

        initBottomNav()
    }

    private fun initBottomNav() {

    }
}

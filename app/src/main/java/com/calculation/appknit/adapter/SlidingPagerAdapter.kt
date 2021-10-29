package com.calculation.appknit.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.calculation.appknit.Tab1Fragment
import com.calculation.appknit.Tab2Fragment

class SlidingPagerAdapter(fragmentManager: FragmentManager?) : FragmentPagerAdapter(fragmentManager!!) {

    private val TITLES = arrayOf("TAB 1", "TAB 2")

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                println("position 0");
                return Tab1Fragment()
            }

            1 -> {
                println("position 1");
                return Tab2Fragment()
            }
            else ->
                return Tab1Fragment()

        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return TITLES[position]
    }

    override fun getCount(): Int {
        return TITLES.size
    }
}
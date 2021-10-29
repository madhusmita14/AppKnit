package com.calculation.appknit.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.calculation.appknit.Tab1Fragment
import com.calculation.appknit.Tab2Fragment

@Suppress("DEPRECATION")
internal class MyAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Tab1Fragment()
            }
            1 -> {
                Tab2Fragment()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}
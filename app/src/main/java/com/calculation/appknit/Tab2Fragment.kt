package com.calculation.appknit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.calculation.appknit.adapter.Tab1Adapter
import com.calculation.appknit.model.ModelTab1

class Tab2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_tab2, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerviewTab2);
        recyclerView.layoutManager = LinearLayoutManager(context)

        val adapter = Tab1Adapter()
        recyclerView.adapter = adapter

        return view
    }
}
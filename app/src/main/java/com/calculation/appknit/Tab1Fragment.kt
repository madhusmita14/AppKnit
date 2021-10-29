package com.calculation.appknit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.calculation.appknit.adapter.RecyclerviewAdapter
import com.calculation.appknit.adapter.Tab1Adapter
import com.calculation.appknit.model.ModelComment
import com.calculation.appknit.model.ModelTab1

class Tab1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_tab1, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerviewTab1);
        recyclerView.layoutManager = LinearLayoutManager(context)
//        val data = ArrayList<ModelTab1>()

//        for(i in 1..3){
//            data.add(ModelTab1(R.drawable.ic_business_img,R.drawable.ic_user_img,"Super market","+11-7647837399","705 W, 9th Street Los Angeles"))
//        }

        val adapter = Tab1Adapter()
        recyclerView.adapter = adapter

        return view
    }
}
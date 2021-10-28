package com.calculation.appknit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.calculation.appknit.adapter.RecyclerviewAdapter
import com.calculation.appknit.model.ModelComment

class CommentsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_comments, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView);
        recyclerView.layoutManager = LinearLayoutManager(context)
        val data = ArrayList<ModelComment>()

        for(i in 1..3){
            data.add(ModelComment(R.drawable.ic_user_img,"Yeshimabeit Milner","Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum is simply dummy text.","6 hrs"))
        }

        val adapter = RecyclerviewAdapter(data)
        recyclerView.adapter = adapter

        return view;
    }
}
package com.calculation.appknit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.calculation.appknit.R
import com.calculation.appknit.model.ModelTab1

class Tab1Adapter: RecyclerView.Adapter<Tab1Adapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val banner: ImageView = itemView.findViewById(R.id.cardBanner)
        val icon: ImageView = itemView.findViewById(R.id.cardIcon)
        val title: TextView = itemView.findViewById(R.id.cardTitle)
        val phoneNumber: TextView = itemView.findViewById(R.id.cardPhoneNumber)
        val location: TextView = itemView.findViewById(R.id.cardLocation)

        fun bind(){
            itemView.apply {
                banner.setImageResource(R.drawable.ic_business_img)
                icon.setImageResource(R.drawable.ic_user_img)
                title.text = "Super market"
                phoneNumber.text = "+11-7647837399"
                location.text = "705 W, 9th Street Los Angeles"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tab1_row_item,parent,false)

        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val model = tabList[position]
//
//        holder.banner.setImageResource(model.banner)
//        holder.title.text = model.title
    }

    override fun getItemCount(): Int {
        return 10
    }
}
package com.calculation.appknit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.calculation.appknit.R
import com.calculation.appknit.model.ModelComment

class RecyclerviewAdapter: RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val img: ImageView = itemView.findViewById(R.id.imgCommentIcon)
        val title: TextView = itemView.findViewById(R.id.tvCardTitle)
        val desc: TextView = itemView.findViewById(R.id.tvCardDesc)
        val time: TextView = itemView.findViewById(R.id.tvCardTime)

        fun bind(){
            itemView.apply {
                img.setImageResource(R.drawable.ic_user_img)
                title.text = "Yeshimabeit Milner"
                desc.text = "Lorem ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum is simply dummy text."
                time.text = "6 hrs"
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerviewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comments_row_item,parent,false)

        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val model = commentList[position]
//
//        holder.img.setImageResource(model.img)
//        holder.title.text = model.title

        holder.bind()
    }

    override fun getItemCount(): Int {
        return 10
    }
}
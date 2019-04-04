package com.zakariahossain.recyclerviewinkotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.zakariahossain.recyclerviewinkotlin.R
import com.zakariahossain.recyclerviewinkotlin.interfaces.MyOnClickListener
import com.zakariahossain.recyclerviewinkotlin.models.Hobby
import kotlinx.android.synthetic.main.item_list.view.*

class HobbiesAdapter(private val context: Context, private val hobbies: List<Hobby>) :
    RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    private var myOnClickListener: MyOnClickListener? = null;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.tvHobby?.text = hobbies[position].title
    }

    override fun getItemCount(): Int = hobbies.size

    fun setMyOnClickListener(myOnClickListener: MyOnClickListener) {
        this.myOnClickListener = myOnClickListener
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                myOnClickListener?.myOnClick(adapterPosition)
            }
        }
    }
}

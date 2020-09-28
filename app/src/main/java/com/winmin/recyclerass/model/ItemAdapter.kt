package com.winmin.recyclerview.model

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.winmin.recyclerass.R
import com.winmin.recyclerass.model.Item
import kotlinx.android.synthetic.main.item_collect.view.*


import java.text.FieldPosition

class ItemAdapter(var flowerlist: ArrayList<Item>) :
    RecyclerView.Adapter<ItemAdapter.FlowerViewHolder>() {
    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(flower: Item) {
            itemView.txtName.text = flower.name
            itemView.txtPrice.text = flower.price.toString()
            itemView.flower.setImageResource(flower.image)
            itemView.txtkg.text = flower.kg.toString()
        }
    }

    override fun getItemCount(): Int = flowerlist.size

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerlist[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_collect, parent, false)
        return FlowerViewHolder(view)
    }

}
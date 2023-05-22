package com.example.walletassessment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class Adapter(val context: Context, val list: List<model>) : RecyclerView.Adapter<Adapter.ItemViewHolder>()  {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var dateAndDay = itemView.findViewById<TextView>(R.id.dayAndDayShow)
        var time = itemView.findViewById<TextView>(R.id.timeShow)
        var amount = itemView.findViewById<TextView>(R.id.amountShow)
        var tramsectionID = itemView.findViewById<TextView>(R.id.transactionIDshow)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val data = list[position]
        holder.dateAndDay.text = data.dayAndDate
        holder.time.text = data.time
        holder.amount.text = data.amount
        holder.tramsectionID.text = data.transactionId
    }
}
package com.example.assignment5


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class myAdapter(val mydata: List<myData>) : RecyclerView.Adapter<myAdapter.MyViewHolder>() {
    class MyViewHolder(val cardView: View): RecyclerView.ViewHolder(cardView){
        val CardImage: ImageView = cardView.findViewById(R.id.cardImage)
        val CardTitle: TextView = cardView.findViewById(R.id.cardTitle)
        val CardText: TextView = cardView.findViewById(R.id.cardText)

        init {
            cardView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_card,
            parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.CardImage.setImageResource(mydata[position].imageNumber)
        holder.CardTitle.text = mydata[position].title
        holder.CardText.text = mydata[position].text
    }

    override fun getItemCount(): Int {
        return(mydata.size)
    }
}
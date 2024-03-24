package com.ayesha.i212457

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class myAdap (list: ArrayList<modelone>, c: Context) : RecyclerView.Adapter<myAdap.MyViewHolder>(){
    var list = list
    var context = c
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v: View = LayoutInflater
            .from(context)
            .inflate(R.layout.rowone, parent, false)
        return MyViewHolder(v)
    }
    override fun getItemCount(): Int {
        return list.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = list.get(position).name
        holder.email.text = list.get(position).email
        holder.phone.text = list.get(position).number
        Picasso.get().load(list.get(position).dp).into(holder.dp)
        holder.name.setOnClickListener {
        }
    }

    class MyViewHolder : RecyclerView.ViewHolder{
        constructor(itemView: View) : super(itemView)
        var roww = itemView.findViewById<LinearLayout>(R.id.roww)
        var dp = itemView.findViewById<ImageView>(R.id.dp)
        var name = itemView.findViewById<TextView>(R.id.name)
        var phone = itemView.findViewById<TextView>(R.id.number)
        var email = itemView.findViewById<TextView>(R.id.email)
    }
}
package com.ayesha.i212457

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (list: ArrayList<Model>, c: Context) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    var list: ArrayList<Model> = list
    var context: Context = c
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v: View = LayoutInflater.from(context).inflate(R.layout.row, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = list.get(position).nametext
        holder.phone.text = list.get(position).descptext
        holder.email.text = list.get(position).statustext

        holder.row.setOnClickListener {
            val intent = Intent(context, barwan::class.java)
            intent.putExtra("name", list.get(position).nametext)
            intent.putExtra("number", list.get(position).descptext)
            intent.putExtra("email", list.get(position).statustext)
            context.startActivity(intent)
        }

        holder.row.setOnLongClickListener()
        {
            Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show()
            deleteContact(holder.adapterPosition)
            true
        }
    }

    private fun deleteContact(adapterPosition: Int) {
        list.removeAt(adapterPosition)
        notifyItemRemoved(adapterPosition)
    }

    class MyViewHolder : RecyclerView.ViewHolder {
        constructor(itemView: View) : super(itemView)

        var row = itemView.findViewById<LinearLayout>(R.id.row)
        var name: TextView = itemView.findViewById<TextView>(R.id.nametext)
        var phone: TextView = itemView.findViewById<TextView>(R.id.descptext)
        var email: TextView = itemView.findViewById<TextView>(R.id.statustext)
        }


}
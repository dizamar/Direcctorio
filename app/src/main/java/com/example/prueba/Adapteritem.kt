package com.example.prueba

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_item.view.*

class Adapteritem(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       return ViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_item,parent,false))
        //return RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
          holder.itemView.txt_item_p1.text = items.get(position)
        //holder?.tvAnimalType?.text = items.get(position)
    }

}
class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val tvAnimalType = view.txt_item_p1
}

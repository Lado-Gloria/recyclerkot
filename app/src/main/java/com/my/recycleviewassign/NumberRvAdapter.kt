package com.my.recycleviewassign
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.Adapter

class NumberRvAdapter(var numbersList: List<Int>): Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_view,parent, false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        val currentNumber = numbersList.get(position)
        holder.rvnumber
        holder.rvnumber.text = currentNumber.toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }
}



class NumbersViewHolder(itemView: View): ViewHolder(itemView){
    var rvnumber = itemView.findViewById<TextView>(R.id.rvnumber)
}






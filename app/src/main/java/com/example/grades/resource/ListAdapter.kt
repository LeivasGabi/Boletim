package com.example.grades.resource

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grades.R
import com.example.grades.model.Students
import kotlinx.android.synthetic.main.res_list_layout.view.*

class ListAdapter(val listParent: List<Students>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_list_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ListViewHolder -> {
                holder.itemView.textViewStudentName.text = listParent[position].name
                holder.itemView.recyclerViewSon.apply {
                    adapter = ListChildAdapter(listParent[position].grades)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return listParent.size
    }

    class ListViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView)
}
package com.example.grades.resource

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grades.R
import com.example.grades.model.Grades
import kotlinx.android.synthetic.main.res_son_layout.view.*

class ListChildAdapter (val listChild: List<Grades>) : RecyclerView.Adapter<ListChildAdapter.ListChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListChildViewHolder {
        return ListChildViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_son_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListChildViewHolder, position: Int) {
        holder.itemView.textViewSubject.text = listChild[position].subjects
        holder.itemView.textViewGradeOne.text = listChild[position].gradeFirst.toString()
        holder.itemView.textViewGradeTwo.text = listChild[position].gradeSecond.toString()
        holder.itemView.textViewGradeThree.text = listChild[position].gradeThird.toString()
        holder.itemView.textViewGradeFour.text = listChild[position].gradeForth.toString()
    }

    override fun getItemCount(): Int {
        return listChild.size
    }

    class ListChildViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView)
}
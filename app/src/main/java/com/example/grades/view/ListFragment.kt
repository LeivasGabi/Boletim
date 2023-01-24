package com.example.grades.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grades.R
import com.example.grades.model.Grades
import com.example.grades.model.Students
import com.example.grades.resource.ListAdapter
import kotlinx.android.synthetic.main.fragment_list.*


class ListFragment : Fragment(R.layout.fragment_list) {

    private val args: ListFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
    }

    private fun setAdapter() {

        recyclerView.apply {
            adapter = ListAdapter(setList())
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun setList() : List<Students> {
        val students = ArrayList<Students>()
        students.add(args.students)
        return students
    }
}
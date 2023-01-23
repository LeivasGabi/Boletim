package com.example.grades.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.grades.R
import com.example.grades.model.Grades
import com.example.grades.model.Students
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment(R.layout.fragment_register) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newStudent()
    }

    private fun newStudent() {
        buttonSave.setOnClickListener {
            val name = editTextStudentName.text.toString()
            val subject = editTextSubject.text.toString()
            val gradeOne = editTextGradeFirst.text.toString().toFloat()
            val gradeTwo = editTextGradeSecond.text.toString().toFloat()
            val gradeThree = editTextGradeThird.text.toString().toFloat()
            val gradeFour = editTextGradeFourth.text.toString().toFloat()

            val student = Students(
                name,
                listGrades(
                    Grades(
                        subject,
                        gradeOne,
                        gradeTwo,
                        gradeThree,
                        gradeFour
                    )
                )
            )
            val action = RegisterFragmentDirections.actionRegisterFragmentToHomeFragment2(
                student
            )
            findNavController().navigate(action)
        }
    }

    fun listGrades(grades: Grades): List<Grades> {
        var list = ArrayList<Grades>()
        list.add(grades)
        return list
    }
}
package com.example.grades.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        val name = editTextStudentName.toString()
        val subject = editTextSubject.toString()
        val gradeOne = editTextGradeFirst.toString().toFloat()
        val gradeTwo = editTextGradeSecond.toString().toFloat()
        val gradeThree = editTextGradeThird.toString().toFloat()
        val gradeFour = editTextGradeFourth.toString().toFloat()

        val student = Students(
            name = name,
            Grades(
                subject,
                gradeOne,
                gradeTwo,
                gradeThree,
                gradeFour
            )
        )
        val action = RegisterFragmentDirections.actionRegisterFragmentToHomeFragment2(
            student
        )
        findNavController().navigate(action)
    }
}
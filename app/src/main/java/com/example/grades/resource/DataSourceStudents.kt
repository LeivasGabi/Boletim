package com.example.grades.resource

import com.example.grades.model.Students


class DataSourceStudents {
    companion object {
        fun studentsList(students: Students) : List<Students> {
            return listOf(students)
        }
    }
}
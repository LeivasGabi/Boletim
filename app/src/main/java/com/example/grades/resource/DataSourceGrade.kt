package com.example.grades.resource

import com.example.grades.model.Grades


class DataSourceGrade {
    companion object {
        fun list(grades: Grades) : List<Grades> {
            return listOf(grades)
        }
    }
}
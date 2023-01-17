package com.example.grades.model

import java.io.Serializable

data class Students(
    var name: String,
    var grades: Grades
): Serializable

package com.example.grades.model

import java.io.Serializable

data class Grades(
    var subjects: String,
    var gradeFirst: Float,
    var gradeSecond: Float,
    var gradeThird: Float,
    var gradeForth: Float
): Serializable

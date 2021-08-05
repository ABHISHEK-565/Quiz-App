package com.example.quizapp

enum class QuestionType {
    Text,
    Radio,
    CheckBox,
    ChipGroup
}

data class Question(val id: Int, val type: QuestionType, val qText: String,
                    val options: List<String>?, val answers: List<String>)
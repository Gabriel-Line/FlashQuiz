package com.example.flashquiz

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardQuestion = findViewById<TextView>(R.id.card_question)
        val cardAnswer = findViewById<TextView>(R.id.card_answer)

        // Cliquer sur la question révèle la réponse
        cardQuestion.setOnClickListener {
            cardQuestion.visibility = View.INVISIBLE
            cardAnswer.visibility = View.VISIBLE
        }

        // Cliquer sur la réponse réaffiche la question
        cardAnswer.setOnClickListener {
            cardAnswer.visibility = View.INVISIBLE
            cardQuestion.visibility = View.VISIBLE
        }
    }
}

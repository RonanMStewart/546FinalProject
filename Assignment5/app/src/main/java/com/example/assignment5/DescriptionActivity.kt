package com.example.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView

class DescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val CardImage: ImageView = findViewById(R.id.cardImage)
        CardImage.setImageResource(R.drawable.akiri)
        val CardTitle: TextView = findViewById(R.id.cardTitle)
        CardTitle.setText("Akiri, Line Slinger")
        val CardText: TextView = findViewById(R.id.cardText)
        CardText.setText("Gains power from artifacts")
        val Description: TextView = findViewById(R.id.Description)
        Description.setText(getString(R.string.Silas_Akiri))
    }
}
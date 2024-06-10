package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class weather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weather)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        data class Weather(
            val day: String,
            val minTemp: Int,
            val maxTemp: Int,
            val condition: String
        )

        val weatherData = arrayOf(
            Weather("Monday", 12, 25, "Sunny"),
            Weather("Tuesday", 15, 29, "Sunny"),
            Weather("Wednesday", 14, 30, "Sunny"),
            Weather("Thursday", 15, 28, "Sunny"),
            Weather("Friday", 13, 27, "Overcast"),
            Weather("Saturday", 10, 18, "Rainy"),
            Weather("Sunday", 10, 16, "Cold")
        )

        fun calculateAverageTemperature(weatherData: Array<Weather>): Double {
            val totalTemp = weatherData.sumOf { it.minTemp + it.maxTemp }
            val totalEntries = weatherData.size * 2 // since we're considering both min and max temps
            return totalTemp.toDouble() / totalEntries
        }

    }
}
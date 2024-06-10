//https://github.com/EzraZRNaid00/imadpracticum.git
package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val weekWeather = arrayOf(
        Weather("Monday", 12, 25, "sunny"),
        Weather("Tuesday", 15, 29, "sunny"),
        Weather("Wednesday", 14, 30, "sunny"),
        Weather("Thursday", 15, 28, "sunny"),
        Weather("Friday", 13, 27, "overcast"),
        Weather("Saturday", 10, 18, "rainy"),
        Weather("Sunday", 10, 16, "cold")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val averageTemperature = calculateAverageTemperature(weekWeather)
        val tvAverageTemperature: TextView = findViewById(R.id.tvAverageTemperature)
        tvAverageTemperature.text = "Average Temperature: $averageTemperature°C"

        val btnViewDetails: Button = findViewById(R.id.btnViewDetails)
        btnViewDetails.setOnClickListener {
            val intent = Intent(this, activity::class.java)
            intent.putExtra("weekWeather", weekWeather)
            startActivity(intent)
        }
    }

    private fun calculateAverageTemperature(weekWeather: Array<Weather>): Double {
        var totalMinTemp = 0
        var totalMaxTemp = 0

        for (weather in weekWeather) {
            data class Weather(
                val day: String,
                val minTemp: Int,
                val maxTemp: Int,
                val condition: String)

            totalMinTemp += minTemp
            totalMaxTemp += maxTemp
        }
        val avgMinTemp = totalMinTemp / weekWeather.size.toDouble()
        val avgMaxTemp = totalMaxTemp / weekWeather.size.toDouble()
        return (avgMinTemp + avgMaxTemp) / 2
    }
}

class activity {

}

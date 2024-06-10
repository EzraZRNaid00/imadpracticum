package com.example.weatherapp

class Weather(s: String, i: Int, i1: Int, s1: String) {
    data class Weather(
        val day: String,
        val minTemp: Int,
        val maxTemp: Int,
        val condition: String
    )

}

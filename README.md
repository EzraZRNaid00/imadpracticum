Start

Define Data Model
1.1. Create Weather data class
- Encapsulate properties:
- day: String
- minTemp: Int
- maxTemp: Int
- condition: String

Define Week Weather Data
2.1. Create WeatherRepository object
- Encapsulate weekWeather array containing weather data for each day of the week.
- Provide method getWeekWeather(): Array<Weather>

MainActivity
3.1. Define MainActivity class inheriting from AppCompatActivity
- Encapsulate properties and methods:
- weekWeather: Array<Weather>
- onCreate method
3.1.1. Set content view to activity_main
3.1.2. Initialize tvAverageTemperature as a TextView
3.1.3. Retrieve weekWeather using WeatherRepository.getWeekWeather()
3.1.4. Calculate average temperature by calling calculateAverageTemperature
3.1.5. Set text of tvAverageTemperature to display the average temperature
3.1.6. Initialize btnViewDetails as a Button
3.1.7. Set an OnClickListener on btnViewDetails to navigate to DetailActivity
3.1.7.1. Create an Intent to start DetailActivity
3.1.7.2. Put weekWeather array in the Intent
3.1.7.3. Start DetailActivity
- calculateAverageTemperature method
3.1.8. Initialize totalMinTemp and totalMaxTemp to 0
3.1.9. Iterate over each Weather object in weekWeather
3.1.9.1. Add minTemp to totalMinTemp
3.1.9.2. Add maxTemp to totalMaxTemp
3.1.10. Calculate avgMinTemp as totalMinTemp divided by the number of elements in weekWeather
3.1.11. Calculate avgMaxTemp as totalMaxTemp divided by the number of elements in weekWeather
3.1.12. Return the average of avgMinTemp and avgMaxTemp

DetailActivity
4.1. Define DetailActivity class inheriting from AppCompatActivity
- Encapsulate properties and methods:
- onCreate method
4.1.1. Set content view to activity_detail
4.1.2. Retrieve weekWeather array from the Intent
4.1.3. Initialize lvWeatherDetails as a ListView
4.1.4. Map weekWeather to a list of strings containing detailed weather information for each day
4.1.5. Create an ArrayAdapter with the mapped list
4.1.6. Set the adapter to lvWeatherDetails

Layouts
5.1. Design activity_main.xml layout
5.1.1. Add a TextView with ID tvAverageTemperature for displaying average temperature
5.1.2. Add a Button with ID btnViewDetails for navigating to the detailed view
5.2. Design activity_detail.xml layout
5.2.1. Add a ListView with ID lvWeatherDetails for displaying detailed weather information

End# imadpracticum

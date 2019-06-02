package com.neal.HeadFirstPractise.observer.weather;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay d1 =new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay d2 =new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay d3 =new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasureMents(11, 22, 33);
		weatherData.setMeasureMents(44, 55, 66);
		weatherData.setMeasureMents(77, 88, 99);
	}
}

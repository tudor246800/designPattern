package com.neal.HeadFirstPractise.observerUtil;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}

	}

	public void update(float temp, float humidity, float pressure) {

	}

	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "CurrentConditionsDisplay [temperature=" + temperature + ", humidity=" + humidity + ", pressure="
				+ pressure + "]";
	}

}

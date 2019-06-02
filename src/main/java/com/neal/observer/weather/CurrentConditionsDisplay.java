package com.neal.HeadFirstPractise.observer.weather;

import com.neal.HeadFirstPractise.observer.Observer;
import com.neal.HeadFirstPractise.observer.ObserverParam;
import com.neal.HeadFirstPractise.observer.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();

	}

	// public void update(ObserverParam param) {
	// ConditionDisplayParam conditionDisplayParam = (ConditionDisplayParam)
	// param;
	// this.temperature = conditionDisplayParam.getTemperature();
	// this.humidity = conditionDisplayParam.getHumidity();
	// this.pressure = conditionDisplayParam.getPressure();
	// display();
	// }

	public void display() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "CurrentConditionsDisplay [temperature=" + temperature + ", humidity=" + humidity + ", pressure="
				+ pressure + "]";
	}

}

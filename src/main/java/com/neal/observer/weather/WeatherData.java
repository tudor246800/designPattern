package com.neal.HeadFirstPractise.observer.weather;

import java.util.ArrayList;

import com.neal.HeadFirstPractise.observer.Observer;
import com.neal.HeadFirstPractise.observer.Subject;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		if (observers.indexOf(o) >= 0)
			observers.remove(o);
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	};

	public void measureMentsChanged() {
		notifyObservers();
	}

	public void setMeasureMents(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measureMentsChanged();
	}

	void getTemperature() {
	};

	void getHumidity() {
	};

	void getPressure() {
	};

}

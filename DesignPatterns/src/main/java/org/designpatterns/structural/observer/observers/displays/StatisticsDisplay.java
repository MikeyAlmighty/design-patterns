package org.designpatterns.structural.observer.observers.displays;

import org.designpatterns.structural.observer.observers.DisplayElement;
import org.designpatterns.structural.observer.observers.Observer;
import org.designpatterns.structural.observer.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Weather Stats: " + temperature + "C, humidity: " + humidity + "%" + ", Pressure: " + pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}

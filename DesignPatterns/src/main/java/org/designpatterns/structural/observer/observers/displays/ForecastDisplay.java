package org.designpatterns.structural.observer.observers.displays;

import org.designpatterns.structural.observer.observers.DisplayElement;
import org.designpatterns.structural.observer.observers.Observer;
import org.designpatterns.structural.observer.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + temperature + "C, humidity: " + humidity + "%" + ", Pressure: " + pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        this.humidity = weatherData.getHumidity();
        display();
    }
}

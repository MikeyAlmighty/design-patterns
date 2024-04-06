package org.designpatterns.structural.observer.observers.displays;

import org.designpatterns.structural.observer.observers.DisplayElement;
import org.designpatterns.structural.observer.observers.Observer;
import org.designpatterns.structural.observer.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
       this.weatherData  = weatherData;
       weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "C, humidity: " + humidity + "%");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}

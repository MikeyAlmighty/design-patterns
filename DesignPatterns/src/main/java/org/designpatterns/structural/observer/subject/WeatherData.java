package org.designpatterns.structural.observer.subject;

import org.designpatterns.structural.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
           observer.update();
        }
    }

    /*
     * This method gets called whenever the weather measurements have been updated
     */
    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementChanged();
    }
}

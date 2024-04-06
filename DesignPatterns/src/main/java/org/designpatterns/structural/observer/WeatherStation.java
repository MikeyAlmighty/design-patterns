package org.designpatterns.structural.observer;

import org.designpatterns.structural.observer.observers.displays.CurrentConditionsDisplay;
import org.designpatterns.structural.observer.observers.displays.ForecastDisplay;
import org.designpatterns.structural.observer.observers.displays.StatisticsDisplay;
import org.designpatterns.structural.observer.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(23,3, 23);
        weatherData.setMeasurements(20,10, 3);
        weatherData.setMeasurements(13,9, 2);
    }
}

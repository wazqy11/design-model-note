package com.djq.code.observer.impl;

import com.djq.code.observer.DisplayElement;
import com.djq.code.observer.Observer;
import com.djq.code.observer.subject.impl.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        // 这样可以增大观察者的灵活性
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getTemperature();
    }

    public void display() {
        System.out.println("CurrentConditions: "+temperature+"F degree and"+humidity+"% humidity");
    }
}

package com.djq.code.observer.subject.impl;

import com.djq.code.observer.Observer;
import com.djq.code.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        temperature = 0f;
        humidity = 0f;
        pressure = 0f;
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserve(Observer o) {
        observers.remove(o);
    }

    public void notifyObserve() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObserve();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
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
}

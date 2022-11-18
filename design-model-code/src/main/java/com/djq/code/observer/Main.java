package com.djq.code.observer;

import com.djq.code.observer.impl.CurrentConditionsDisplay;
import com.djq.code.observer.subject.impl.WeatherData;

public class Main {
    public static void main(String[] args) {
        // 创建一个气象站
        WeatherData weatherData = new WeatherData();

        // 注册一个观察者
        CurrentConditionsDisplay display1 = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay display2 = new CurrentConditionsDisplay(weatherData);
        display1.display();
        display2.display();

        // 改变气象站的数据
        weatherData.removeObserve(display2);
        weatherData.setMeasurements(1,2,3);
        display1.display();
        display2.display();

    }
}

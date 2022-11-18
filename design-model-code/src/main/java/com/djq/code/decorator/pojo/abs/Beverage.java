package com.djq.code.decorator.pojo.abs;

public abstract class Beverage {
    public String description = "Unknown description";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}

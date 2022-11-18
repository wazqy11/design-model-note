package com.djq.code.decorator.pojo.abs;

public abstract class CondimentDecorator extends Beverage{
    public Beverage beverage;
    public abstract String getDescription();
}

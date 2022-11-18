package com.djq.code.decorator.pojo.decors;

import com.djq.code.decorator.pojo.abs.Beverage;
import com.djq.code.decorator.pojo.abs.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){
        this.beverage = beverage;

    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }
}

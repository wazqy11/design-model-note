package com.djq.code.decorator.pojo.coff;

import com.djq.code.decorator.pojo.abs.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1d;
    }

}
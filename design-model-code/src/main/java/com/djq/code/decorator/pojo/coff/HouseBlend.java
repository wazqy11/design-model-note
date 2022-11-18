package com.djq.code.decorator.pojo.coff;

import com.djq.code.decorator.pojo.abs.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 2d;
    }
}

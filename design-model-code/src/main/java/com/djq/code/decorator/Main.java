package com.djq.code.decorator;

import com.djq.code.decorator.pojo.abs.Beverage;
import com.djq.code.decorator.pojo.coff.Espresso;
import com.djq.code.decorator.pojo.decors.Mocha;

public class Main {
    public static void main(String[] args) {
        // 首先定义一杯咖啡
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()+" "+espresso.cost());

        // 加调料
        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);

        System.out.println(espresso.getDescription()+" "+espresso.cost());
    }
}

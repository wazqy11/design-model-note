package com.djq.code.strategy.pojo;

import com.djq.code.strategy.behaviors.flybehaviors.impl.FlyWithRocketImpl;
import com.djq.code.strategy.behaviors.quackbehaviors.impl.QuackNoWayImpl;
import com.djq.code.strategy.pojo.Duck;

public class RocketDuck extends Duck {
    public RocketDuck(){
        quackBehavior = new QuackNoWayImpl();
        flyBehavior = new FlyWithRocketImpl();
    }

    @Override
    public void display() {
        System.out.println("我是火箭鸭，给老铁们刷火箭");
    }
}

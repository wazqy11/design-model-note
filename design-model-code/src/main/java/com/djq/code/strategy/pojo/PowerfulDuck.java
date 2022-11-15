package com.djq.code.strategy.pojo;

import com.djq.code.strategy.behaviors.flybehaviors.impl.FlyNoWayImpl;
import com.djq.code.strategy.behaviors.quackbehaviors.impl.QuackNoWayImpl;
import com.djq.code.strategy.pojo.Duck;

public class PowerfulDuck extends Duck {
    public PowerfulDuck(){
        quackBehavior = new QuackNoWayImpl();
        flyBehavior = new FlyNoWayImpl();
    }

    @Override
    public void display() {
        System.out.println("我是一只万能的鸭子");
    }
}

package com.djq.code.strategy.behaviors.flybehaviors.impl;

import com.djq.code.strategy.behaviors.flybehaviors.FlyBehavior;

public class FlyNoWayImpl implements FlyBehavior {
    public void fly() {
        System.out.println("我不能飞");
    }
}

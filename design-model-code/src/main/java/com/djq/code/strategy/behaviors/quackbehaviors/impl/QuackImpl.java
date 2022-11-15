package com.djq.code.strategy.behaviors.quackbehaviors.impl;

import com.djq.code.strategy.behaviors.quackbehaviors.QuackBehavior;

public class QuackImpl implements QuackBehavior {
    public void quack() {
        System.out.println("我会嘎嘎叫");
    }
}

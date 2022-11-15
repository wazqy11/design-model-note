package com.djq.code.strategy.behaviors.quackbehaviors.impl;

import com.djq.code.strategy.behaviors.quackbehaviors.QuackBehavior;

public class QuackNoWayImpl implements QuackBehavior {
    public void quack() {
        System.out.println("我叫不出来");
    }
}

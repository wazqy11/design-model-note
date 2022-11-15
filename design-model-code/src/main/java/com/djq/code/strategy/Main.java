package com.djq.code.strategy;

import com.djq.code.strategy.behaviors.flybehaviors.impl.FlyFastImpl;
import com.djq.code.strategy.behaviors.flybehaviors.impl.FlyWithRocketImpl;
import com.djq.code.strategy.behaviors.quackbehaviors.impl.QuackImpl;
import com.djq.code.strategy.pojo.PowerfulDuck;
import com.djq.code.strategy.pojo.RocketDuck;

public class Main {
    public static void main(String[] args) {
        // 测试一个火箭鸭
        System.out.println("----------------火箭鸭----------------");
        RocketDuck rocketDuck = new RocketDuck();
        rocketDuck.display();
        rocketDuck.performFly();
        rocketDuck.performQuack();

        // 测试万能鸭
        System.out.println("----------------万能鸭------------------");
        PowerfulDuck powerfulDuck = new PowerfulDuck();
        powerfulDuck.display();
        powerfulDuck.performQuack();
        powerfulDuck.performFly();

        System.out.println();
        System.out.println("赋予新的飞行方式:");
        powerfulDuck.setFlyBehavior(new FlyFastImpl());
        powerfulDuck.performFly();
        System.out.println("赋予新的飞行方式:");
        powerfulDuck.setFlyBehavior(new FlyWithRocketImpl());
        powerfulDuck.performFly();

        System.out.println();
        System.out.println("赋予嘎嘎叫:");
        powerfulDuck.setQuackBehavior(new QuackImpl());
        powerfulDuck.performQuack();
    }
}

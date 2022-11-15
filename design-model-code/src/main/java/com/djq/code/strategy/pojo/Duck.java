package com.djq.code.strategy.pojo;

import com.djq.code.strategy.behaviors.flybehaviors.FlyBehavior;
import com.djq.code.strategy.behaviors.quackbehaviors.QuackBehavior;

public abstract class Duck {
    /**
     * 将子类变化较多的行为抽象出来
     * 设计原则：
     *  1.识别应用中变化的方面，把他们变和不变的方面分开
     *  2.针对接口编程，而不是针对实现编程
     *  3.优先使用组合而不是继承
     */
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * 所有子类都有
     * 且相同的行为
     */
    public void swim(){
        System.out.println("所有鸭子都会游泳");
    }

    /**
     * 所有子类都有
     * 但各不相同的行为
     * 需要去自己实现
     */
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }



    /**
     * 增加运行时改变行为的能力
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}

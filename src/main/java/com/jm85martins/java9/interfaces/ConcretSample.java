package com.jm85martins.java9.interfaces;

/**
 * Created by jorgemartins on 22/08/2017.
 */
interface SampleInterface {
    private String getValue(){
        return "I'm a private method in an interface!";
    }

    default String sayHey(){
        return "Hey: ".concat(getValue());
    }
}

public class ConcretSample implements SampleInterface {
    public void play(){
        System.out.println(this.sayHey());
    }
}

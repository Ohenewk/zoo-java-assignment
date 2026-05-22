package com.ing.zoo.animals;

import com.ing.zoo.behaviours.Carnivore;

public class Lion extends Animal implements Carnivore {
    public String helloText;
    public String eatText;

    public Lion() {
    }

    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}

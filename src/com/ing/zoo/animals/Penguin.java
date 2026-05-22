package com.ing.zoo.animals;

import com.ing.zoo.behaviours.Carnivore;
import com.ing.zoo.behaviours.TrickPerformer;

import java.util.Random;

public class Penguin extends Animal implements Carnivore, TrickPerformer {
    public String helloText;
    public String eatText;
    public String trick;
    @Override
    public void sayHello() {
        helloText = "NOOT! NOOT!";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "swallow swallow FIIIISH";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "belly slide";
        } else {
            trick = "body slam";
        }
        System.out.println(trick);
    }
}

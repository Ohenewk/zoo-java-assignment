package com.ing.zoo;

public class TyrannosaurusRex extends Animal implements Carnivore {
    public String helloText;
    public String eatText;
    @Override
    public void sayHello() {
        helloText = "ROOOOAAAAARRRR!";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "crunch crunch delicious I fancy another one mate";
        System.out.println(eatText);
    }
}

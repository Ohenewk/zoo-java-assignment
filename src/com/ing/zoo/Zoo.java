package com.ing.zoo;

/**
 * Developed by Kingsley on 22/05/2026.
 */

import com.ing.zoo.animals.*;
import com.ing.zoo.behaviours.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Penguin rico = new Penguin();
        rico.name = "rico";
        TyrannosaurusRex jeff = new TyrannosaurusRex();
        jeff.name = "jeff";

        Animal[] animals = {henk, elsa, dora, wally, marty, rico, jeff};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        // Alle dieren zeggen hallo, zodra commands 0 true is! Hun namen worden ook weergeven.
        if (input.equals(commands[0])) {
            for (Animal animal : animals) {
                System.out.print(animal.name + ": ");
                animal.sayHello();
            }

            // Laat alleen het opgegeven dier hallo zeggen.
        } else if (input.startsWith("hello ")) {
            String name = input.substring("hello ".length()).toLowerCase();
            switch (name) {

                case "henk":
                    System.out.print(henk.name + ": ");
                    henk.sayHello();
                    break;
                case "elsa":
                    System.out.print(elsa.name + ": ");
                    elsa.sayHello();
                    break;
                case "dora":
                    System.out.print(dora.name + ": ");
                    dora.sayHello();
                    break;
                case "wally":
                    System.out.print(wally.name + ": ");
                    wally.sayHello();
                    break;
                case "marty":
                    System.out.print(marty.name + ": ");
                    marty.sayHello();
                    break;
                case "rico":
                    System.out.print(rico.name + ": ");
                    rico.sayHello();
                    break;
                case "jeff":
                    System.out.print(jeff.name + ": ");
                    jeff.sayHello();
                    break;
                default:
                    System.out.println("Unknown animal: " + name);
                    break;
            }
            // Laat alle dieren die bladeren kunnen eten reageren.
        } else if (input.equals(commands[1])) {
            for (Animal animal : animals) {
                if (animal instanceof Herbivore) {
                    System.out.print(animal.name + ": ");
                    ((Herbivore) animal).eatLeaves();
                }
            }
            // Laat alle dieren die vlees kunnen eten reageren.
        } else if (input.equals(commands[2])) {
            for (Animal animal : animals) {
                if (animal instanceof Carnivore) {
                    System.out.print(animal.name + ": ");
                    ((Carnivore) animal).eatMeat();
                }
            }
            // Laat alle dieren die een trucje kunnen doen reageren.
        } else if (input.equals(commands[3])) {
            for (Animal animal : animals) {
                if (animal instanceof TrickPerformer) {
                    System.out.print(animal.name + ": ");
                    ((TrickPerformer) animal).performTrick();
                }
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}

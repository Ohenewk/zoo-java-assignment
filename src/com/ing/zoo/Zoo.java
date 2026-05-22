package com.ing.zoo;

/**
 * Developed by Kingsley on 22/05/2026.
 */

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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        // Alle dieren zeggen hallo, zodra commands 0 true is! Hun namen worden ook weergeven.
        if (input.equals(commands[0])) {
            System.out.print(henk.name + ": ");
            henk.sayHello();
            System.out.print(elsa.name + ": ");
            elsa.sayHello();
            System.out.print(dora.name + ": ");
            dora.sayHello();
            System.out.print(wally.name + ": ");
            wally.sayHello();
            System.out.print(marty.name + ": ");
            marty.sayHello();
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}

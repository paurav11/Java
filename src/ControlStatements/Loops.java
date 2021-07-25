package ControlStatements;

public class Loops {
    public static void main(String[] args) {
        /* loops are used to execute a set of instructions/functions repeatedly
        when some conditions become true.
         */

        // for loop (Entry controlled)
        for (int i=1; i<10; i++) {
            if (i>5) {
                continue; // continue keyword is used to skip the statements below it
            }
            System.out.println(i);
        }

        // Nested for loops
        for (int i=1; i<5; i++) {
            for (int j=i; j<4; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }

        int i=0;
        // while loop (Entry controlled)
        System.out.println("while loop...");
        while (i!=10) {
            System.out.println("hello " + i);
            i++;
        }

        // Infinite while loop
        System.out.println("infinite while loop...");
        while (true) {
            int j = (int)(Math.random()*(10-1) + 1);
            System.out.println(j);
            if (j==5) {
                System.out.println("loop terminated.");
                break; // break keyword helps to exit any loop anytime
            }
        }

        int z = 10;
        // do-while loop (Executed at least once) (Exit controlled)
        System.out.println("do while...");
        do {
            System.out.println(z);
            z--;
        } while (z!=3);
    }
}

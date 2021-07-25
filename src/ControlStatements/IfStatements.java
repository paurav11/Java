package ControlStatements;

public class IfStatements {
    public static void main(String[] args) {
        // If statement is used to test the condition. It checks boolean condition: true or false

        int a = (int)(Math.random()*(10-1)+1);
        System.out.println("a = " + a);
        // If statement
        if (a>5) {
            System.out.println("a is greater than 5.");
        }

        int b = (int)(Math.random()*(10-1)+1);
        System.out.println("b = " + b);
        // If-else statement
        if (b<5) {
            System.out.println("b is less than 5.");
        } else {
            System.out.println("b is greater than or equal to 5.");
        }

        int c = (int)(Math.random()*(10-1)+1);
        System.out.println("c = " + c);
        // If-else-if ladder
        if (c>=7) {
            System.out.println("c is greater than or equal to 7.");
        } else if (c<=3){
            System.out.println("c is less than or equal to 3.");
        } else {
            System.out.println("c is greater than 3 and less than 7.");
        }

        int d = (int)(Math.random()*(10-1)+1);
        System.out.println("d = " + d);
        // Nested-if statement
        if (d>5) {
            if (d>7) {
                System.out.println("d is greater than 7.");
            } else {
                System.out.println("d is greater than 5 and less than 7.");
            }
        } else {
            System.out.println("d is less than or equal to 5.");
        }
    }
}

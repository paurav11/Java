package Basics.Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isMale = true;
        boolean isFemale = true;
        int toss = (int)(Math.random()*(3-1) + 1);
        System.out.println("toss = " + toss);
        switch(toss) {
            case 1: isFemale = false;
                    break;
            case 2: isMale = false;
                    break;
        }
        int age = (int)(Math.random()*(50-1)+1);
        System.out.println("age = " + age);

        // Logical AND operator
        if (isMale && age>=18) {
            System.out.println("The candidate is a male and an adult.");
        } else if (isFemale && age>=18){
            System.out.println("The candidate is a female and an adult.");
        } else {
            System.out.println("Candidate is not an adult.");
        }

        // Logical OR operator
        if (isMale || age>=18) {
            System.out.println("The candidate is either a male or an adult.");
        } else if (isFemale || age>=18){
            System.out.println("The candidate is either a female or an adult.");
        } else {
            System.out.println("Candidate is neither of them.");
        }

        // Logical NOT operator
        boolean isFalse = true;
        boolean isTrue = false;
        System.out.println(!isFalse);
        System.out.println(!isTrue);
    }
}

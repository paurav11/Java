package Basics;
import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String[] args) {

        /*Random numbers are the numbers that use a large set of numbers and selects a number using the mathematical
         algorithm.
        It satisfies the following two conditions:
            The generated values uniformly distributed over a definite interval.
            It is impossible to guess the future value based on current and past values.*/

        // 1. Using Math.random() method
        double randomNumber = Math.random(); // By default, Math.random() returns double between 0.0 to 1.0
        System.out.println(randomNumber);

        /*Generate a random number between a specified range 1 to 10,
        where 1 is inclusive and 10 is exclusive*/
        int max = 10;
        int min = 1;
        int instantNumber = (int)(Math.random()*(max - min) + min);
        System.out.println(instantNumber);

        // 2. Using Random class
        Random random = new Random(); // Create an object of random class

        int intNumber = random.nextInt(); // Generate a random int number
        System.out.println(intNumber);

        int intRangeNumber = random.nextInt(50); // Generate a random int number between 0 to 49
        System.out.println(intRangeNumber);

        float floatNumber = random.nextFloat(); // Generate a random float number between 0.0 to 1.0
        System.out.println(floatNumber);

        double doubleNumber = random.nextDouble(); // Generate a random double number between 0.0 to 1.0
        System.out.println(doubleNumber);

        long longNumber = random.nextLong(); // Generate a random long number
        System.out.println(longNumber);

        boolean bool = random.nextBoolean(); // Generate booleans randomly
        System.out.println(bool);
    }
}

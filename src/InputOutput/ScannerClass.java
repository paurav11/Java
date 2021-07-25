package InputOutput;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        /*Scanner class allows us to input from keyboard.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your weight: ");
        float weight = sc.nextFloat();
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();
        sc.close();
        // likewise use methods next(), nextBoolean(), nextByte(), nextLong(), nextShort() for different inputs

        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight + ", Height: " + height);
    }
}

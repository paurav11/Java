package Programs;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        isArmstrong(number);
    }

    public static void isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        // Converting int into String to calculate total number of digits of a number
        String number = Integer.toString(n);

        while (n!=0) {
            sum = sum + (int)Math.pow(n%10,number.length());
            n = n/10;
        }
//        System.out.println("Sum: " + sum);

        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}

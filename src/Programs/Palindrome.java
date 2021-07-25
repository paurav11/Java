package Programs;
import java.util.Scanner;

public class Palindrome {

    static void isPalindrome(int n) {
        int temp = n;
        int sum = 0;

        while (temp>0) {
            sum = (sum*10) + (temp%10);
            temp = temp/10;
        }

        if (n == sum) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        isPalindrome(number);
    }
}

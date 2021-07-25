package Programs;
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		OddEven oe = new OddEven();
		oe.isOddEven(number);
	}

	void isOddEven(int n) {
		if (n%2==0) {
			System.out.println(n + " is an even number.");
		}
		else {
			System.out.println(n + " is an odd number.");
		}
	}
}
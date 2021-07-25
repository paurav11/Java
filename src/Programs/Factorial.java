package Programs;
import java.util.Scanner;

public class Factorial {

	// Using recursion
	int fact(int n) {
		if (n==0) {
			return 1;
		}
		return n*fact(n-1);
	}

	// // Using iteration
	// int fact(int n) {
	// 	int result = 1;

	// 	if(n==0) {
	// 		return result;
	// 	} else {
	// 		for (int i=1; i<=n; i++) {
	// 			result = result*i;
	// 		}
	// 		return result;
	// 	}
	// }

	public static void main(String[] args) {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find factorial: ");
		int n = sc.nextInt();
		Factorial f1 = new Factorial();
		result = f1.fact(n);
		System.out.println("Factorial of " + n + " is " + result + ".");
	}
}
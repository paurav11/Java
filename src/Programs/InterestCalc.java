package Programs;
import java.util.Scanner;

public class InterestCalc {
	Scanner sc = new Scanner(System.in);

	void SimpleInterestCalc() {
		System.out.println("\n");
		System.out.println("Simple Interest Calculator");
		System.out.println("--------------------------");
		System.out.print("Enter Principal Amount (in Rs.): ");
		float P = sc.nextFloat();
		System.out.print("Enter Interest Rate (in %): ");
		float R = sc.nextFloat();
		System.out.print("Enter Period (in years): ");
		float N = sc.nextFloat();
		float SI = (P*R*N)/100;
		System.out.println("Simple Interest (SI) = Rs." + (int)SI);
		System.out.println("Total Amount = Rs." + (int)(SI + P) + "\n");
	}

	void CompoundInterestCalc() {
		int N = 1;
		System.out.println("\n");
		System.out.println("Compound Interest Calculator");
		System.out.println("----------------------------");
		System.out.print("Enter Principal Amount (in Rs.): ");
		float P = sc.nextFloat();
		System.out.print("Enter Interest Rate (in %): ");
		float R = sc.nextFloat();
		System.out.print("Enter Period (in years): ");
		float T = sc.nextFloat();
		System.out.println("Enter Compound Interval: ");
		System.out.println("1. Annually");
		System.out.println("2. Semi-annually");
		System.out.println("3. Quarterly");
		System.out.println("4. Monthly");
		System.out.print("Input: ");
		int choice = sc.nextInt();

		switch(choice) {
			case 1 -> {
				N = 1;
			}

			case 2 -> {
				N = 2;
			}

			case 3 -> {
				N = 4;
			}

			case 4 -> {
				N = 12;
			}

			default -> {
				System.out.println("Default value is selected.");
			}
		}

		float A = (float)(P*(Math.pow((1 + (R/(N*100))),(N*T))));
		float CI = A - P;
		System.out.println("Compound Interest (CI) = Rs." + (int)CI);
		System.out.println("Total Amount = Rs." + (int)(CI + P) + "\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("Select an option: ");
			System.out.println("1. Simple Interest Calculator");
			System.out.println("2. Compound Interest Calculator");
			System.out.println("3. Exit");
			System.out.print("Input: ");
			int calcType = sc.nextInt();

			switch(calcType) {
				case 1 -> {
					InterestCalc ic1 = new InterestCalc();
					ic1.SimpleInterestCalc();
				}

				case 2 -> {
					InterestCalc ic2 = new InterestCalc();
					ic2.CompoundInterestCalc();
				}

				case 3 -> {
					System.exit(0);
				}

				default -> {
					System.out.println("");
				}
			}
		}
	}
}

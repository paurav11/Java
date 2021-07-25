package Basics;

public class Expressions {
	public static void main(String[] args) {
		int score = (int)(Math.random() * (50 - 1) + 1);
		System.out.println("Score: " + score);

		/*Expressions are essential building blocks of any Java program, usually 
		created to produce a new value, although sometimes an expression 
		assigns a value to a variable.

		Expressions are built using values, variables, operators and method calls.*/

		// Here, 'score >= 25' is an expression which helps to validate the condition
		if (score >= 25) {
			System.out.println("Good score.");
		} else {
			System.out.println("You need practice.");
		}

		/*Java keywords are also known as reserved words. 
		Keywords are particular words that act as a key to a code. 
		These are predefined words by Java so they cannot be used as a variable 
		or object name or class name.*/

		// Here, int, if, and else are the keywords reserved for specific purpose.
	}
}
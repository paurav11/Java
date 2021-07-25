package ControlStatements.Patterns.StarPatterns;

import java.util.Scanner;

public class LeftInvertedTriangleStarPattern {
    public static void main(String[] args) {
        /*
        * * * * *
          * * * *
            * * *
              * *
                *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();

        for (int i=0; i<rows; i++) {
            for (int s=0; s<i; s++) {
                System.out.print("  ");
            }
            for (int j=rows-i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

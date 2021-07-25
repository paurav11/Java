package ControlStatements.Patterns.StarPatterns;

import java.util.Scanner;

public class InvertedPyramidStarPattern {
    public static void main(String[] args) {
        /*
        * * * * *
         * * * *
          * * *
           * *
            *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        for (int i=rows; i>0; i--) {
            for (int k=i; k<rows; k++) {
                System.out.print(" ");
            }
            for (int j=i; j>0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}

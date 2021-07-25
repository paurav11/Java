package ControlStatements.Patterns.StarPatterns;

import java.util.Scanner;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        /*
             *
           * *
         * * *
       * * * *
     * * * * *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        for (int i=0; i<rows; i++) {
            for (int j=rows-i-1; j>0; j--) {
                System.out.print("  ");
            }
            for (int k=0; k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}

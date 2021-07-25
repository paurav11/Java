package ControlStatements.Patterns.StarPatterns;

import java.util.Scanner;

public class DiamondShapeStarPattern {
    public static void main(String[] args) {
        /*
        *
       * *
      * * *
       * *
        *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        for (int i=1; i<=(2*rows)-1; i++) {
            if (i<=rows) {
                for (int j=rows-1; j>=i; j--) {
                    System.out.print(" ");
                }
                for (int k=0; k<(2*i)-1; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int j=rows; j<i; j++) {
                    System.out.print(" ");
                }
                for (int k=2*(i-rows); k<(2*rows)-1; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}

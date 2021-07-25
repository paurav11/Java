package ControlStatements.Patterns.StarPatterns;

import java.util.Scanner;

public class LeftPascalsTriangleStarPattern {
    public static void main(String[] args) {
        /*
           *
         * *
       * * *
     * * * *
   * * * * *
     * * * *
       * * *
         * *
           *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        for (int i=0; i<(2*rows)-1; i++) {
            if (i<rows) {
                for (int j=rows-i-1; j>0; j--) {
                    System.out.print("  ");
                }
                for (int k=0; k<=i; k++) {
                    System.out.print("* ");
                }
                System.out.println("");
            } else {
                for (int j=rows; j<=i; j++) {
                    System.out.print("  ");
                }
                for (int k=i; k<(2*rows)-1; k++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }
}

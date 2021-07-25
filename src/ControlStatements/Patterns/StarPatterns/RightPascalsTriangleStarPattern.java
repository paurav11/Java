package ControlStatements.Patterns.StarPatterns;

import java.util.Scanner;

public class RightPascalsTriangleStarPattern {
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
                for (int j=0; j<=i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int k=i; k<(2*rows)-1; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

}

package ControlStatements.Patterns.StarPatterns;

import java.util.Scanner;

public class RightInvertedTriangleStarPattern {
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
            for (int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}

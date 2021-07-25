package ControlStatements.Patterns.StarPatterns;

import java.util.Scanner;

public class InvertedTriangleStarPattern {
    public static void main(String[] args) {
        /*
        *********
         *     *
          *   *
           * *
            *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        for (int i=rows; i>0; i--) {
            for (int j=i; j<rows; j++) {
                System.out.print(" ");
            }
            for (int k=(2*i)-1; k>0; k--) {
                if (k==1 || i==rows || k==(2*i-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

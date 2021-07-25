package ControlStatements.Patterns.StarPatterns;

import java.util.Scanner;

public class HollowDiamondShapeStarPattern {
    public static void main(String[] args) {
        /*
        *
       * *
      *   *
     *     *
    *       *
     *     *
      *   *
       * *
        *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        for (int i=1; i<=(2*rows)-1; i++) {
            if (i<=rows) {
                for (int j=i; j<rows; j++) {
                    System.out.print(" ");
                }
                for (int k=1; k<=(2*i)-1; k++) {
                    if (k==1 || k==(2*i-1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            } else {
                for (int j=i; j>rows; j--) {
                    System.out.print(" ");
                }
                for (int k=2*(i-rows); k<=(2*rows)-1; k++) {
                    if (k==2*(i-rows) || k==(2*rows)-2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}

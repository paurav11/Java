package Programs;
import java.util.Scanner;

public class FibonacciSeries {

    // Using recursion
    static void fibo(int n1, int n2, int n) {
        if (n>0) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            fibo(n2,n3,n-1);
        }
    }

//    // Using iteration
//    static void fibo(int n) {
//        int n1 = 0;
//        int n2 = 1;
//        int n3;
//        System.out.print(n1 + " " + n2);
//        for (int i=0; i<n-2; i++) {
//            n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//            System.out.print(" " + n3);
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of terms of your Fibonacci series: ");
        int n = sc.nextInt();
//        fibo(n);
        System.out.print(0  + " " + 1); // print initial terms
        fibo(0,1,n-2);
    }
}

package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {

    static void isPrime(int n) {
        int flag = 1;
        for (int i=2; i<=n-1; i++) {
            if (n%i==0) {
                flag = 0;
                break;
            }
        }

        if (flag==1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        isPrime(n);
    }
}

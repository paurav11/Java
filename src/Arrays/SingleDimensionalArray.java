package Arrays;
import java.util.Scanner;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        // An array is a collection of similar type of elements which has contiguous memory location.

        // Single Dimensional Array
        int arr[] = {1,2,3,4,5};

        // for each loop
        for (int val: arr) {
            System.out.print(val + " ");
        }

        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5]; // new keyword is used to create an instance of that class
        System.out.println("\nEnter 5 array elements: ");
        for (int i=0; i<arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int val: arr1) {
            System.out.print(val + " ");
        }
    }
}

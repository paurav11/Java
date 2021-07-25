package Basics;

public class VariableWidening {
    public static void main(String[] args) {
        int x = 11;
        float f = x; // Variable Widening
        System.out.println(x);
        System.out.print(f);
    }
}

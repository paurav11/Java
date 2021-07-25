package Basics;

public class VariableOverflow {
    public static void main(String[] args) {
        int a = 150;
        byte b = (byte)a; // Variable Overflow
        System.out.println(a);
        System.out.println(b);
    }
}

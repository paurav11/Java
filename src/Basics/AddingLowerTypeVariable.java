package Basics;

public class AddingLowerTypeVariable {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 17;
//        byte c = a+b;
        /* Error: byte <- int (Java converts a result automatically into int by default if not type casted.) */
        byte c = (byte)(a+b);
        System.out.println(c);
    }
}

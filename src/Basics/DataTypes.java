package Basics;

public class DataTypes {
    public static void main(String[] args) {
        /* Data types specify the different sizes and values that can be stored in the variable. */

        // Data Types are of 2 types: Primitive and Non-Primitive

        /* boolean, char, byte, short, int, long, float, double are the 8 primitive data types in Java.*/

        // boolean has a width of 1 bit
        boolean myBoolean = true;
        boolean yourBoolean = false;
        System.out.println("myBoolean = " + myBoolean);
        System.out.println("yourBoolean = " + yourBoolean);

        // char has a width of 16 bits (2 bytes)
        char myChar = 'P';
        char copyrightSymbol = '\u00A9';
        System.out.println("myChar = " + myChar);
        System.out.println("copyrightSymbol = " + copyrightSymbol);

        // byte has a width of 8 bits (1 byte)
        byte myByteValue = -128;
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16 bits (2 bytes)
        short myShortValue = 32767;
        short myNewShortValue = (short)(myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // int has a width of 32 bits (4 bytes)
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;
        int myTotal = (myMaxIntValue/2);
        System.out.println("myTotalIntValue = " + myTotal);

        // long has a width of 64 bits (8 bytes)
        long myLongValue = 9_223_372_036_854_775_807L;
        System.out.println("myLongValue = " + myLongValue);

        // float has a width of 32 bits (4 bytes)
        float myFloatValue = 15f/2.3f;
        System.out.println("myFloatValue = " + myFloatValue);

        // double has a width of 64 bits (8 bytes)
//        double myDoubleValue = 15d/2.3d;
        double myDoubleValue = 15/2.3; // By default, Java uses double for floating point numbers
        System.out.println("myDoubleValue = " + myDoubleValue);
        /* classes, interfaces, arrays, strings are non-primitive data types. */

        // Check data type of any variable
        System.out.println(((Object)myBoolean).getClass().getName());
        System.out.println(((Object)myChar).getClass().getName());
        System.out.println(((Object)myByteValue).getClass().getName());
        System.out.println(((Object)myShortValue).getClass().getName());
        System.out.println(((Object)myMaxIntValue).getClass().getName());
        System.out.println(((Object)myLongValue).getClass().getName());
        System.out.println(((Object)myFloatValue).getClass().getName());
        System.out.println(((Object)myDoubleValue).getClass().getName());
    }
}

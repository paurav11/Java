package Basics;

public class Methods {
    public static void main(String[] args) {

        /*A method is a block of code or collection of statements or a set of code grouped together
        to perform a certain task or operation. It is used to achieve the reusability of code.
        We write a method once and use it many times. We do not require to write code again and again.
        It also provides the easy modification and readability of code, just by adding or removing a
        chunk of code. The method is executed only when we call or invoke it.
         */

        // Below code represents duplication of similar tasks.
        // To remove duplication, and achieve reusability of code, we use methods.

//        String name = "Paurav Shah";
//        int age = 23;
//        boolean adult;
//
//        if (age>=18) {
//            adult = true;
//            System.out.println(name + " is " + age + " years old.");
//            System.out.println("Adult: " + adult);
//        } else {
//            adult = false;
//            System.out.println(name + " is " + age + " years old.");
//            System.out.println("Adult: " + adult);
//        }
//
//        name = "Tanishka Shah";
//        age = 13;
//
//        if (age>=18) {
//            adult = true;
//            System.out.println(name + " is " + age + " years old.");
//            System.out.println("Adult: " + adult);
//        } else {
//            adult = false;
//            System.out.println(name + " is " + age + " years old.");
//            System.out.println("Adult: " + adult);
//        }

        // Method Call
        isAdult("Paurav Shah", 23);
        isAdult("Tanishka Shah", 13);

        boolean adult = verifyAdult("Nimish Shah", 52);
        if (adult) {
            System.out.println("Adult: true");
        } else {
            System.out.println("Adult: false");
        }
    }

    // Method Definition
    public static void isAdult(String name, int age) {
        if (age>=18) {
            System.out.println(name + " is " + age + " years old.");
            System.out.println("Adult: true");
        } else {
            System.out.println(name + " is " + age + " years old.");
            System.out.println("Adult: false");
        }
    }

    public static boolean verifyAdult(String name, int age) {
        if (age>=18) {
            System.out.println(name + " is " + age + " years old.");
            return true; // Returning values using a method
        } else {
            System.out.println(name + " is " + age + " years old.");
            return false;
        }
    }

}

package Basics;

public class TerminateProgram {
    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            System.out.println(i);
            if (i==8) {
                System.exit(0); // System.exit(0) method terminates any program at any point in time
            }
        }
    }
}

package ControlStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random()*(6-1)+1);
        String str = "";

        // Switch statement
        switch (randomNumber) {
            case 1: System.out.println("Very Bad");
                    str = "Oh No!";
                    break;
            case 2: System.out.println("Bad");
                    str = "Oh!";
                    break;
            case 3: System.out.println("Average");
                    str = "Ok.";
                    break;
            case 4: System.out.println("Good");
                    str = "Nice.";
                    break;
            case 5: System.out.println("Very Good");
                    str = "Great.";
                    break;
            default: System.out.println("None of the cases are satisfied.");
        }

        // Enhanced switch statement
        switch (str) {
            case "Oh No!" -> {
                System.out.println("Number = 1");
            }

            case "Oh!" -> {
                System.out.println("Number = 2");
            }

            case "Ok." -> {
                System.out.println("Number = 3");
            }

            case "Nice." -> {
                System.out.println("Number = 4");
            }

            case "Great." -> {
                System.out.println("Number = 5");
            }
        }
    }
}

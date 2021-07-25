package Basics;

// Enumerated Data Type or Own Data Type
enum Cards {
   HEARTS, CLUBS, DIAMOND, SPADES;
}

public class EnumeratedDataTypes {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 4;
        // Generating random number between 1 to 4
        int randomNumber  = (int)(Math.random() * (maxNumber - minNumber) + minNumber);
        System.out.println(randomNumber);

        // Selecting from 4 types of cards randomly
        switch (randomNumber) {
            case 1 -> {
                Cards c1 = Cards.HEARTS;
                System.out.println(c1);
            }
            case 2 -> {
                Cards c2 = Cards.CLUBS;
                System.out.println(c2);
            }
            case 3 -> {
                Cards c3 = Cards.DIAMOND;
                System.out.println(c3);
            }
            case 4 -> {
                Cards c4 = Cards.SPADES;
                System.out.println(c4);
            }
            default -> System.out.println("JOKER");
        }
    }
}

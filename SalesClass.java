package mysalespackage;

import java.util.Scanner;


public class SalesClass {
    static final double HONEY_PRICE = 10.25; //Honey Price
    static final double APPLES_PRICE = 5.99; //Apples Price
    static final double ORANGES_PRICE = 7.99; //Oranges Price
    static final double BANANAS_PRICE = 2.50; //Bananas Price
    String a;
    static int numberHoney; //How many honeys customer wants
    static int numberApples; //How many apples customer wants
    static int numberOranges; //How many oranges customer wants
    static int numberBananas; //How many bananas customer wants
    static double honeyTotal = HONEY_PRICE * numberHoney; //Honey price times amount purchasing
    static double applesTotal = APPLES_PRICE * numberApples; //Apples price times amount purchasing
    static double orangesTotal = ORANGES_PRICE * numberOranges; //Oranges price times amount purchasing
    static double bananasTotal = BANANAS_PRICE * numberBananas; //Bananas price times amount purchasing
    static double finalTotal = honeyTotal + applesTotal + orangesTotal + bananasTotal; //Total
    {
    }   

    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("What's your name?"); //Get customer name
        String a = input.nextLine();
        System.out.println("Welcome to Peggy's Famers Market, " + a + "!");
        System.out.println("Menu:"); //Menu display for market items
        System.out.println("Raw Honey - $10.25");
        System.out.println("Bag of Apples - $5.99");
        System.out.println("Bag of Oranges - $7.99");
        System.out.println("Bunch of Bananas - $2.50");
        System.out.println("How many jars of Raw Honey do you want?");
        double numberHoney = Double.parseDouble(input.nextLine());
        System.out.println("How many bags of Apples do you want?");
        double numberApples = Double.parseDouble(input.nextLine());
        System.out.println("How many bags of Oranges do you want?");
        double numberOranges = Double.parseDouble(input.nextLine());
        System.out.println("How many bunches of Bananas do you want?");
        double numberBananas = Double.parseDouble(input.nextLine());
        
        double honeyTotal = HONEY_PRICE * numberHoney;
        double applesTotal = APPLES_PRICE * numberApples;
        double orangesTotal = ORANGES_PRICE * numberOranges;
        double bananasTotal = BANANAS_PRICE * numberBananas;
        honeyTotal = honeyTotal * .85;
        applesTotal = applesTotal * .85;
        orangesTotal = orangesTotal * .85;
        bananasTotal = bananasTotal * .85;
        double finalTotal = honeyTotal + applesTotal + orangesTotal + bananasTotal;
        System.out.println("Your total is: " + finalTotal);

}

}

package replit._2_Statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your gift:");
        String items=input.nextLine();


        switch (items){
            case "Blanket" :
                System.out.println("Thank you for your purchase!\n" +
                                   "Your current balance is: 40$");
                break;
            case "Charger" :
                System.out.println("Thank you for your purchase!\n" +
                        "Your current balance is: 75$");
                break;
            case "Hat" :
                System.out.println("Thank you for your purchase!\n" +
                        "Your current balance is: 75$");
                break;
            case "Headphones" :
                System.out.println("Thank you for your purchase!\n" +
                        "Your current balance is: 70$");
                break;
            case "Laptop" :
                System.out.println("Sorry, not enough fund on your gift card!" );
                break;
            case "Pant" :
                System.out.println("Thank you for your purchase!\n" +
                        "Your current balance is: 50$");
                break;
            case "Pillow" :
                System.out.println("Thank you for your purchase!\n" +
                        "Your current balance is: 60$");
                break;
            case "Smartphone" :
                System.out.println("Sorry, not enough fund on your gift card!");
                break;
            case "Socks" :
                System.out.println("Thank you for your purchase!\n" +
                        "Your current balance is: 95$");
                break;
            case "USB cable" :
                System.out.println("Thank you for your purchase!\n" +
                        "Your current balance is: 90$");
                break;

            default :
                System.out.println("Invalid item!");


        }
        input.close();
    }
}

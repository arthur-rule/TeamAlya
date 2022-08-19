package replit._1_Variables;

import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int mgInDrink = input.nextInt();
        int lethalOverdoseDrinks=10000/mgInDrink;
        System.out.println("It would take about "+lethalOverdoseDrinks+" drinks for a lethal overdose.");

    }
}

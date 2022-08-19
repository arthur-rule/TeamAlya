package replit._2_Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        System.out.println("Enter cents:");
        Scanner input=new Scanner(System.in);
        int cents =input.nextInt();

        int quarters=cents/25;
        int dimes=(cents%25)/10;
        int nickels=((cents%25)%10)/5;
        int pennies=cents%5;

        if (cents<=100&&cents>0){
        System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+
                           nickels+" nickels, and "+pennies+" pennies");}
        else System.out.println("Invalid cents amount");
        input.close();
    }

}

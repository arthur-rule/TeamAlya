package replit._1_Variables;

import java.util.Scanner;

public class ShoppingListI {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter item1 and its price:");
        String item1= input.next();
        double price1=input.nextDouble();

        System.out.println("Enter item2 and its price:");
        String item2= input.next();
        double price2=input.nextDouble();

        System.out.println("Enter item3 and its price:");
        String item3= input.next();
        double price3=input.nextDouble();

        System.out.println("Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+
                ", Item3: "+item3+" Price: "+price3+"\nTotal price: "+(price1+price2+price3));
    }
}

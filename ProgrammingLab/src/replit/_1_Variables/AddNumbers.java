package replit._1_Variables;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

        Scanner input =new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        int sum= num1+num2+num3;
        System.out.println("Sum of numbers: "+sum);


    }
}
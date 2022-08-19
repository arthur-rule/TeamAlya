package replit._2_Statements;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split:");
        String splitOrNoSplit=input.next();

        System.out.println("Number of people:");
        int numberOfPeopleEntered = input.nextInt();

        System.out.println("Check amount:");
        double checkAmount= input.nextDouble();

        System.out.println("Service Quality:");
        String serviceQuality= input.next();
        double tipPercentage=0;
        switch (serviceQuality){
            case "Poor" : tipPercentage=0.05;
            break;
            case "Fair" : tipPercentage=0.1;
                break;
            case "Good" : tipPercentage=0.15;
            break;
            case "Great" : tipPercentage=0.2;
                break;
            case "Excellent" : tipPercentage=0.25;
                break;
            default:
                System.out.println("Invalid service quality");
        }

        System.out.print("Number of people entered: ");
        for (int i = 0; i < numberOfPeopleEntered; i++) {System.out.print("&");}

        System.out.println("");
        double totalToPay= checkAmount+checkAmount*tipPercentage;
        System.out.println("Total to pay: "+totalToPay);
        System.out.println("Total tip: "+checkAmount*tipPercentage);
        System.out.println("Total per person: "+ totalToPay/numberOfPeopleEntered);
        System.out.println("Tip per person: "+(checkAmount*tipPercentage)/numberOfPeopleEntered);

    }
}

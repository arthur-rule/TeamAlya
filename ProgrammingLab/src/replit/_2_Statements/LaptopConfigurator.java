package replit._2_Statements;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {double laptopPrice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();
        if (screenSize== 13.3) {
            laptopPrice += 200;
        } else if (screenSize == 15.0) {
            laptopPrice += 300;
        } else if (screenSize == 17.3) {
            laptopPrice += 400;
        } else {
            System.out.println("Invalid screen size");
        }

        System.out.println("Select CPU type:");
        String cpuType = input.next();
        if (cpuType.equalsIgnoreCase( "i3")) {
            laptopPrice += 150;
        } else if (cpuType.equalsIgnoreCase( "i5")) {
            laptopPrice += 250;
        } else if (cpuType.equalsIgnoreCase( "i7")) {
            laptopPrice += 350;
        } else {
            System.out.println("Invalid CPU type");
        }

        System.out.println("Select RAM size:");
        int ramSize=input.nextInt();
        laptopPrice+=(ramSize/4)*50;

        System.out.println("Select storage type:");
        String storageType=input.next();
        System.out.println("Enter memory size:");
        int memorySize=input.nextInt();
        switch (storageType){
            case "HDD":
                laptopPrice+=(memorySize/500)*50;
                break;
            case "SSD":
                laptopPrice+=(memorySize/500)*100;
                break;
            default:
                System.out.println("Invalid storage type");
                break;
        }
        System.out.println("Enter screen resolution:");
        String screenResolution= input.next();
        switch (screenResolution) {
            case "FULLHD":
                laptopPrice +=100;
                break;
            case "4K":
                laptopPrice +=200;
                break;
            default:
                System.out.println("Invalid screen resolution");
        }

        System.out.println("Laptop price is: $" +laptopPrice);

    }
}


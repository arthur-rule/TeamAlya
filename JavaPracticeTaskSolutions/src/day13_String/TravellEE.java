package day13_StringClass;

import java.util.Scanner;

public class TravellEE {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Do you have a valid passport?");
        String haveValidPass = input.next();

        if(haveValidPass.equalsIgnoreCase("yes")){

            int baseCost= 1000;
            input.nextLine();

            System.out.println("Which country/countries do you travel?");
            String countries= input.nextLine();

            System.out.println("How many bags do you take with you?");
            byte numberOfBags=input.nextByte();


            System.out.println("How many people you will travel with total?");
            short numberOfPeople=input.nextShort();
            int totalCost= baseCost*numberOfPeople;
            if (numberOfPeople<4) {
                totalCost -= (numberOfPeople-1)*100;
            }else {totalCost-=300;}
            input.nextLine();
            System.out.println("Enter the name of the all passenger they will travel in one line:");
            String nameOfPassenger = input.nextLine();


            totalCost+= numberOfBags*50;
            System.out.println("Your ticket is booked to "+countries+". We have charged extra for the "+
                    numberOfBags+" bags but you are traveling with "+numberOfPeople+" so we are giving a " +
                    "discount. Your total cost is "+totalCost);

        }else {
            int basePassCost = 200;
            System.out.println("Which year did your passport expire?");
            int yearsOfExpired= 2022-input.nextInt();
            basePassCost+=75*yearsOfExpired;

            input.nextLine();
            System.out.println("Which country do you plan to travel?");
            String planCountries = input.nextLine();

            System.out.println("Will you travel in the next year?");
            String nextYearPlan= input.next();
            if (nextYearPlan.equalsIgnoreCase("yes")){
                basePassCost+=100;
            }else {
                basePassCost-=50;
            }
            System.out.println("Looks like your password has been expired for "+yearsOfExpired+" years, " +
                    "but not to worry we will get it ready for you to travel to "+planCountries+
                    " Your total cost has come out to " + basePassCost );


        }
        input.close();
    }
}
/*                  Create a class calledTravel. Make a cost variable to calculate how much
                    the person will owe after everything.
		            Ask the user if they have a valid passport (yes or no)
			        If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
               			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
        separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the " +
        "$numberOfBags bags but you are traveling with $peopleYouTravelWith so we are giving a " +
        "discount. " +
        "Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we " +
        "will get it ready for you to travel to $allCountries. Your total cost has come out " +
        "to $costAmount."

 */

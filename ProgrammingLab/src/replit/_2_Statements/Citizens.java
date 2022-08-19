package replit._2_Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {
        int seniorCitizens, nonSeniorCitizens, age;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens= input.nextInt();
        nonSeniorCitizens=input.nextInt();

        System.out.println("What is new citizen's age?");
        age=input.nextInt();

        if (age>=65){
            seniorCitizens+=1;
            System.out.println("Senior Citizen");
        }else {nonSeniorCitizens+=1; System.out.println("Non-Senior Citizen");}

        input.close();
        System.out.println("New seniorCitizens count "+seniorCitizens+"\n" +
                           "New nonSeniorCitizens count "+nonSeniorCitizens);


    }
}

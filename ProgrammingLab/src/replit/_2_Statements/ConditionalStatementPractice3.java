package replit._2_Statements;

import java.util.Scanner;

public class ConditionalStatementPractice3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String name = input.next();

        if (name.equalsIgnoreCase("chen")){
            System.out.println("Teacher");
        }else System.out.println("Student");
    }
}

package replit._2_Statements;

import java.util.Scanner;

public class QuizQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String answer = s.next();

        switch (answer) {
            case "a" :                ;
                System.out.println("a is wrong");
                break;
            case "b" :
                System.out.println("b is correct");
                break;
            case "c":
                System.out.println("c is wrong");
                break;
            default:
                System.out.println(answer+" is not a valid answer");

        }

    }



}

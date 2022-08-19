package replit._1_Variables;

import java.util.*;

public class SecondsConverter {

    public static void main(String[] args) {
        //YOUR CODE HERE:

        System.out.println("Enter seconds:");
        Scanner input = new Scanner(System.in);
        int inputSeconds = input.nextInt();
        int hours, minutes, seconds;

        seconds = inputSeconds % 60;
        minutes = (inputSeconds / 60) % 60;
        hours = (inputSeconds / 60) / 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");


    }

}

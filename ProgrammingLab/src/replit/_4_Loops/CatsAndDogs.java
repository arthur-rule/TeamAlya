package replit._4_Loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        while(word.contains("cat")) countOfCats++;
        while(word.contains("dog")) countOfDogs++;

        if(countOfCats==countOfDogs) System.out.println(true);
    }
}

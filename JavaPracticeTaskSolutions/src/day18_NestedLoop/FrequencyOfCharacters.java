package day18_NestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = input.next();
        String result = "";


        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            int counter = 0;

            for (int k = 0; k < word.length(); k++) {

                char each = word.charAt(k);
                if(ch == each){
                    counter++;
                }
            }

            if(!result.contains(""+ch)) {

                result += ch;
                result += counter;
            }
        }


        System.out.println("Frequency of characters of your word: "+result);


    }


}

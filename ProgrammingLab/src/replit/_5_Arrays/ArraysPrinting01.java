package replit._5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].substring(0,3));

        }

    }
}

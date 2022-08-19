package replit._2_Statements;

import java.util.Scanner;

public class ThreeNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        
        if (n1>n2 && n1>n3) {
            System.out.println("n1 is bigger");
        } else if (n2>n1 && n2>n3) {
            System.out.println("n2 is bigger");

        }else {
            System.out.println("n3 is bigger");
        }
    }
}

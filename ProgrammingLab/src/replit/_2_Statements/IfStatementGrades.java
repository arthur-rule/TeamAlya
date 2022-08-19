package replit._2_Statements;

import java.util.Scanner;

public class IfStatementGrades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade= s.nextInt();

        if(grade>90){
            System.out.println("excellent");
        } else if (grade>70) {
            System.out.println("good");
        } else if (grade>60) {
            System.out.println("pass");
        }else System.out.println("fail");
    }
}

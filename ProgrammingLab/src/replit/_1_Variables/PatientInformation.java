package replit._1_Variables;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\n" +
                "Enter your first name");
        String firstName= scan.next();

        System.out.println("Enter your last name");
        String lastName= scan.next();

        String fullName="Full Name: "+ lastName+", "+firstName+" ";

        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();

        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city" );
        String city= scan.next();

        System.out.println("Enter your state");
        String state= scan.next();

        System.out.println("Enter your zip code");
        int zipcode= scan.nextInt();

        String address="Address: "+ street+", "+city+", "+state+" "+zipcode+" ";

        System.out.println("Enter your work phone number");
        long workPhoneNumber= scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber= scan.nextLong();

        String contacts="Contacts:\n work phone number - "+workPhoneNumber+", personal phone number - "+
                personalPhoneNumber+", "+email+" ";

        System.out.println("Enter your age");
        int age= scan.nextInt();

        System.out.println("Enter your height");
        double height= scan.nextDouble();

        System.out.println("Enter your weight");
        double weight= scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried= scan.nextBoolean();

        System.out.println("Patient personal information"+"\nFull name: "+ lastName+", "+firstName+
                "\nAddress: "+ street+", "+city+", "+state+" "+zipcode+
                "\nContacts: work phone number - "+workPhoneNumber+", personal phone number - "+
                personalPhoneNumber+", "+"email: "+email+"\nAge: "+age+
                "\nHeight: "+height+"\nWeight: "+weight+" pounds\nMarried?: "+isMarried);




    }
}

package day20_Arrays;

public class items2EE {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i = 0; i < items.length; i++) {

            if (items[i].contains("Gloves")){
                System.out.println(i);
            }
            if (items[i].contains("iPad")){
                System.out.println("iPad");
            }
        }

        for (int j = 0; j < items.length; j++) {
            System.out.println(items[j]+" "+prices[j]+" "+itemIDs[j]);
        }


    }
}

/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
        name - price - #ID
*/
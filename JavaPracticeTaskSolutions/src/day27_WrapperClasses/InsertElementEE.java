package day27_WrapperClasses;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertElementEE {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(insert(arr1,2,100)));

    }
    public static int [] insert(int [] arr,int index, int element){
        if(index < 0 || index >= arr.length) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int [] newArr=new int[arr.length+1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if(i == index){
                j++;
            }
            newArr[j] = arr[i];
        }

        /*for (int i = 0; i < index; i++) {

            newArr[i]=arr[i];

        }

        for (int i = index; i < arr.length; i++) {

            newArr[i+1]=arr[i];

        }*/
        newArr[index]=element;


        return newArr;
    }
}

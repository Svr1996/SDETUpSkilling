package Arrays;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {


        int[] arr = new int [5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr); // this will return some hash value
        System.out.println(arr[1]); // this will return the value from 1st index
//        for(int i: arr){
//            System.out.println(i);
//        }

        System.out.println(Arrays.toString(arr)); // this will convert arrays into string objects

        String[] name = null;
        System.out.println(name);
        System.out.println(name.length);







    }
}

package Arrays;

import java.util.Arrays;

public class ChangeValue {

    public static String changeValue(String[] name){
       return name[0] = "Sandeep";

    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        //by default it contains 0 values because it is primitive
        System.out.println(arr[1]);

        String[] name = new String[5];
        //by default it contains null values because it is non-primitive
        System.out.println(name[2]);

        name = new String[]{"Sandy", "Swathi", "Rathnamma"};
        System.out.println(name[2]);
        changeValue(name);
        // the value is changed
        System.out.println(Arrays.toString(name));


    }



}

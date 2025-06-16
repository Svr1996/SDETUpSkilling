package MethodsInJava;

import java.util.Arrays;

public class Changevalue {

    public static void main(String[] args) {
        int arr[] = {10,20,30,50};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int nums[]){


        //if you make a change to the object via referance variable, same object will be changed
        nums[0] = 40;


    }





}

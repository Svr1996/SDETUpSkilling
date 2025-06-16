package MethodsInJava;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

        fun(2,5,10,20,30,60,100);
        display("Sandeep", "Swathi", "test ", "test");
        multiple(10,20, 30,35,40,45);
    }

    static void multiple(int a, int b, int ...v){
        System.out.println(a+ " " +b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void display(String ...name){
        System.out.println(Arrays.toString(name));
    }
}

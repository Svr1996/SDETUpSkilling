package MethodsInJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Please enter number 2 : ");
        int num2 = in.nextInt();
        System.out.println(sum(num1,num2)); ;

        //pass the value of the numbers when calling the method
        int result = sum(10,20);
        System.out.println(result);
    }

    public static int sum(int a, int b){
        return a+b;

        //if return statement hits, then next line of code/statement will never be executed
//        System.out.println("This line will never be executed");
    }


}

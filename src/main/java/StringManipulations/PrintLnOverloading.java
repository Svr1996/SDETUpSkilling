package StringManipulations;

import java.sql.Array;
import java.util.Arrays;

public class PrintLnOverloading {

    public static void main(String[] args) {

        System.out.println(56); // internally it will call println(int x)
        System.out.println("Sandeep"); //internally it will call println(String x)
        System.out.println(true); //internally it will call println(boolean x)
        System.out.println(Arrays.toString(new int[]{1,5,3,6,4})); //it will print hashcode

    }
}

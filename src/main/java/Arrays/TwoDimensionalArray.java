package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];

        Scanner input = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                arr[i][j] = input.nextInt();

            }
        }
    // one way to print the output
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//
//            }
//            System.out.println();
//        }
    // Another simple way to print
//        for(int i=0;i<arr.length;i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }

        // Using enhanced for loop
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }


    }
}

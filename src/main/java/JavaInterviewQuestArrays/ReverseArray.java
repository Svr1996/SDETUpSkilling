package JavaInterviewQuestArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {

    static void reverse(int[] arr){

        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        int[] arr = {5,10,15,20,25,30,50};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}

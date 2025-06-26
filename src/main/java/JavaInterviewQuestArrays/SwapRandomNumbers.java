package JavaInterviewQuestArrays;

import java.util.Arrays;

public class SwapRandomNumbers {

    public static void main(String[] args) {

        int arr[] = {5,3,6,2,10}; //Swap 5 and 6 i,e, Index 0 and Index 2

        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}

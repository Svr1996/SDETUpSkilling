package JavaInterviewQuestArrays;

import javax.xml.transform.Source;

public class MaxNumber {

    //Using function
    static int max(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int[] arr = {2,5,6,10,1,0,99};
        int max = arr[0];
        System.out.println(max(arr));

//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max){
//                max= arr[i];
//            }
//        }
//        System.out.println("maximum number is " + max );

    }
}

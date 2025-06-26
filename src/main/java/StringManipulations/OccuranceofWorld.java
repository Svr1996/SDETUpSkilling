package StringManipulations;

import java.util.Arrays;
import java.util.List;

public class OccuranceofWorld {

    public static void main(String[] args) {

        String str = "I have started my day and my day ended with good day";
        String strArr[] = str.split(" ");
        //Occurance of Day
        String target = "day";
        int count =0;
        //How many times day is here;
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].equals(target)){  //here we shouldn't use ==
                    count++;
                    if(count==3){
                        System.out.println("Third occurance of Day is "+i);
                    }
            }
        }

    }
}

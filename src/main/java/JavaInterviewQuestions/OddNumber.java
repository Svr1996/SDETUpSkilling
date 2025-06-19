package JavaInterviewQuestions;

import NestedInterfaces.B;

public class OddNumber {


    public Boolean isOdd(int num){
        return (num & 1) ==1;

    }

    public static void main(String[] args) {

        OddNumber obj = new OddNumber();
        System.out.println(obj.isOdd(6));
        System.out.println(obj.isOdd(5));
        System.out.println(obj.isOdd(15));
    }


}

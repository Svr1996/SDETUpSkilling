package JavaInterviewQuestions;

public class ReverseAnArray {

    public static void main(String[] args) {


            int[] numbers = {1,2,3,4,5};
            System.out.println("The first element of the numbers array " +numbers[0]);
            System.out.println("The last element of the numbers array " + numbers[numbers.length - 1]);

            for(int i=numbers.length-1;i>=0;i--){
               int rev = numbers[i];
                System.out.print(rev);
            }




    }
}

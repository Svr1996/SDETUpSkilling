package JavaInterviewQuestions;

public class EvenNum {

    public Boolean isEven(int num){
        return (num & 1) == 0;

    }

    public static void main(String[] args) {

        EvenNum obj = new EvenNum();
        System.out.println(obj.isEven(6));
        System.out.println(obj.isEven(5));
        System.out.println(obj.isEven(15));
    }
}

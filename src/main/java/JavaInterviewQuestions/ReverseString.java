package JavaInterviewQuestions;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Sandeepa";
        String rev = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            rev = ch+rev;
        }
        System.out.println(""+rev);

        // using StringBulider
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        System.out.println(str1);
        str1.reverse();
        System.out.println(str1);


    }
}

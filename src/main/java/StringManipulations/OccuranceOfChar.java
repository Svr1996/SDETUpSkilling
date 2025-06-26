package StringManipulations;

public class OccuranceOfChar {

    public static void main(String[] args) {

        String str = "mississippi";
        char target = 's';

        //One way using Index of
        int firstOcc = str.indexOf(target); //2
        int secondOcc = str.indexOf(target, firstOcc+1); //3
        int thirdOcc = str.indexOf(target, secondOcc+1); //5
        System.out.println("First Occurance of s is "+firstOcc);
        System.out.println("Second Occurance of s is "+secondOcc);
        System.out.println("Third Occurance of s is "+thirdOcc);

        //Another Way is:
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                count++;
                if(count ==3){
                    System.out.println("Third occurance of s is "+i);
                    break;
                }
            }

        }






    }
}

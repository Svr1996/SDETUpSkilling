package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArraylistDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(500);
        list.add(400);
        list.add(300);
        list.add(600);



        System.out.println(" " +list.get(1));

        list.remove(0);

        System.out.println(list);
        list.set(0,900);
        System.out.println(list);

//        for(int i =1;i<=5;i++){
//            list.add(i);
//        }


//        for(int i =0;i<5;i++){
//            System.out.println(list.get(i));
//        }




    }
}

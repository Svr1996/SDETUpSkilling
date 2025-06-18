package InheritancePolyMorphism;

public class InheritanceDemo {

    public static void main(String[] args) {

        // creating an object for Box class with it's own referance var

       Box box1 = new Box();
       System.out.println(box1.length + " " + box1.width+ " "+box1.height);

//
//       Box box2 = new Box(3,2,1);
//       System.out.println(box2.length + " " + box2.width+ " "+box2.height);
//
//       Box box3 = new Box(box2);
//       System.out.println(box3.length + " " + box3.width+ " "+box3.height);

        // creating an object for child class, here child can access the properties that are in parent class unless it is Private
        // creating an object for BoxWeight class with it's own referance var
//        BoxWeight box4 = new BoxWeight();
//        System.out.println(box4.length +" "+box4.width +" "+box4.height +" " +box4.weight);
//
//        BoxWeight box5 = new BoxWeight(10,20,30,40);
//        System.out.println(box5.length +" "+box5.width +" "+box5.height +" " +box5.weight);

        // creating an object of child class with referance variable of parent class
        Box box6 = new BoxWeight(10,20,30,40);

        //parent class referance type can't access the objects from
        //System.out.println(box6.weight);

//        Box.greetings();

//        BoxWeight box = new BoxWeight();
        BoxWeight.greetings();


    }
}

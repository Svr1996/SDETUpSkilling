package SwathiDemoClass;

public class Students {

    String name;
    int rollno;
    String address;

    Students(String naam, int num, String add){
       this.name = naam;
       this.rollno = num;
       this.address = add;

    }

//    Student(String naam, int num){
//        this.name = naam;
//        this.rollno = num;
//    }

    public static void main(String[] args) {

        Students std1 = new Students("swathi",20,"Anekal");
        System.out.println(std1.name);

        Students std2 = new Students("Sandeep",30,"Anekal");
        System.out.println(std2.name);

//        Student std3 = new Student("siri",20);


    }

}

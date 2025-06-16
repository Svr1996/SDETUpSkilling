package ClassDemo;

public class Student {

    String name;
    int rollno;
    String address;

    Student(String naam, int num, String add){
        this.name = naam;
        this.rollno = num;
        this.address = add;

    }
    Student(String naam){
        this.name = naam;
    }

//    Student(String naam, int num){
//        this.name = naam;
//        this.rollno = num;
//    }

    public static void main(String[] args) {

        Student std1 = new Student("swathi",20,"Anekal");
        System.out.println(std1.name);

        Student std2 = std1;
        System.out.println(std2.name);

//        Student std3 = new Student("siri",20);

        final Student std3 = new Student("Siri");

        System.out.println(std3.name);
        std3.name = "Vai siri";
        System.out.println(std3.name);

    }

}

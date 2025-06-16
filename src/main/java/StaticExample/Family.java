package StaticExample;

public class Family {

    String name;
    String gender;
    int age;
    static int membersCount;

    public Family(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        Family.membersCount += 1;

    }

    public static void main(String[] args) {


//        Family muniraju = new Family("Muniraju", "male", 50);
//        Family rathnamma = new Family("Rathnamma", "female",40);
//        Family swathi = new Family("SwathiMuniraju", "female",22);
//        Family chandana = new Family("ChandanaMuniraju", "female",25);

        System.out.println(Family.membersCount);



    }


}

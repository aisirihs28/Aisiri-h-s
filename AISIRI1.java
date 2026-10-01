package student;

public class Student {
    String name;
    int rollNo;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Aisiri";
        s1.rollNo = 101;
        s1.age = 19;

        s2.name = "Meghana";
        s2.rollNo = 102;
        s2.age = 18;

        s3.name = "Vaishnavi";
        s3.rollNo = 103;
        s3.age = 19;

        s1.display();
        s2.display();
        s3.display();
    }


}

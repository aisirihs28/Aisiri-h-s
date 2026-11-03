
class Student_2 {

    int marks;

    // Constructor
    Student_2(int marks) {
        this.marks = marks;
    }
}

public class Student_3{

    static void change(int x, Student_2 s) {

        x = 100;

        s.marks = 95;

        s = new Student_2(50);
    }

    public static void main(String[] args) {

        int n = 20;

        Student_2 st = new Student_2(60);

        change(n, st);

        System.out.println(n);
        System.out.println(st.marks);
    }
}


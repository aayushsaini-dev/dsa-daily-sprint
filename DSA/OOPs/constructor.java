public class constructor {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Sarika";
        s1.roll = 001;
        s1.password = "0406";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "abc";
        s1.marks[2] = 100;
        System.out.println(s2.name);
        System.out.println(s2.roll);
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        Student s3 = new Student("Aayush");
        System.out.println(s3.name);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // types of constructor

    // non parametrized
    Student() {
        System.out.println("constructor is called. . . ");
        marks = new int[3];
    }

    // parametrized
    Student(String name) {
        this.name = name;
        marks = new int[3];
    }

    // Shallow copy constructor
    // Student(Student s1) {
    // this.name = s1.name;
    // this.roll = s1.roll;
    // marks = new int[3];
    // this.marks = s1.marks;
    // }
    // deep copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}

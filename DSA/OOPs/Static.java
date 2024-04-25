public class Static {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "model";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        s2.setName("aayush");
        s2.getname();
        System.out.println(s2.name);
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getname() {
        return this.name;
    }
}

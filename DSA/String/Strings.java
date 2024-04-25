import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // // Strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        // String fullName = "Aayush Saini";
        // System.out.println(fullName.length());

        // string comparator
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");
        if (s1 == s2) {
            System.out.println("strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if (s1.equals(s3)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // concatenation
        String firstname = "aayush";
        String lastName = "Saini";
        String fullName = firstname + " " + lastName;
        System.out.println(fullName.charAt(0));

        printletters(fullName);

    }

    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
    }

}

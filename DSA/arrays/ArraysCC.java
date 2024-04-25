
public class ArraysCC {
    // update

    // public static void update(int marks[]) {
    // for (int i = 0; i < marks.length; i++) {
    // marks[i] = marks[i] + 1;
    // }
    // }
    // get latest

    // public static int getlargest(int numbers[]) {
    // int largest = Integer.MIN_VALUE; // -infinity
    // for (int i = 0; i < numbers.length; i++) {
    // if (largest < numbers[i]) {
    // largest = numbers[i];
    // }
    // }
    // return largest;
    // }
    public static void pairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + ", " + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }

    public static void main(String args[]) {
        // int marks[] = { 97, 98, 99 };
        // update(marks);

        // for (int i = 0; i < marks.length; i++) {
        // System.out.print(marks[i] + " ");
        // }
        int numbers[] = { 1, 4, 6, 8, 9, 5, 11 };

        // System.out.println("largest value is " + getlargest(numbers));
        pairs(numbers);
    }

}
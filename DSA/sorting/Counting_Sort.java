public class Counting_Sort {

    public static void countingsort(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int array[] = { 5, 5, 4, 1, 1, 3, 2 };
        countingsort(array);
        printArray(array);
    }
}

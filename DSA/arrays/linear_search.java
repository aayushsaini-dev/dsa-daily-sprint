public class linear_search {
    public static int Linear_Search(int numbers[], int key) {
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        int index = Linear_Search(numbers, key);
        if (index == -1) {
            System.out.print("not found");
        } else {
            System.out.print("key is a index : " + index);
        }
    }
}

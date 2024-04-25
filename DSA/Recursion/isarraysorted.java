public class isarraysorted {
    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        // method to check first part
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 4 };
        System.out.println("Sorted Array: " + issorted(arr, 0));
    }
}

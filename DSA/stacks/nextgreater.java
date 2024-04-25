import java.util.*;

public class nextgreater {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 2, 5, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2 if - else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // push ins
            s.push(i);
        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.println(nxtGreater[i] + " ");
        }
    }
}
// ye next greater right ke liye hai
// for next greater left = for loop ko ulta karna hai
// next smaller right = while loop me condition reversekarni hai after && ke
// baad me
// next smaller left = next smaller right me for loop reverse

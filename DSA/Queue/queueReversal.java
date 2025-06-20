import java.util.*;

public class queueReversal {

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
          // ye jo mene kiya usse answer to aa gya but ye stack hai isliye wapis queue me store karna hai
            //  System.out.println(s.peek());
            //s.pop();
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        // print q
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}

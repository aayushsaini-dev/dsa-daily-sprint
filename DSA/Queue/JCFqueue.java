import java.util.*;
public class JCFqueue {
    public static void main(String[] args) {
       // method 1 
       //Queue<Integer> q = new LinkedList<>();
       // mwthod 2
       Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

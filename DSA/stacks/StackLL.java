import java.util.*;

public class StackLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isempty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isempty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        // pop
        public static int pop() {
            if (isempty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek() {
            if (isempty()) {
                return -1;

            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();

        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
public class queueLL {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static node head = null;
        static node tail = null;

        public static boolean isempty() {
            return head == null && tail == null;
        }

        // add
        public static void add(int data) {
            node newnode = new node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;

        }

        // remove
        public static int remove() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            // single element
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(3);
        q.add(4);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

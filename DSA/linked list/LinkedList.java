public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // METHODS
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 = newnode next= head
        newNode.next = head; // linking step

        // ste3 = head = new node
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size -2
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data; // tail.dATA

        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

    // SEARCH
    public static int iterativesearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;

    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;

        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursivesearch(int key) {
        return helper(head, key);
    }

    // REVERSE
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // delete from last = delete from middle
    public void deleteNthfromend(int n) {
        // calculation size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // remove first
            return;
        }
        int i = 1;
        int itofind = sz - n;
        Node prev = head;
        while (i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addlast(30);
        ll.addlast(19);
        ll.addlast(58);
        ll.addlast(6);
        // ll.add(2, 9);
        ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removelast();
        // ll.print();
        // System.out.println(ll.size);
        System.out.println(iterativesearch(3));
        System.out.println(ll.recursivesearch(3));
        ll.reverse();
        ll.print();
        ll.reverse();
        ll.deleteNthfromend(3);
        ll.print();
        ll.head = ll.MergeSort(ll.head);
        ll.print();
    }

    // public LinkedList.Node mergesort(LinkedList.Node head2) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'mergesort'");
    // }

    // public LinkedList.Node MergeSort(LinkedList.Node head2) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'MergeSort'");
    // }
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }

    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node MergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    // public static void main(String[] args) {
    // LinkedList ll = new LinkedList();
    // ll.addlast(1);
    // ll.addlast(3);
    // ll.addlast(4);
    // ll.addlast(2);
    // ll.addlast(5);
    // // 1->3 ->4 ->2 -> 5
    // ll.print();

}
import java.util.*;

public class PrioirtyQueue {
    static class Student implements Comparable<Student> { // function overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(5);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

        PriorityQueue<Student> ab = new PriorityQueue<>();
        ab.add(new Student("A", 1));
        ab.add(new Student("c", 3));
        ab.add(new Student("s", 2));
        ab.add(new Student("p", 10));
        while (!ab.isEmpty()) {
            System.out.println(ab.peek().name + " ->" + ab.peek().rank);
            ab.remove();
        }

    }
}
package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(45);
        q.add(23);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}

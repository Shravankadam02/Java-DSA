import java.util.ArrayDeque;
import java.util.Deque;

public class dequeueBasics {
    public static void main(String[] args) {
        
        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerFirst(10);
        dq.offer(20);
        dq.offer(30);
        dq.offerLast(50);

        System.out.println(dq);

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq);

    }
}

import java.util.Deque;
import java.util.LinkedList;

public class task4 {
    public static void main(String[] args) throws Exception {
        Deque<Integer> deque = new LinkedList<>();
        int n = 2;

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);

        System.out.println(deque.toString() + " n = " + n);
        rotateDeque(deque, n);
        System.out.println(deque.toString());
    }

    public static void rotateDeque(Deque<Integer> deque, int n){
        if (deque.isEmpty()) return;
        if (n > deque.size()) n = n % deque.size();
        else while (n < 0) {
            n += deque.size();
        }
        for (int i = 0; i < n; i++) {
            deque.addLast(deque.pollFirst());
        }

    }
}

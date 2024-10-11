import java.util.Deque;
import java.util.LinkedList;

public class task5 {
    public static void main(String[] args) throws Exception {
        Deque<String> deque = new LinkedList<>();

        deque.add("apple");
        deque.add("banana");
        deque.add("apple");
        deque.add("cherry");

        String value = "apple";

        System.out.println(deque + "value = " + value);
        removeAllOccurrences(deque, value);
    }

    public static void removeAllOccurrences(Deque<String> deque, String value) {

        deque.removeIf(element -> element.equals(value));
        System.out.println(deque);
    }
}

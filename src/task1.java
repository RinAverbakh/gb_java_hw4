import java.util.ArrayList;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) throws Exception {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("apple");
        ll.add("banana");
        ll.add("pear");
        ll.add("grape");
        System.out.println(ll);
        System.out.println(removeOddLengthStrings(ll));
    }

    public static LinkedList<String> removeOddLengthStrings(LinkedList<String> ll) {
        ll.removeAll(findOddLengthStrings(ll));
        return ll;
    }

    public static ArrayList<String> findOddLengthStrings(LinkedList<String> ll) {
        ArrayList<String> result = new ArrayList<>();
        for (String e : ll) {
            if (e.length() % 2 != 0) {
                result.add(e);
            }
        }
        return result;
    }
}

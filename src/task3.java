import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) throws Exception {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("apple");
        ll.add("pear");
        ll.add("banana");
        ll.add("apple");

        String value = "apple";

        System.out.println(ll);
        System.out.println(value + " - " + countOccurrences(ll, value));

    }

    public static int countOccurrences(LinkedList<String> ll, String value){
        int result = 0;
        for (String e : ll) {
            if(e.equals(value)) result++;
        }
        return result;
    }
}

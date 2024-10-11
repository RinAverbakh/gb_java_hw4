import java.util.LinkedList;

public class myStack {

    private LinkedList<String> stack = new LinkedList<>();
    
    public void push(String element){
        stack.addFirst(element);
    }

    public String pop(){
        return stack.removeFirst();
    }

    public String peek(){
        return stack.peekFirst();
    }

    public LinkedList<String> getElements(){
        return stack;
    }

    @Override
    public String toString() {
        
        if (stack.peekFirst() == null) return "[]";

        StringBuilder builder = new StringBuilder();
        for (String e : stack) {
            builder.append(e).append(", ");
        }
        builder.delete(builder.length()-2, builder.length());
        return ("[ " + builder.toString() + " ]");
    }
}

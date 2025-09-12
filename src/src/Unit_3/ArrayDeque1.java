package Unit_3;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> deq=new ArrayDeque<>();
        deq.addFirst("0");
        deq.addLast("2nd");
        System.out.println(deq);
        System.out.println(deq.offerFirst("-1"));
        System.out.println(deq.offerLast("3"));
        System.out.println(deq);
        System.out.println(deq.peekFirst());
        System.out.println(deq.peekLast());

    }
}

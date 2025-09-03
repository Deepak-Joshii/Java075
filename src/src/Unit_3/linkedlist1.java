package Unit_3;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("fourth");
        Iterator itr=ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ll.remove("third");
        ll.addFirst("zero");
        ll.addLast("fifth");
        System.out.println(ll);
    }
}

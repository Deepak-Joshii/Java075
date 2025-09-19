package Unit_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(32);
        al.add(23);
        al.add(-22);
        al.add(-43);
        Collections.sort(al);
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);
    }

}

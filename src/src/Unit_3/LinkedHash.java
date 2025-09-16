package Unit_3;

import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("One");
        lhs.add("Two");
        lhs.add("Two");
        lhs.add("Three");
        lhs.add("Four");
        System.out.println(lhs);
    }
}

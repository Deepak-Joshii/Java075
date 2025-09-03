package Unit_3;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(23);
        al.add(34);
        al.add(69);
        System.out.println(al);

        for (int al1 : al) {
            System.out.println(al1);
        }
    }
}

package Unit_3;
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items you want to enter: ");
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
        product.add(sc.next());
        }
        Collections.sort(product);
        Iterator it=product.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        product.add(1,"Apple");
        product.addLast("Banana");
        product.addFirst("Orange");
        System.out.println(product.get(0));
    }

}

package Unit_3;

import java.util.HashSet;
import java.util.Scanner;

public class Set1 {
    public static void main(String[] args) {
        HashSet<String> hs1=new HashSet<>();
        HashSet<String> hs2=new HashSet<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number fo inputs in HashSet1: ");
        int n=sc.nextInt();
        System.out.println("Enter number fo inputs in HashSet2: ");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter name for hs1: ");
            hs1.add(sc.next());
        }
        for(int i=0;i<m;i++){
            System.out.println("Enter name for hs2: ");
            hs2.add(sc.next());
        }
        System.out.println(hs1);
        System.out.println(hs1.addAll(hs2));
        System.out.println(hs1);
//        hs1.removeAll(hs2);
        hs1.removeIf( str-> str.contains("aa"));
        System.out.println(hs1);

    }
}

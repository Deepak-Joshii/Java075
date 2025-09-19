package Unit_3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            String key=sc.next();
            int val=sc.nextInt();
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        for(String k: hm.keySet()){
            System.out.println(k+" "+hm.get(k));
        }
    }
}
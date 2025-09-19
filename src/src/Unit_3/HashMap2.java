package Unit_3;

import java.io.*;
import java.util.*;

public class HashMap2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> hm=new HashMap<>();

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String []k=sc.next().split(" ");
            if(k[0].equals("add")){
                hm.put(k[1],hm.getOrDefault(k[1],0)+1);

            }
            else if(k[0].equals("remove")){
                if(hm.containsKey(k[1])){
                    hm.remove(k[1]);
                }
            }
            else if(k[0].equals("count")){

                System.out.println(hm.getOrDefault(k[1],0));

            }
        }
    }
}
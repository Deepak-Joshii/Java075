package Unit_3;
import java.util.Scanner;
public class Array_1 {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for(int i=0;i<a.length;i++){

            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

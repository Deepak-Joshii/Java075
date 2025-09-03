package Unit_3;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int row,column;
        row=sc.nextInt();
        column=sc.nextInt();
        int a[][]=new int[row][column];
        int b[][]=new int[row][column];
        System.out.println("Enter elements for first array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for second array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array 1 : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Array 2 : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Printing sum: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println("");
        }
    }
}

// Read two 2x2 matrices and perform addition of matrices into third matrix and
// print it
import java.util.*;
public class Lab30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter element for matrix A");
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter element for matrix B");
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix A is: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println("\nMatrix B is: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(b[i][j]+" ");
            }
        }
        System.out.println("\nMatrix C is: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+" ");
            }
        }
    }
}
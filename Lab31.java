// Read two matrices, first 3x2 and second 2x3, perform multiplication operation
// and store result in third matrix and print it.

import java.util.*;
public class Lab31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][2];
        int b[][]=new int[2][3];
        int c[][]=new int[3][3];
        int sum=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter element for matrix A");
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter element for matrix B");
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){
                    sum=sum+a[i][k]*b[k][j];
                }
                c[i][j]=sum;
            }
        }
        System.out.println("Matrix A");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println("Matrix B");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+" ");
            }
        }
        System.out.println("Matrix C");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
        }
    }
}
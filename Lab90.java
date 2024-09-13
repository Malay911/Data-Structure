// Write a program to implement a Linear Search using Array.

import java.util.*;

public class Lab90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr length:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element found at index "+i);
                break;
            }
        }
    }
}
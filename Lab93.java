//Insertion Sort 

import java.util.*;

public class Lab93 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arr length:");
        int n = sc.nextInt();
        System.out.println("Enter arr elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted array:");
        insertionSort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
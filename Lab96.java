//Merge Sort

import java.util.*;

public class Lab96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr length:");
        int n=sc.nextInt();
        System.out.println("Enter arr elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array:");
        mergesort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(int[] arr) {
        if(arr.length<=1) {
            return;
        }
        int mid=arr.length/2;
        int[] left=new int[mid];
        int[] right=new int[arr.length-mid];
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr,mid,right,0,arr.length - mid);
        mergesort(left);
        mergesort(right);
        merge(left, right, arr);
    }
    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } 
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
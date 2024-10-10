//Binary Search
import java.util.Scanner;

public class Lab91{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr length:");
        int n = sc.nextInt();
        int first=0;
        int last=n-1;
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int key=sc.nextInt();
        BinarySearch(arr,first,last,key);
    }

    public static void BinarySearch(int arr[],int first,int last,int key){
        if (first <= last) {
            int mid = (first + last) / 2;
            while(first<=last){
                if (arr[mid]==key) {
                    System.out.println("Your index of number is:" +mid);
                    break;
                }
                else if (arr[mid]<key) {
                    first = mid+1;
                }
                else{
                    last = mid-1;
                }
                mid = (first + last) / 2;
            }
            if(first>last){
                System.out.println("Element is not present in array");
            }
        }
    }
}

//Heap Sort

import java.util.Scanner;

public class Lab98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value for element in index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        HeapSort(arr, n);

        System.out.println("Array elements after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void HeapSort(int[] arr, int n) {
        buildMaxHeap(arr, n);
        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;
        n = n - 1;
        HeapSort(arr, n);
    }

    public static void buildMaxHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[i] < arr[left]) {
            largest = left;
            arr[i] = arr[largest];
            arr[largest] = arr[i];
        }
        if (right < n && arr[largest] < arr[right]) {
            largest = right;
            arr[i] = arr[largest];
            arr[largest] = arr[i];
            heapify(arr, n, largest);
        } else {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
        }
    }
}
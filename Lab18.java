import java.util.Scanner;

public class Lab18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to be replaced: ");
        int numToReplace = scanner.nextInt();

        System.out.print("Enter the new element: ");
        int newNum = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == numToReplace) {
                arr[i] = newNum;
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + numToReplace + " replaced at index " + index);
            System.out.print("Final array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Element not found in the array.");
        }
        scanner.close();
    }
}

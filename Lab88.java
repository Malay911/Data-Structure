//In an array of 20 elements, arrange 15 different values, which are generated randomly between 1,00,000 to 9,99,999. 
//Use hash function to generate key and linear probing to avoid collision. 
//H(x) = (x mod 18) + 2. 
//Write a program to input and display the final values of array.

import java.util.*;

public class Lab88 {

    public static int hashFunction(int x) {
        return (x % 18) + 2;
    }

    public static void insertValue(int[] arr, int value) {
        int key = hashFunction(value);
        int index = key;

        while (arr[index] != 0) { 
            index = (index + 1) % arr.length;
        }
        arr[index] = value;
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            int randomValue = rand.nextInt(900000) + 100000;
            insertValue(arr, randomValue); 
        }

        System.out.println("Final Array:");
        System.out.println(Arrays.toString(arr));
    }
}

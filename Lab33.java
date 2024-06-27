// Write a program to swap two numbers using user-defines method.

import java.util.*;
public class Lab33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        
        System.out.println("Enter method: ");
        System.out.println("1. Using third variable");
        System.out.println("2. Without using third variable");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            UsingThirdVariable(a,b);
            break;
            case 2:
            WithoutThirdVariable(a,b);
            break;
            default:System.out.println("Invalid choice");
        }
    }

    static void UsingThirdVariable(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    static void WithoutThirdVariable(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
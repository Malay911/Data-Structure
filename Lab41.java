// Chef has a string which contains only the characters '{', '}', '[', ']', '(' and ')'. Now Chef wants to know if the given string is balanced or not. If is balanced then print 1, otherwise print 0.
//  A balanced parenthesis string is defined as follows:
// o The empty string is balanced
// o If P is balanced then (P), {P}, [P] is also balanced
// o if P and Q are balanced PQ is also balanced
// o "([])", "({})[()]" are balanced parenthesis strings
// o "([{]})", "())" are not balanced.
//  Input: The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows. The first and only line of each test case contains a single string
//  Output: For each test case, print a single line containing the answer.

import java.util.Scanner;

class Stack {
    int top = -1;
    char[] S;

    public Stack(int size) {
        S = new char[size];
    }

    public void push(char x) {
        if (top >= 100) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        S[top] = x;
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return '\0';
        } else {
            return S[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Lab41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            System.out.println("Enter the bracket string:");
            String bracket = sc.nextLine();

            if (isBalanced(bracket)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }

    public static boolean isBalanced(String str) {
        Stack S1 = new Stack(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                S1.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (S1.isEmpty()) {
                    return false;
                }
                char openBracket = S1.pop();
                if ((ch == ')' && openBracket != '(') ||
                    (ch == '}' && openBracket != '{') ||
                    (ch == ']' && openBracket != '[')) {
                    return false;
                }
            }
        }

        return S1.isEmpty();
    }
}
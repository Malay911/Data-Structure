/*Write a program to determine if an input character string is of the form a^ib^i
where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.*/
import java.util.*;

class Stacks {
    int top = -1;
    char[] S = new char[101];

    public void push(char x) {
        if (top >= 100) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        S[top] = x;
    }
}

public class Lab40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        Stacks S1 = new Stacks();
        Stacks S2 = new Stacks();

        boolean isValid = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                S1.push(s.charAt(i));
            } 
            else if (s.charAt(i) == 'b') {
                S2.push(s.charAt(i));
            } 
            else {
                isValid = false;
                break;
            }
        }

            if (S1.top == S2.top) {
                isValid = true;
            } else {
                isValid = false;
            }

        if (isValid) {
            System.out.println("There are equal number of 'a' and 'b'");
        } else {
            System.out.println("There are not equal number of 'a' and 'b'");
        }

        sc.close();
    }
}
import java.util.Scanner;

class Stacks {
    int top = -1;
    int[] S;
    int max;

    public Stacks(int max) {
        this.max = max;
        this.S = new int[max];
    }
    //PUSH
    public void push(int x) {
        if (top >= max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        S[top] = x;
    }
    //POP
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int popped = S[top];
            top--;
            return popped;
        }
    }
    //PEEP
    public int peep(int x) {
        if (top - x + 1 < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return S[top - x + 1];
        }
    }
    //CHANGE
    public void change(int x, int y) {
        if (top - x + 1 < 0) {
            System.out.println("Stack Underflow");
            return;
        } else {
            S[top - x + 1] = y;
        }
    }
    //DISPLAY
    public void display() {
        System.out.println("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(S[i] + " ");
        }
        System.out.println();
    }

}

public class Lab38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int max = sc.nextInt();
        Stacks S1 = new Stacks(max);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. PEEP");
            System.out.println("5. CHANGE");
            System.out.println("6. EXIT");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    int x = sc.nextInt();
                    S1.push(x);
                    break;

                case 2:
                    int popped = S1.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;

                case 3:
                    S1.display();
                    break;

                case 4:
                    System.out.println("Enter the position to peep: ");
                    int pos = sc.nextInt();
                    int peeped = S1.peep(pos);
                    if (peeped != -1) {
                        System.out.println("Element at position " + pos + ": " + peeped);
                    }
                    break;

                case 5:
                    System.out.println("Enter the position to change: ");
                    int pos1 = sc.nextInt();
                    System.out.println("Enter the new element: ");
                    int newElement = sc.nextInt();
                    S1.change(pos1, newElement);
                    break;

                case 6:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
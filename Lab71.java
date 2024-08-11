//Menu driven program to implement following operations on the circular linked list

import java.util.*;

class CircularLinkedListMethod {
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    Node first, last;

    CircularLinkedListMethod() {
        first = last = null;
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = last = newNode;
            last.link = first;
        } else {
            newNode.link = first;
            first = newNode;
            last.link = first;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            first = last = newNode;
            last.link = first;
        } else {
            newNode.link = last.link;
            last.link = newNode;
            last = newNode;
        }
    }

    public void deleteFromPosition(int position) {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = first;
        if (position == 1) {
            if (first == last) {
                first = last = null;
            } else {
                first = first.link;
                last.link = first;
            }
            return;
        }

        Node pred = null;
        for (int i = 1; temp != last && i < position; i++) {
            pred = temp;
            temp = temp.link;
        }

        if (temp == last) {
            if (temp == first) {
                first = last = null; 
            } else {
                pred.link = last.link;
                last = pred;
            }
        } else if (temp != null) {
            pred.link = temp.link;
        } else {
            System.out.println("Position out of bounds.");
        }
    }

    public void display() {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = first;
        do {
            System.out.print(temp.info + " ");
            temp = temp.link;
        } while (temp != first);

        System.out.println();
    }
}

public class Lab71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CircularLinkedListMethod l1=new CircularLinkedListMethod();
        while (true) {
            System.out.println("1. Insert at first");
            System.out.println("2. Insert at last");
            System.out.println("3. Delete specific");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number to be inserted at first:");
                    int n =sc.nextInt();
                    l1.insertAtFront(n);
                    l1.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter a number to be inserted at last:");
                    int m =sc.nextInt();
                    l1.insertAtEnd(m);
                    l1.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the position from where number is to be deleted:");
                    int p =sc.nextInt();
                    l1.deleteFromPosition(p);
                    l1.display();
                    System.out.println();
                    break;
                case 4:
                    l1.display();
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }   
}

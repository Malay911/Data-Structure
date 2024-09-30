//Menu driven program to implement following operations on the doubly linked list

import java.util.Scanner;

class doubleNode {
    int info;
    doubleNode lpter;
    doubleNode rpter;

    public doubleNode(int data) {
        this.info = data;
        this.lpter = null;
        this.rpter = null;
    }
}

class DoublyLinkedList {
    doubleNode first;

    void insertAtFront(int data) {
        doubleNode newNode = new doubleNode(data);
        if (first == null) {
            first = newNode;
        } else {
            newNode.rpter = first;
            first.lpter = newNode;
            first = newNode;
        }
    }

    void deleteNode(int position) {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }

        doubleNode current = first;
        int count = 1;
        while (current != null && count < position) {
            current = current.rpter;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        if (current.lpter != null) {
            current.lpter.rpter = current.rpter;
        } else {
            first = current.rpter;
        }

        if (current.rpter != null) {
            current.rpter.lpter = current.lpter;
        }
    }

    void insertAtEnd(int data) {
        doubleNode newNode = new doubleNode(data);
        if (first == null) {
            first = newNode;
        } else {
            doubleNode current = first;
            while (current.rpter != null) {
                current = current.rpter;
            }
            current.rpter = newNode;
            newNode.lpter = current;
        }
    }

    void display() {
        doubleNode current = first;
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.rpter;
        }
        System.out.println();
    }
}

public class Lab72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DoublyLinkedList d1=new DoublyLinkedList();
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
                    d1.insertAtFront(n);
                    d1.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the position from where number is to be deleted:");
                    int p =sc.nextInt();
                    d1.deleteNode(p);
                    d1.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter a number to be inserted at last:");
                    int m =sc.nextInt();
                    d1.insertAtEnd(m);
                    d1.display();
                    System.out.println();
                    break;
                case 4:
                    d1.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

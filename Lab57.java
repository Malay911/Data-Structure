import java.util.*;
public class Lab57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        // l1.insertAtLast(5);
        // l1.insertAtLast(15);
        // l1.insertAtLast(25);
        // l1.insertAtLast(53);
        // l1.insertAtLast(55);
        // l1.insertAtLast(35);
        // l1.display();

        // l1.deleteFirst();
        // System.out.println();
        // l1.display();
        // System.out.println();
        // l1.deleteLast();
        // System.out.println();
        // l1.display();
        // System.out.println();
        // l1.deleteSpecific(25);
        // l1.display();
        // System.out.println();
        // l1.insertAtFirst(20);
        // l1.display();
        while (true) {
            System.out.println("1. Insert at first");
            System.out.println("2. Insert at last");
            System.out.println("3. Delete first");
            System.out.println("4. Delete last");
            System.out.println("5. Delete specific");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number to be inserted at first:");
                    int n =sc.nextInt();
                    l1.insertAtFirst(n);
                    l1.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter a number to be insertwed  at last:");
                    int n1 = sc.nextInt();
                    l1.insertAtLast(n1);
                    l1.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Deleted the first node:");
                    l1.deleteFirst();
                    l1.display();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Deleted the last node:");
                    l1.deleteLast();
                    l1.display();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter a number to be deleted at specific position:");
                    int n4 = sc.nextInt();
                    l1.deleteSpecific(n4);
                    l1.display();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Node created:");
                    l1.display();
                    System.out.println();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

class LinkedList {
    Node first;

    public void insertAtFirst(int x) {
        Node newNode = new Node(x);

        if (first == null) {
            first = newNode;
        } else {
            newNode.link = first;
            first = newNode;
        }
    }

    public void insertAtLast(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;

        }
    }

    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }

    public void deleteFirst() {
        if (first == null) {
            System.out.println("Empty linkedlist");
        }
        first = first.link;
    }

    public void deleteLast() {
        if (first == null) {
            System.out.println("Empty linkedlist");
        }
        Node temp = first;
        Node previous = null;
        while (temp.link != null) {
            previous = temp;
            temp = temp.link;
        }
        previous.link = null;
    }

    public void deleteSpecific(int x) {
        Node temp = first;
        Node previous = null;
        boolean ispresent = true;
        while (temp != null) {
            if (temp.data == x) {
                Node val = temp.link;
                previous.link = val;
                ispresent = true;
                break;
            }
            previous = temp;
            temp = temp.link;
        }
        if (!ispresent) {
            System.out.println("Not there");
        }
    }
}
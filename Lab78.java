// Write a menu driven program to implement Binary Search Tree (BST) & perform following operations 
//1) Preorder Traversal,2) Postorder Traversal,3) Inorder Traversal

import java.util.Scanner;

public class Lab78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Preorder Traversal");
            System.out.println("3. Postorder Traversal");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number to be inserted:");
                    int n = sc.nextInt();
                    bst.insert(n);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Preorder Traversal: ");
                    bst.Preorder(bst.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Postorder Traversal: ");
                    bst.Postorder(bst.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Inorder Traversal: ");
                    bst.Inorder(bst.root);
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

class Node {
    int key;
    Node left, right;

    public Node(int data) {
        key = data;
        left = null;
        right = null;
    }
}

class BST {
    Node root;

    // Insert a node into the BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.key)
            root.left = insertRec(root.left, data);
        else if (data > root.key)
            root.right = insertRec(root.right, data);

        return root;
    }

    // Preorder Traversal
    public void Preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        Preorder(node.left);
        Preorder(node.right);
    }

    // Postorder Traversal
    public void Postorder(Node node) {
        if (node == null)
            return;

        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.key + " ");
    }

    // Inorder Traversal
    public void Inorder(Node node) {
        if (node == null)
            return;

        Inorder(node.left);
        System.out.print(node.key + " ");
        Inorder(node.right);
    }
}

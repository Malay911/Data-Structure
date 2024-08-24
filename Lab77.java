//Write a menu driven program to implement Binary Search Tree (BST) & perform following operations 1)Insert a node, 2)Delete a node,3)Search a node

import java.util.Scanner;

public class Lab77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number to be inserted:");
                    int n = sc.nextInt();
                    bst.insert(n);
                    bst.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter a number to be searched:");
                    int n1 = sc.nextInt();
                    if(bst.search(n1)){
                        System.out.println("Found");
                    }else{
                        System.out.println("Not Found");
                    }
                    bst.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter a number to be deleted:");
                    int n4 = sc.nextInt();
                    bst.delete(n4);
                    bst.display();
                    System.out.println();
                    break;
                case 4:
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

    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    Node insertRecursive(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecursive(root.right, key);
        }

        return root;
    }

    void display() {
        inorder(root);
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    boolean search(int key) {
        return searchRecursive(root, key);
    }

    boolean searchRecursive(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.key == key) {
            return true;
        }

        if (root.key > key) {
            return searchRecursive(root.left, key);
        }

        return searchRecursive(root.right, key);
    }

    void delete(int key) {
        root = deleteRecursive(root, key);
    }

    Node deleteRecursive(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRecursive(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.key = minValue(root.right);
            root.right = deleteRecursive(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
}
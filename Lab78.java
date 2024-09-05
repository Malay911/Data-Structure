
// Insert into binary tree using iterative method
import java.util.*;

class Node {
    int key;
    Node left;
    Node right;

    public Node(int data) {
        key = data;
        left = null;
        right = null;
    }
}

public class Lab78 {
    public static Node insertUsingIterative(Node root, int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return root;
        }

        Node temp = root;
        Node parent = null;

        while (temp != null) {
            parent = temp;
            if (data == temp.key) {
                System.out.println("Data already exists");
                return root;
            } else if (data < temp.key) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        if (data < parent.key) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        return root;
    }

    // Inorder
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    // Preorder
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key + " ");
    }

    public static void main(String[] args) {
        Node root = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert node");
            System.out.println("2. Inorder");
            System.out.println("3. Preorder");
            System.out.println("4. Postorder");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data to insert: ");
                    int data = sc.nextInt();
                    root = insertUsingIterative(root, data);
                    break;
                case 2:
                    System.out.println("Inorder traversal of the binary tree:");
                    inorder(root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Preorder traversal of the binary tree:");
                    preorder(root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Postorder traversal of the binary tree:");
                    postorder(root);
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

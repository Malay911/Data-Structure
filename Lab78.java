
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

        while (true) {
            if (data == temp.key) {
                System.out.println("Data already exists");
                return root;
            } else if (data < temp.key) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return root;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return root;
                } else {
                    temp = temp.right;
                }
            }
        }
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
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.key + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Scanner sc = new Scanner(System.in);

        // // Insert some nodes
        // root = insertUsingIterative(root, 5);
        // root = insertUsingIterative(root, 15);
        // root = insertUsingIterative(root, 3);
        // root = insertUsingIterative(root, 7);
        // root = insertUsingIterative(root, 12);
        // root = insertUsingIterative(root, 18);

        // // Print the data
        // System.out.println("In-order traversal of the binary tree:");
        // inorder(root);
        // System.out.println("\nPre-order traversal of the binary tree:");
        // preorder(root);
        // System.out.println("\nPost-order traversal of the binary tree:");
        // postorder(root);
        while (true) {
            System.out.println("1. Inorder");
            System.out.println("2. Preorder");
            System.out.println("3. Postorder");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("In-order traversal of the binary tree:");
                    inorder(root);
                    break;
                case 2:
                    System.out.println("In-order traversal of the binary tree:");
                    preorder(root);
                    break;
                case 3:
                    System.out.println("In-order traversal of the binary tree:");
                    postorder(root);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
//WAP to find the smallest and largest elements in the Binary Search Tree.

public class Lab83 {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static int findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    static int findMax(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public static void main(String args[]) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int min = findMin(root);
        int max = findMax(root);
        
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}

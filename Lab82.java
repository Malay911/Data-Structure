//Write a program to construct a binary tree from given postorder and preorder traversal sequence.

public class Lab82 {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static Node constructTree(int[] post, int[] pre, int postIndex, int preStart, int preEnd) {
        if (preStart > preEnd) {
            return null;
        }

        Node node = new Node(pre[preStart]);

        if (preStart == preEnd) {
            return node;
        }

        int i;
        for (i = preStart + 1; i <= preEnd; i++) {
            if (pre[i] == post[postIndex - 1]) {
                break;
            }
        }

        node.left = constructTree(post, pre, postIndex - (preEnd - i + 1), preStart + 1, i - 1);
        node.right = constructTree(post, pre, postIndex - 1, i, preEnd);
        return node;
    }

    static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        int[] post = {4, 2, 5, 3, 1};
        int[] pre = {1, 2, 4, 5, 3};

        Node root = constructTree(post, pre, post.length - 1, 0, pre.length - 1);

        System.out.println("Inorder traversal of constructed tree: ");
        printInorder(root);
    }
}

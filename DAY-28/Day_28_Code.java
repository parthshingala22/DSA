import java.util.*;

class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data1) {
            this.data = data1;
        }
    }

    private Node root;

    void createTree(Scanner in) {
        System.out.println("Enter the root value: ");
        int val = in.nextInt();
        root = new Node(val);
        helperTree(in, root);
    }

    private void helperTree(Scanner in, Node node) {
        System.out.println("Do you want to add left of: " + node.data);
        boolean left = in.nextBoolean();
        if (left) {
            System.out.println("Enter the left value of: " + node.data);
            int val = in.nextInt();
            node.left = new Node(val);
            helperTree(in, node.left);
        }

        System.out.println("Do you want to add right of: " + node.data);
        boolean right = in.nextBoolean();
        if (right) {
            System.out.println("Enter the right value of: " + node.data);
            int val = in.nextInt();
            node.right = new Node(val);
            helperTree(in, node.right);
        }
    }

    void display() {
        System.out.println("\nDFS (Pre-order Traversal):");
        helperDisplay(root);
    }

    private void helperDisplay(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        helperDisplay(node.left);
        helperDisplay(node.right);
    }

    void bfs() {
        if (root == null) {
            return;
        }

        System.out.println("\nBFS (Level-order Traversal):");
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.data);

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }
}

public class Day_28_Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        tree.createTree(in);

        tree.display();

        tree.bfs();
    }
}

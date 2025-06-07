import java.util.Scanner;

class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data1){
            this.data = data1;
        }
    }

    private Node root;
    void createTree(Scanner in){
        System.out.println("Enter the root value: ");
        int val = in.nextInt();
        root = new Node(val);
        helperTree(in, root);
    }

    private void helperTree(Scanner in, Node node){
        System.out.println("Do you wont to add left of: " + node.data);
        boolean left = in.nextBoolean();
        if(left){
            System.out.println("Enter the left value of: " + node.data);
            int val = in.nextInt();
            node.left = new Node(val);
            helperTree(in, node.left);
        }

        System.out.println("Do you wont to add right of: " + node.data);
        boolean right = in.nextBoolean();
        if(right){
            System.out.println("Enter the right value of: " + node.data);
            int val = in.nextInt();
            node.right = new Node(val);
            helperTree(in, node.right);
        }

    }

    void display(){
        helperDisplay(root);
    }

    private void helperDisplay(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.data);
        helperDisplay(node.left);
        helperDisplay(node.right);

    }
}

class Day_27_Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.createTree(in);
        tree.display();

        
    }
}

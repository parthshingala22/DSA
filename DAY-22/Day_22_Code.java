import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
}

public class Day_22_Code {

    static Node createLinkedList(int n) {
        if (n <= 0) return null;
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Node head = new Node(val);
        Node temp = head;

        for (int i = 1; i < n; i++) {
            int d = sc.nextInt();
            temp.next = new Node(d);
            temp = temp.next;
        }

        return head;
    }

    static boolean sortedOrNot(Node head){
        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.data > temp.next.data){
                return false;
            }
            temp = temp.next;
        }
        return true;

    }

   static Node deleteDuplicate(Node head) {
    Node temp = head;

    while (temp != null && temp.next != null) {
        if (temp.data == temp.next.data) {
            temp.next = temp.next.next;
        } else {
            temp = temp.next;
        }
    }

    return head;
}

    

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = createLinkedList(n); 
        System.out.println(sortedOrNot(head));
        // head = deleteDuplicate(head);
        // printLinkedList(head);
    }
}

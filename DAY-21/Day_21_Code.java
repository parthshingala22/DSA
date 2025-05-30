// ----------------- LeetCode :- 206. Reverse Linked List -------------------- //

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode current = head;
//         ListNode prev = null;

//         while(current != null){
//             ListNode temp = current.next;
//             current.next = prev;
//             prev = current;
//             current = temp;
//         }
//         return prev;
//     }
// }



// ------------------------ Double LinkedList ------------------- //
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }

     Node(int data1, Node prev1){
        this.data = data1;
        this.next = null;
        this.prev = prev1;
    }
    
    Node(int data1, Node next1, Node prev1){
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }
}


class Day_21_Code {

    static Node convertArrayToLinkedlist(int[] arr){
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            current.next = temp;
            temp.prev = current;
            current = temp;
        }
        return head;
    }

//    static Node deleteHead(Node head) {
//        Node temp = head;
//        head = temp.next;
//        head.prev = null;
//        temp.next = null;

//        return head;
//     }

    // static Node deleteTail(Node head){
    //     Node temp = head;
    //     while(temp.next.next != null){
    //         temp = temp.next;
    //     }
    //     temp.next.prev = null;
    //     temp.next = null;
    //     return head;

    // }
    static Node deleteNthNode(Node head, int n){
        Node temp = head;
        int count = 1;
        while(temp != null){
                if(count == n){
                  temp.next.prev = temp.prev.next;
                  temp.prev.next = temp.next;
                }
                temp = temp.next;
                count++;
            }
        
        return head;

    }
    // static Node deletByValue(Node head, int value){
    //     Node temp = head;
    //     Node prev = null;
    //     while (temp != null) {
            
    //         if(temp != null){
    //             if(temp.data == value){
    //                 prev.next = temp.next;
    //                 temp.next = null;
    //             }
    //             prev = temp;
    //             temp = temp.next;
    //         }
    //     }
    //     return head;

    // }

    // static Node insertAtHead(Node head, int value){
    //     Node newNode = new Node(value);
    //     newNode.next = head;
    //     head = newNode;

    //     return head;
    // }

    // static Node insertAtTail(Node head,int value){
    //     Node temp = head;
    //     Node newNode = new Node(value);
    //     while(temp != null){
    //         temp = temp.next;
    //     }
    //     temp.next = newNode;
    //     newNode.next = null;

    //     return head;

    // }

    // static Node insertAtNthNode(Node head , int ele , int value){
    //     Node temp = head;
    //     Node newNode = new Node(value);
    //     int count = 1;
    //     Node prev = null;
    //     while (temp != null) {
    //         if(count == ele){
    //             prev.next = newNode;
    //             newNode.next = temp;
    //         }
    //         prev = temp;
    //         temp = temp.next;
    //         count++;
            
    //     }
    //     return head;

    // }

    //  static Node insertByValue(Node head , int ele , int value){
    //     Node temp = head;
    //     Node newNode = new Node(value);
    //     Node prev = null;
    //     // while (temp != null) {
    //     //     if(temp.data == ele){
    //     //         prev.next = newNode;
    //     //         newNode.next = temp;
    //     //     }
    //     //     prev = temp;
    //     //     temp = temp.next;
            
    //     // }
    //     // return head;

    //     while (temp != null) {
    //         if(temp.data == ele){
    //             prev.next = newNode;
    //             newNode.next = temp.next;
    //             temp = temp.next;
    //         }
    //         prev = temp;
    //         temp = temp.next;
            
    //     }
    //     return head;

    // }


    static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + ((temp.next != null) ? "->" : "->null"));
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrayToLinkedlist(arr);

        // head = deleteHead(head);
        // head = deleteTail(head);
        head = deleteNthNode(head, 2);
        // head = deletByValue(head, 4);

        // head = insertAtNthNode(head, 3, 10);
        // head = insertByValue(head, 4, 15);


        print(head);
    }
}



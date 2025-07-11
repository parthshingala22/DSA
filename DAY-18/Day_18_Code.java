class Node{
    int data;
    Node next;
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
    
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
}


class Day_18_Code {

    static Node convertArrayToLinkedlist(int[] arr){
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }
        return head;
    }

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
        print(head);
    }
}

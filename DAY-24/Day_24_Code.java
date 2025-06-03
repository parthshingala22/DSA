class Day_24_Code  {
    static int push(int[] arr, int start, int end, int ele){
        if(end < arr.length - 1){
            if(start == -1){
                start = 0;
            }
            end = end + 1;
            arr[end] = ele;
        }
        else{
            System.out.println("Queue is full");
        }
        return start;
    }

    static int pop(int[] arr, int start, int end){
        if(start == end){
            System.out.println(arr[start]);
            start = -1;
            end = -1;
        }
        else{
            System.out.println(arr[start]);
            start = start + 1;
        }
        return start;
    }

    static void peek(int[] arr, int start, int end){
        if(start == -1){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println(arr[start]);
        }
    }

     static void display(int[] arr, int start, int end) {
        if (start == -1) {
            System.out.println("Queue is empty..!");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[5];
        int start = -1;
        int end = -1;

        start = push(arr, start, end, 1);   
        start = push(arr, start, end, 2);
        start = push(arr, start, end, 3);

        display(arr, start, end);

    }
}

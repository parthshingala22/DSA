
// ---------------------------- Bubble Sort ------------------------- //
// import java.util.Arrays;

// class Day_23_Code {
//    public static void main(String[] args) {
//     int[] arr = {4,1,5,3,8};

//     for(int i = 0; i < arr.length-1; i++){
//         for(int j = i+1; j < arr.length-1; j++){
//             if(arr[i] > arr[j]){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//     }
//     System.out.println(Arrays.toString(arr));
//    } 
// }


// ------------------------ Selection Sort ----------------------- //

// import java.util.Arrays;

// public class InnerDay_23_Code {

//     public static void main(String[] args) {
//         int[] arr = {4,1,5,3,8};

//         for(int i = 0; i < arr.length-1; i++){
//             int min = i;
//             for(int j = i+1; j < arr.length-1; j++){
//                 if(arr[j] < arr[min]){
//                     min = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[min];
//             arr[min] = temp;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

import java.util.*;

class Day_23_Code {
    static int push(int[] arr, int top, int ele) {
        if (top < arr.length - 1) {
            top = top + 1;
            arr[top] = ele;
        } else {
            System.out.println("Stack is full..!");
        }
        return top;
    }

    static int pop(int[] arr, int top) {
        if (top > -1) {
            System.out.println("Popped: " + arr[top]);
            top = top - 1;
        } else {
            System.out.println("Stack is empty..!");
        }
        return top;
    }

    static void peek(int[] arr, int top) {
        if (top == -1) {
            System.out.println("Stack is empty..!");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    static boolean isEmpty(int top) {
        return top == -1;
    }

    static int size(int top) {
        return top + 1;
    }

    static void display(int[] arr, int top) {
        if (top == -1) {
            System.out.println("Stack is empty..!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        int top = -1;

        top = push(arr, top, 1);
        top = push(arr, top, 2);
        top = push(arr, top, 3);
        top = pop(arr, top);
        peek(arr, top);
        System.out.println("Size: " + size(top));
        System.out.println("Is Empty? " + isEmpty(top));
        display(arr, top);
    }
}

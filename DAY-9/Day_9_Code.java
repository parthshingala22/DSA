// ----------- Q:- From a given string skip a word or skip a one charater amd print rest of the character. ------ //
// class Day_9_Code {

//     // -----------  Without Recursion  --------------------- //
//     // public static void main(String[] args) {
//     //     String a = "Hello";
//     //     char[] b = a.toCharArray();
//     //     for(int i=0; i<b.length; i++){
//     //         if(b.length != 0 && b[i] == 'e'){
//     //            continue;
//     //         }
//     //         System.out.print(b[i]);
//     //     }
//     // }

//     // --------------- Using Recursion --------------- //
//      static String skip(String ip){
//         if(ip.isEmpty()){
//             return "";
//         }
//         char ch = ip.charAt(0);

//         // if(ch = 'e'){   // removing only one character

//         // }
//         if(ip.startsWith("Hello")){    // removing one word
//             return skip(ip.substring(5));
//         }
//         else{
//             return ch + skip(ip.substring(1));
//         }

//      }

//      public static void main(String[] args) {
//         String ip = "qwerHelloasdf";
//         System.out.println(skip(ip));
//      }
    
// }

// --------------- Q:- From the given string you have to skip "he" not hello -------------- //
// class Day_9_Code {
//      static String skip(String ip){
//         if(ip.isEmpty()){
//             return "";
//         }
//         char ch = ip.charAt(0);
//         if(ip.startsWith("He" ) && ip.startsWith("Hello")){
//             return skip(ip.substring(2));
//         }
//         else{
//             return ch + skip(ip.substring(1));
//         }

//      }

//      public static void main(String[] args) {
//         String ip = "asdfHellohezxcv";
//         System.out.println(skip(ip));
//      }
    
// }


// ------------------- Q:- Reverce an array ------------------ //

import java.util.Arrays;

class Day_9_Code {
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            swap(arr, i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
     public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
     }
    
}


// ----------------------- LeetCode :- 9. Palindrome Number --------------------------- //

// class Solution {
//     public boolean isPalindrome(int x) {
//         int n = x;
//         int temp = 0;
//         if (n < 0){
//             return false;
//         }
//         while(x != 0){
//             temp = temp * 10 + x % 10;
//             x = x / 10;
//         }
//         if(n == temp){
//             return true;
//         }
//         else{
//             return false;
//         }
        
//     }
// }



// ----------------------- LeetCode :- 167. Two Sum II - Input Array Is Sorted --------------------------- //

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int[] arr = new int[2];
//         for(int i = 0; i < numbers.length; i++){
//             for(int j = i+1 ; j < numbers.length; j++){
//                 int sum = numbers[i] + numbers[j];
//                 if(sum == target){
//                     arr[0] = i+1;
//                     arr[1] = j+1;
//                     return arr;
//                 }
//             }
//         }
//         return arr;
//     }
// }
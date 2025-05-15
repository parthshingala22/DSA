// import java.util.Arrays;

// class Day_10_Code {
//     static void swap(int[] arr,int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     static void reverse(int[] arr){
//         int i=0;
//         int j=arr.length-1;

//         while(i<j){
//             swap(arr, i,j);
//             i++;
//             j--;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
//      public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         reverse(arr);
//      }
    
// }


class Day_10_Code {
    static void swap(char[] arr,int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(char[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            swap(arr, i,j);
            i++;
            j--;
        }
        System.out.println(arr);
    }
     public static void main(String[] args) {
        String str = "Hello";
        char[] arr = str.toCharArray();
        reverse(arr);
     }
}



// ----------------------- LeetCode :- 344. Reverse String --------------------------- //

// class Solution {
//     static void swap(char[] s , int i, int j){
//         char temp = s[i];
//         s[i] = s[j];
//         s[j] = temp;
//     }
//     static void reverseString(char[] s) {
//         int i = 0;
//         int j = s.length-1;

//         while(i<j){
//            swap(s,i,j);
//            i++;
//            j--;
//         }
//         System.out.print(s);
//     }
// }



// ----------------------- LeetCode :- 345. Reverse Vowels of a String --------------------------- //

// class Solution {
//     static void swap(char[] arr, int i, int j) {
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static String reverseVowels(String s) {
//         char[] arr = s.toCharArray();
//         int i = 0;
//         int j = arr.length - 1;

//         while (i < j) {
//             boolean IV = isVowel(arr[i]);
//             boolean JV = isVowel(arr[j]);

//             if (IV && JV) {
//                 swap(arr, i, j);
//                 i++;
//                 j--;
//             } else if (!IV) {
//                 i++;
//             } else if (!JV) {
//                 j--;
//             }
//         }
//         return new String(arr);
//     }

//     static boolean isVowel(char c) {
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
//     }
// }












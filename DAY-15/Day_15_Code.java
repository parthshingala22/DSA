// class Day_15_Code {
//      public static int lowerBound(int[] arr, int target) {
//         int low = 0, high = arr.length;
//         while (low < high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid;
//             }
//         }
//         return low;
//     }

//     public static int upperBound(int[] arr, int target) {
//         int low = 0, high = arr.length;
//         while (low < high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] <= target) {
//                 low = mid + 1;
//             } else {
//                 high = mid;
//             }
//         }
//         return low;
//         // return low - 1;  // -------> This give last accurence 
//      }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 4, 4, 5, 7, 9};
//         int target = 4;

//         int lb = lowerBound(arr, target);
//         int ub = upperBound(arr, target);
//         System.out.println("Lower Bound Index: " + lb);
//         System.out.println("Upper Bound Index: " + ub);
//     }
// }





// class Day_15_Code {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 4, 4, 5, 7, 9};
//         int l = 0;
//         int r = arr.length - 1;

//         while(l<r){
//             int mid = l + (r - l) / 2;
            
//             if(arr[mid] > arr[r]){
//                 l = mid + 1;
//             }
//             else{
//                 r = mid;
//             }

//         }
//         System.out.println(arr[l]);

//     }
// }



// -------------- Prefix Sum ------------------------- //

// import java.lang.reflect.Array;
// import java.util.Arrays;

// class Day_15_Code {
//     public static void main(String[] args) {
//         int[] arr = {2,3,5,7,9};

//         int[] prefix = new int[arr.length];

//         prefix[0] = arr[0];
//         for(int i = 1; i < arr.length; i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }
//         System.out.println(Arrays.toString(prefix));


//     }
// }



// -------------------- Prefix Sum for given index ----------------- //

class Day_15_Code {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9};
        int left = 1;
        int right = 3;

        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        if(left == 0){
            System.out.println(prefix[right]);
        }
        else{
            System.out.println(prefix[right] - prefix[left-1]);
        }
        


    }
}


// ----------------- LeetCode :- 153. Find Minimum in Rotated Sorted Array -------------------- //

// class Solution {
//     public int findMin(int[] nums) {
//          int l = 0;
//         int r = nums.length - 1;

//         while(l<r){
//             int mid = l + (r - l) / 2;
            
//             if(nums[mid] > nums[r]){
//                 l = mid + 1;
//             }
//             else{
//                 r = mid;
//             }

//         }
//         return nums[l];
//     }
// }
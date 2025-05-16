import java.util.*;
class Day_11_Code {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,1,2,1,0,0,1};
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// ----------------------------- Dutch natational flag sorting algorithm ---------------------- //

// import java.util.*;

// class Day_11_Code {
//     static void swap(int[] arr, int m, int l) {
//         int temp = arr[m];
//         arr[m] = arr[l];
//         arr[l] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 0, 2, 0, 1, 2, 1, 0, 0, 1};
//         int m = 0;
//         int l = 0;
//         int h = arr.length - 1;

//         while (m <= h) {
//             if (arr[m] == 0) {
//                 swap(arr, m, l);
//                 m++;
//                 l++;
//             } else if (arr[m] == 1) {
//                 m++;
//             } else { 
//                 swap(arr, m, h);
//                 h--;
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }



// import java.util.*;

// class Day_11_Code {
//     public static void main(String[] args) {
//         int[] num = {2,7,11,15};
//         int target = 9;
//         int[] arr = new int[2];
//         Set<Integer> value = new HashSet<>();
        
//         for(int i = 0; i< num.length-1; i++){
//             value.add(arr[i]);

//             int rem = target - num[i];
//             if(value.contains(rem)){
//                 arr[0] = num[i];
//                 arr[1] = rem;
//                 System.out.println(arr); 
//             }
//         }
//         System.out.println(arr);
//     }
// }



// ----------------------- LeetCode :- 1. Two Sum --------------------------- //

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] arr = new int[2];
//         int sum = 0;
//         for(int i = 0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 sum = nums[i] + nums[j];
//                 if(sum == target){
//                     arr[0] = i;
//                     arr[1] = j;
//                     return arr;
//                 }
//             }

//         }
//         return arr;
        
//     }
// }



// ----------------------- LeetCode :- 11. Container With Most Water --------------------------- //

// import java.util.*;
// class Solution {
//     public int maxArea(int[] height) {
//         int i = 0;
//         int j = height.length-1;
//         int max = 0;
//         while(i<j){
//                 int length = j-i;
//                 int heigh = Math.min(height[i],height[j]);
//                 int cap = length * heigh;
//                 if(height[i]<height[j]){
//                    i++;
//                 }
//                 else{
//                     j--;
//                 }
//                 max = Math.max(max,cap);
//         }
//         return max;

//     }
// }


// ----------------------- LeetCode :- 75. Sort Colors --------------------------- //

// class Solution {
//     static void swap(int[] nums, int m, int l) {
//         int temp = nums[m];
//         nums[m] = nums[l];
//         nums[l] = temp;
//     }

//     public void sortColors(int[] nums) {
//         int m = 0;
//         int l = 0;
//         int h = nums.length - 1;

//         while (m <= h) {
//             if (nums[m] == 0) {
//                 swap(nums, m, l);
//                 m++;
//                 l++;
//             } else if (nums[m] == 1) {
//                 m++;
//             } else { 
//                 swap(nums, m, h);
//                 h--;
//             }
//         }
//     }
// }



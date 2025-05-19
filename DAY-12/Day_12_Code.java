// ------------------- Sub Strings --------------------- //
class Day_12_Code {
    public static void main(String[] args) {
       String ip = "abc";
       subseq(ip,"");
    }

    static void subseq(String ip, String op){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }

        char ch = ip.charAt(0);
        subseq(ip.substring(1),op+ch);
        subseq(ip.substring(1), op);
    }
}




// ----------------------- LeetCode :- 169. Majority Element --------------------------- //

// class Solution {
//     public int majorityElement(int[] nums) {
//         int count = 0;
//         int target = nums[0];
//         int n = nums.length;

//         for(int i = 0; i < n - 1; i++){
//             if(nums[i] == target){
//                 count++;
//             }
//             else{
//                 count--;
//             }

//             if(count == 0){
//                 target = nums[i+1];
//             }
//         }
//         if(count > n/2){
//             return target;
//         }
//         return target;
//     }
// }



// ----------------------- LeetCode :- 1423. Maximum Points You Can Obtain from Cards --------------------------- //

// class Solution {
//     public int maxScore(int[] cardPoints, int k) {
//         int n = cardPoints.length;
//         int total = 0;
//         for (int i = 0; i < k; i++) {
//             total += cardPoints[i];
//         }

//         int maxSum = total;
//         for (int i = 1; i <= k; i++) {
//             total = total - cardPoints[k - i] + cardPoints[n - i];
//             maxSum = Math.max(maxSum, total);
//         }

//         return maxSum;
//     }
// }



// ----------------------- LeetCode :- 128. Longest Consecutive Sequence --------------------------- //

// import java.util.*;

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Set<Integer> st = new HashSet<>();
//         for (int num : nums) {
//             st.add(num);
//         }

//         int longestStreak = 0;

//         for (int num : st) {
//             if (!st.contains(num - 1)) {
//                 int currentNum = num;
//                 int currentStreak = 1;

//                 while (st.contains(currentNum + 1)) {
//                     currentNum += 1;
//                     currentStreak += 1;
//                 }

//                 longestStreak = Math.max(longestStreak, currentStreak);
//             }
//         }

//         return longestStreak;
//     }
// }



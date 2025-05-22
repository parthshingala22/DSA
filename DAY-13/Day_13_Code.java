// ----------------- LeetCode :- 3. Longest Substring Without Repeating Characters -------------------- //

// import java.util.*;
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int l = 0;
//         int max = 0;
//         HashSet<Character> ch = new HashSet<>();

//         for(int i = 0; i < s.length(); i++){
//             char current = s.charAt(i);

//             while(ch.contains(current)){
//                 ch.remove(s.charAt(l));
//                 l++;
//             }
//             ch.add(current);
//             max = Math.max(max,i-l+1);
//         }
//         return max;

//     }
// }




// ----------------- LeetCode :- 1004. Max Consecutive Ones III -------------------- //

// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int left = 0;
//         int maxLen = 0;
//         int zeros = 0;

//         for (int right = 0; right < nums.length; right++) {
//             if (nums[right] == 0) {
//                 zeros++;
//             }

//             while (zeros > k) {
//                 if (nums[left] == 0) {
//                     zeros--;
//                 }
//                 left++;
//             }

//             maxLen = Math.max(maxLen, right - left + 1);
//         }

//         return maxLen;
//     }
// }

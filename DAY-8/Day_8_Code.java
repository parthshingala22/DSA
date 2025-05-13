// ----------------------- LeetCode :- 455. Assign Cookies --------------------------- //

// import java.util.*;
// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         int count = 0;
//         int n = s.length;
//         int m = g.length;
//         int j = 0;
//         int i = 0;
//         Arrays.sort(g);
//         Arrays.sort(s);
//         while(i<m && j<n){
//             if(g[i] <= s[j]){
//                 i++;
//                 j++;
//                 count++;
//             }else{
//                 j++;
//             }
//         }
//         return count;
//     }
// }



// ----------------------- LeetCode :- 860. Lemonade Change --------------------------- //

// class Solution {
//     public boolean lemonadeChange(int[] bills) {
//         int n = bills.length;
//         int Money_5 = 0;
//         int Money_10 = 0;
//         for(int i=0; i<n; i++){
//             if(bills[i] == 5){
//                Money_5++;
//             }
//             else if(bills[i] == 10){
//                 if(Money_5 == 0){
//                     return false;
//                 }
//                 Money_5--;
//                 Money_10++;
//             }
//             else if(bills[i] == 20){
//                 if(Money_5 == 0){
//                     return false;
//                 }
//                 if(Money_10 != 0){
//                     Money_10--;
//                     Money_5--;
//                 }else if(Money_5 >=3){
//                         Money_5-=3;
//                 }else{
//                     return false;
//                 }

//             }
//         }
//         return true;
//     }
// }



// ----------------------- LeetCode :- 55. Jump Game --------------------------- //

class Solution {
    public boolean canJump(int[] nums) {
        int jump = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if( jump < 0){
                return false;
            }
            else if(nums[i]>jump){
                jump = nums[i];
            }
            jump = jump-1;
        }
        return true;
    }
}
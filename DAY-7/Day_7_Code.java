// class Day_7_Code{
//     public static int main(String args[])
//     {
//         int[] arr = {6,8,0,1,3};
//         int[] stack = {};
//         for(int i = 0; i<arr.length-1; i++){
//             for(int j = 0; j<=i; j++)
//             {
//                if(arr[i]<arr[i+1]){
//                   arr[j] = arr[i+1];
//                 }
//                else{
//                 return -1;
//                }
//             }
//         }
//     }
// }

// ---------------------- leaders code ------------------------- //
// import java.util.*;
// class Day_7_Code{
//     public static void main(String args[]){
//         int[] values = {7,1,5,3,6,4};
//         ArrayList<Integer> leaders = new ArrayList<>();
//         int Max = Integer.MIN_VALUE;
//         // int Max = 0;
//         // System.out.print(Max);
//         int n = values.length;
//         for(int i=n-1; i>=0; i--){
//             if(values[i]>Max){
//                 leaders.add(values[i]);
//                 Max = values[i];
//             }
//         }
//         System.out.print(leaders);
//     }
// }


import java.util.*;
class Day_7_Code{

    public static long maxSubarraySum(int[] arr,int n){
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for(int i=0; i<n;i++){
            sum += arr[i];

            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int[] arr = {-2,1,3,-4,6,-1};
        int n = arr.length;
        System.out.print(maxSubarraySum(arr,n));
    }
}
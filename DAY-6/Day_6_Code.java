import java.util.*;
// class Day_6_Code{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int[][] arr = new int[3][3];
//         for(int i=0; i<arr.length;i++){
//             for(int j=0; j<arr[i].length; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         for(int i=0; i<arr.length;i++){
//             for(int j=0; j<arr[i].length; j++){
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }


// class Day_6_Code{
//     public static void main(String args[]){

//         static boolean(int[] arr){
//             for(int i=0; i<arr.length-1;i++){
//                 for(int j=arr.length-1; j<)
//                 int temp = arr[i];
//             }
//         }
//         int[] arr = {1,0,1,0,1,0};
//         int i = 0;
//         int j = arr.length-1;
//         while(i<j){
//             if(arr[i] == 1){
//                 if(arr[j] == 0){

//                 }
//                 j++;
//             }
//         }
//     }
// }


// class Day_6_Code{
//     public static void main(String args[])
//         int a = 1;
//         int b = 2;
//         a = b;
//         b = a;
//         System.out.print(a+" "+b);
        
    
// }


// -------------------- Sum of zig-zag NUmber ---------------- //
// class Day_6_Code{
//     public static void main(String args[]){
//         int[][] arr = {{1,2,3},
//                        {4,5,6},
//                        {7,8,9}};
//         int sum = 0;
//         for(int i=0; i<arr[0].length; i++){
//             sum += arr[0][i];
//             sum += arr[arr.length - 1][i];
//         }
//         for(int j=1;j<arr.length-1;j++){
//             sum += arr[j][j];
//         }
//         System.out.print(sum);
//     }
        
// }



// ------------------ Missing value ------------------------ //
// class Day_6_Code{
//     public static void main(String args[]){
//         int[] arr = {1,2,3,5,6,7,8,9};
//         int res = 0;
//         for(int i=0; i<arr.length-1;i++){
//             if(arr[i] +1 != arr[i+1])
            
//                 res = arr[i] + 1;
//             }
//             System.out.print(res);
//     }    
// }

// ----------------------- Maximum Consecutive ones ----------------- //
class Day_6_Code{
    public static void main(String args[]){
        int[] arr = {1,0,1,0,1,1,1,1,0,1,1};
        int Max = 0;
        int Count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
               Count++;
               if(Max<Count){
                Max = Count;
               }
            }
            else{
                Count = 0;
            }
        } 
        System.out.print("Maximum Consecutive Ones Is:"+Max);
    }
}









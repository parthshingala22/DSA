// import java.util.*;
// class Day_5_Code{
//     public static void main(String args[]){
//         // int[] arr = {1,2,3,4,5};
//         // // for(int i=0; i<arr.length; i++){
//         // //     System.out.println(arr[i]);
//         // // }
//         // System.out.println(Arrays.toString(arr));
        
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         for(int i=0; i<arr.length; i++){
//             int a = sc.nextInt();
//             arr[i] = a;
//         }
//         //  for(int i=0; i<arr.length; i++){
//         //     System.out.print(arr[i]);
//         // }
//         // for(int i:arr){
//         //     System.out.print(i);
//         // }
//         System.out.print(Arrays.toString(arr));

//     }
// }

// ---------------------- Count Even & Odd number in the array -------------------//
// class Day_5_Code{
//     public static void main(String args[]){
//         int[] arr= {1,2,3,4,5};
//         int count1 = 0;
//         int count2 = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]%2 == 0){
//                 count1++;
//             }
//             else{
//                 count2++;
//             }
//         }
//         System.out.println("Even Number Count No:"+count1);
//         System.out.print("Odd Number Count No:"+count2);
//     }
// }


// ------------------- print height value in the array ------------------- //
// class Day_5_Code{
//     public static void main(String args[]){
//         int[] arr= {1,2,3,4,5};
//         int highValue = arr[0];
//         int secondHighValue = arr[0];
//         for(int i=0; i<arr.length-1; i++){
//             if(highValue < arr[i+1]){
//                 highValue = arr[i+1];
//             }

//         }
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] > secondHighValue && arr[i] != highValue && secondHighValue != highValue){
//                 secondHighValue = arr[i];
//             }

//         }
//         System.out.println("Higher value is:"+highValue);
//         System.out.print("SecondHigher value is:"+secondHighValue);
//     }
// }

// ------------------------- check wheather the given array is sorted or not -------------------------- //
// class Day_5_Code{
//        static boolean sortedArray(int[] arr){
//             for(int i = 1; i<arr.length; i++){
//                if(arr[i]<arr[i-1]){
//                 return false;
//                }
//             }
//             return true;

//         } 
//     public static void main(String args[]){
//         int[] arr= {1,2,3,4,5};
//         if(sortedArray(arr)){
//             System.out.print("Given array is sorted");
//         }
//         else{
//             System.out.print("Given array is not sorted");
//         }

//     }
// }

// ----------------------- Check wheather element is there are not ---------------------- //
class Day_5_Code{
    static boolean checkElement(int[] arr){
            int targetElement = 5;
            for(int i = 0; i<arr.length; i++){
               if(arr[i] == targetElement){
                return true;
               }
            }
            return false;

    } 

    public static void main(String args[]){
        int[] arr= {1,2,3,4,5};
        if(checkElement(arr)){
            System.out.print("Element is there");
        }
        else{
            System.out.print("Element is not there");
        }

    }
}



// ---------------------- [1,0,1,0,1,0] move all zeros to right side like [1,1,1,0,0,0] -------------- //
// class Day_5_Code{
//     public static void main(String args[]){
//         int[] arr= {1,0,1,0,1,0};
//         for(int i=0;i<arr.length-1;i++){
//              if(arr[i] == 0){
//                 arr[i+1] = arr[i];
//              }
//         }
//         System.out.print(arr);
//     }
// }

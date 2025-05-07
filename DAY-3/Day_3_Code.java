import java.util.*;
// ---------------- Peturn ------------------- //

// class Day_3_Code{
//     public static void main (String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// class Day_3_Code{
//     public static void main (String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
               
//                if(i==1 || i==5 || j==1 || j==5 ){
//                   System.out.print("*");
//                }
//                else{
//                  System.out.print(" ");
//                }
//             }
//             System.out.println();
//         }
//     }
// }


// class Day_3_Code{
//     public static void main (String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
               
//                if(i==1 || i==5 || j==1 || j==5 || i==j || i+j == 6){
//                   System.out.print("*");
//                }
//                else{
//                  System.out.print(" ");
//                }
//             }
//             System.out.println();
//         }
//     }
// }


// class Day_3_Code{
//     public static void main (String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
               
//                if(j==1 || j==5 || (i==j && i<4)||(i+j==6 && i<4)){
//                   System.out.print("*");
//                }
//                else{
//                  System.out.print(" ");
//                }
//             }
//             System.out.println();
//         }
//     }
// }


// class Day_3_Code{
//     public static void main (String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<i+1;j++){
//               if(j==1 || i==5 || i==j) {
//                 System.out.print("*");
//               }
//               else{
//                 System.out.print(" ");
//               }
//             }
//             System.out.println();
//         }
//     }
// }




class Day_3_Code{
    public static void main (String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
              if(j==1 || i==5 || i==1 || j==5) {
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            System.out.println("*");
        }

        int n= 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                if (j == n - i || j == n + i || (i == n / 2 && j > n - i && j < n + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
 
        }


        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
              if(j==1 || i==5 || i==1 || j==5) {
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if (j==1 || i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }            
        
    }
}



//  class Day_3_Code{
//     public static void main (String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                System.out.print(); 
//             }
//             System.out.println();
//         }
//     }
// }



// --------------------- Prime Number ---------------- //
// public class Day_3_Code {
//     public static void main(String[] args) {
//         int start = 1, end = 10;

//         for (int i = start; i <= end; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }

//     static boolean isPrime(int n) {
//         if (n < 2) return false;
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) return false;
//         }
//         return true;
//     }
// }


// -------------------- Armstrong Number ----------------- //
// class Day_3_Code{
//     public static void main(String[] args) {
//         int num = 153, sum = 0, temp = num;

//         while (temp > 0) {
//             int digit = temp % 10;
//             sum += digit * digit * digit;
//             temp /= 10;
//         }

//         if (sum == num)
//             System.out.println(num + " is an Armstrong number.");
//         else
//             System.out.println(num + " is not an Armstrong number.");
//     }
// }










import java.util.*;

// ---------------- Print day using if else statement --------------------//
// class Day_4_Code{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Enter Number:");
//         int a = sc.nextInt();
//         if(a==1){
//             System.out.print("Monday");
//         }
//         else if(a==2){
//              System.out.print("Tuesday");
//         }
//         else if(a==3){
//              System.out.print("Wednesday");
//         }
//         else if(a==4){
//              System.out.print("Thursday");
//         }
//         else if(a==5){
//              System.out.print("Friday");
//         }
//         else if(a==6){
//              System.out.print("Satureday");
//         }
//         else if(a==7){
//              System.out.print("Sunday");
//         }
//         else{
//              System.out.print("Not a valid number");
//         }
//     }
// }


// --------------------- Print day using switch case ----------------------- //
// class Day_4_Code{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number:");
//         int a = sc.nextInt();
//         switch(a){
//             case 1:
//                  System.out.print("Monday");
//                  break;
//             case 2:
//                  System.out.print("Tuesday");
//                  break;
//             case 3:
//                  System.out.print("Wednesday");
//                  break;
//             case 4:
//                  System.out.print("Thursday");
//                  break;
//             case 5:
//                  System.out.print("Friday");
//                  break;
//             case 6:
//                  System.out.print("Saturday");
//                  break;
//             case 7:
//                  System.out.print("Sunday");
//                  break;
//             default:
//                  System.out.print("Give valid number");
//         }
//     }
// }

// ------------------ OR ------------------------- //

// class Day_4_Code{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number:");
//         int a = sc.nextInt();
//         switch(a){
//             case 1 -> System.out.print("Monday");
//             case 2 -> System.out.print("Tuesday");
//             case 3 -> System.out.print("Wednesday");
//             case 4 -> System.out.print("Thursday");
//             case 5 -> System.out.print("Friday");
//             case 6 -> System.out.print("Saturday");
//             case 7 -> System.out.print("Sunday");
//             default -> System.out.print("Give valid number");
//         }
//     }
// }


// --------------------- Taranary Operator ----------------------- //
// class Day_4_Code{
//     public static void main(String args[]){
//         int n = 5;
//         String res = (n==5) ? ("Yes") : ("No");
//         System.out.print(res); 
//     }
// }


// ------------- For each loop ----------------- //
// class Day_4_Code{
//     public static void main(String args[]){
//         int[] arr = {1,2,3,4,5};
//         for(int Var : arr){
//             System.out.print(Var);
//         }
//     }
// }


class Day_4_Code{
    public static void main(String args[]){
        int n = 12345;
        int length = String.valueOf(n).length();
        int temp_len = length;
        int sum=0;
        int temp = n;
        int temp_sum = sum;
        for (int i = 0; i < temp_len; i++){
            sum=0;
            while(n != 0){
                temp = n%10;
                sum += temp;  
                n = n/10;
            }
            n=sum;
            temp_sum = sum;
            temp_len = String.valueOf(temp_sum).length();
        }
        System.out.print(sum);
    }
}


// class Day_4_Code{
//     public static void main(String args[]){
//         int n = 12345;
//         int temp = n;
//         while(n>9){
//             int sum=0;
//             while(n != 0)
//             {
//                 temp = n%10;
//                 sum += temp;  
//                 n = n/10;
//             }
//             n=sum;

//         }   
//         System.out.print(n);
//     }
// }





// class Day_4_Code
// {
//     public static void main(String args[])
//     {
//        for(int i=1;i<=5;i++)
//        {
//                 for(int j=1;j<=(6-i);j++)
//                 {
//                     System.out.print(j);
//                 }
//                 System.out.println();
//         }
//     }
// }


// -------------- Dimond Peturn ------------------- //
// class Day_4_Code
// {
//     public static void main(String args[])
//     {
//        for(int i=1;i<=5;i++)
//        {
//                 for(int j=1;j<=(6-i);j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(int k=1;k<=2*i-1;k++)
//                 {
//                     System.out.print("*");
//                 }
//                 System.out.println();
                
//         }

//         for(int i=4;i<=2*i-1;i--)
//         {
//                 for(int j=1;j<=(6-i);j++)
//                 {
//                     System.out.print(" ");
//                 }
//                 for(int k=1;k<=2*i-1;k++)
//                 {
//                     System.out.print("*");
//                 }
//                 System.out.println();
                
//         }
//     }
// }
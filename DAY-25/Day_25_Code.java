// import java.util.*;

// class Day_25_Code {
//     public static void main(String[] args) {
//         int num = 22;
//         // while(num != 1){
//         //     int temp = num % 2;
//         //     num = num / 2;
//         //     System.out.println(temp);
//         // }
//         // System.out.println(1);
//         int place = 1;
//         int sum = 0;
//         while(num > 0){
//             int r = num % 2;
//             sum = sum + r * place;
//             place = place * 10;
//             num = num / 2;
//         }
//         System.out.println(sum);
//     }
// }



// ------------------------- swap two number by using XOR --------------- //
// import java.util.*;

// class Day_25_Code {
//     public static void main(String[] args) {
//         int a = 11;
//         int b = 13;

//         a = a^b;
//         b = a^b;
//         a = a^b;

//         System.out.println(a);
//         System.out.println(b);
//     }
// }




import java.util.*;

class Day_25_Code {
    public static void main(String[] args) {
        int num = 21;
        int safe = num;
        int place = 1;
        int sum = 0;
        while(num > 0){
            int r = num % 2;
            sum = sum + r * place;
            place = place * 10;
            num = num / 2;
        }
        System.out.println(sum);
        num = safe;
        int i = 3;
        int bits = 1<<i;
        int ans=(num & bits);
        if(ans != 0){
            
            System.out.println("is set bit");
        }
        else{
            System.out.println("is not set bit");

        }
        

    }
}
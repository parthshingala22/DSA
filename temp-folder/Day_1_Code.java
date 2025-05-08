// --------------- Basic Syntax -------------//

// class Day_1_Code{
//     public static void main (String[] args) {
//         System.out.print("Hello World");
//     }
// }

//  class Day_1_Code{
//     public static void main (String[] args) {
//         System.out.print("Hello World");
//         System.out.println("Hello");
//     }
// }



// ----------------- Input from the user ------------------//
import java.util.*;
class Day_1_Code{
    public static void main (String[] args) {
        System.out.print("Enter the number:");
        Person p1 = new Person();
        System.out.print(p1.a);
    }
}
class Person{
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
}



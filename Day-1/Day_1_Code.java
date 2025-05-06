// --------------- Basic Syntax -------------//

// class Day_1_Code{
//     public static void main (String[] args) {
//         System.out.print("Hello World");
//     }
// }



// ----------------- Input from the user ------------------//
import java.util.Scanner;
class Day_1_Code{
    public static void main (String[] args) {
        Person p1 = new Person();
        System.out.print(p1.a);
        
    }
}
class Person{
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
}



// class Day_2_Code{
//     public static void main(String[] args){
//         System.out.println("Static Block");
//     }
// }

// public class q2{
//     public static void main(String args[]){
//          Day_2_Code d1 = new  Day_2_Code();
//          Day_2_Code d2 = new  Day_2_Code();
//     }
// }

// class Day_2_Code{
//     static{
//         System.out.println("Static Block");
//     }
//      Day_2_Code(){
//         System.out.println("Constructeor");
//     }
// }



// ------------------- Constructor --------------------- //

// class Day_2_Code{
//     public static void main(String args[]){
//         Student d1 = new Student();

//         d1.setAge(15);
//         int res1 = d1.getAge();
//         System.out.println(res1);

//         d1.setName("Parth");
//         String res2 = d1.getName();
//         System.out.println(res2);

//         d1.setPassedout(true);
//         boolean res3 = d1.getPassedout();
//         System.out.println(res3);

//         d1.setMarks(90);
//         float res4 = d1.getMarks();
//         System.out.println(res4);

//         d1.setERP(123456);
//         long res5 = d1.getERP();
//         System.out.println(res5);
//     }
// }

// class Student{
//     int age;
//     String name;
//     boolean passedout;
//     float marks;
//     long ERP;

//     void setAge(int age1){
//         this.age = age1;
//     }

//     int getAge(){
//         return age;
//     }

//     void setName(String name1){
//         this.name = name1;
//     }

//     String getName(){
//         return name;
//     }

//     void setPassedout(boolean passedout1){
//         this.passedout = passedout1;
//     }

//     boolean getPassedout(){
//         return passedout;
//     }

//     void setMarks(float marks1){
//         this.marks = marks1;
//     }

//     float getMarks(){
//         return marks;
//     }

//     void setERP(long ERP1){
//         this.ERP = ERP1;
//     }

//     long getERP(){
//         return ERP;
//     }
// }


// ----------------- Recursion ------------------ //

// class Day_2_Code{
//     public static void main(String args[]){
//         Recursion s1 = new Recursion();
//         int res = s1.fib(10);
//         System.out.println(res);
//     }
// }

// class Recursion{
//     int fib(int a){

//         if(a == 0){
//             return 0;
//         }
//         else if(a == 1){
//             return 1;
//         }
//         else {
//             return fib(a-1) + fib(a-2);
//         }
//     }
// }


// --------------------- Factorial -------------------- //

// class Day_2_Code{
//     public static void main(String args[]){
//         Factorial s1 = new Factorial();
//         int res = s1.factorial(0);
//         System.out.println(res);
//     }
// }


// class Factorial{
//     int factorial(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         else{
//             return n*factorial(n-1);
//         }
//     }
// }

// ------------------ HCF ------------------- //
// class Day_2_Code{
//     public static void main(String args[]){
//         Hcf s1 = new Hcf();
//         int res = s1.hcf(18,12);
//         System.out.println(res);
//     }
// }

// class Hcf{
//     int hcf(int a, int b){
//         if(b==0){
//             return a;
//         }
//         else{
//             return hcf(b,a%b);
//         }
//     }
// }


// -------------- 5 Table using for loop------------------- //
// class Day_2_Code{
//     public static void main(String args[]){
//         for(int i=1; i<11 ; i++){
//             System.out.println("5 X "+i+"="+5*i);
//         }
//     }
// }

// -------------- 5 Table using while loop------------------- //
// class Day_2_Code{
//     public static void main(String args[]){
//        int i=1;
//        while(i<11){
//         System.out.println("5 X "+i+"="+5*i);
//         i++;
//        }
//     }
// }


class Day_2_Code{
    public static void main(String args[]){
        int n = 5;
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<5 ; i++){
           
        }
    }
}



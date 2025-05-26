// class A{
//     static void method1(){
//           System.out.println("Hello");
//     }

//     int method2(int a,int b){
//           return a+b;
//     }
// }

// class B{
//     int method3(int a,int b){
//           return a-b;
//     }

// }


// class Day_17_Code {
//     public static void main(String[] args) {
//         A ob1 = new A();
//         B ob2 = new B();

//         A.method1();

//         int res1 = ob1.method2(1, 4);
//         System.out.println(res1);

//         int res2 = ob2.method3(4,2); 
//         System.out.println(res2);

//     }
  
// }



// ------------------------ Single inheritance ------------------------ //

// class A{
//     static void method1(){
//           System.out.println("Hello");
//     }

//     int method2(int a,int b){
//           return a+b;
//     }
// }

// class B extends A{
//     int method3(int a,int b){
//           return a-b;
//     }

// }


// class Day_17_Code {
//     public static void main(String[] args) {
//         A ob1 = new A();
//         B ob2 = new B();

//         B.method1();

//         int res1 = ob2.method2(1, 4);
//         System.out.println(res1);

//         int res2 = ob2.method3(4,2); 
//         System.out.println(res2);

//     }
  
// }



// ------------------------ Multi-Level inheritance ------------------------ //

// class A{
//     static void method1(){
//           System.out.println("Hello");
//     }

//     int method2(int a,int b){
//           return a+b;
//     }
// }

// class B extends A{
//     int method3(int a,int b){
//           return a-b;
//     }

// }

// class C extends B{
//     void method4(){
//         System.out.println("Hello World");
//     }
// }


// class Day_17_Code {
//     public static void main(String[] args) {
//         A ob1 = new A();
//         B ob2 = new B();
//         C ob3 = new C();

//         C.method1();

//         int res1 = ob3.method2(1, 4);
//         System.out.println(res1);

//         int res2 = ob3.method3(4,2); 
//         System.out.println(res2);

//     }
  
// }



// ------------------------ Hierachy-Level inheritance ------------------------ //

// class A{
//     static void method1(){
//           System.out.println("Hello");
//     }

//     int method2(int a,int b){
//           return a+b;
//     }
// }

// class B extends A{
 

// }

// class C extends A{
    
// }


// class Day_17_Code {
//     public static void main(String[] args) {
//         B obj2 = new B();
//         C obj3 = new C();

//         obj2.method1();
//         System.out.println(obj3.method2(3,4));
//     }
  
// }




// ------------------------ Method Over-Loading and Over-Riding (Polymorphism) ------------------------ //

// class A{
//     int method1(int a,int b){        
//           return a+b;
//     }

//     int method1(int a,int b, int c){     // Over-Loading(Diffrent Parameter)
//           return a+b+c;
//     }
// }

// class B extends A{
//     int method1(int a, int b){         // Over-Riding(Same Parameter)
//         return a-b;
//     }
   
// }


// class Day_17_Code {
//     public static void main(String[] args) {
//         B obj2 = new B();
        
//         System.out.println(obj2.method1(4,3));
//         System.out.println(obj2.method1(1, 2, 3));
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

// class Day_17_Code{
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




// ---------------- abstract class and method -------------------------- //

// abstract class A{
//     abstract int method1(int a , int b);   // Contain abstact method and also contain non abstarct method
//     void print(){                            
//         System.out.println("Hello");
//     }
// }

// class B extends A{
//     int method1(int a,int b){
//           return a-b;
//     }

// }


// class Day_17_Code {
//     public static void main(String[] args) {
//         B ob2 = new B();

//     int res = ob2.method1(4, 3);
//     System.out.println(res);

//     }
  
// }



// ---------------- Interface class and abstract method -------------------------- //
// interface A{
//     public int method1(int a , int b);   // Contain incomplite method only. And define the method as public
// }

// class B implements A{
//     public int method1(int a,int b){
//           return a-b;
//     }

// }


// class Day_17_Code {
//     public static void main(String[] args) {
//     B ob2 = new B();

//     int res = ob2.method1(4, 3);
//     System.out.println(res);

//     }
  
// }








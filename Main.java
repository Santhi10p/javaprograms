package day8;
abstract class Base {
 abstract void fun();
}
class Derived extends Base {
 void fun()
 {
     System.out.println("Derived fun() called");
 }
}

class Main {

 public static void main(String args[])
 {

     Derived b = new Derived();
     b.fun();
 }
}



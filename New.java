package day8;


class Parent2{

public void display() {
	System.out.println("Display method of Parent");
}
}
class Child2 extends Parent2{
public void display() {
super.display();
System.out.println("Display method of child");
}
}

public class New {

public static void main(String[] args) {
	Child2 child2 = new Child2();
	child2.display();
}
}
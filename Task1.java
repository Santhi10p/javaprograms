package day9;
interface Calculator
{
	void add();
	void sub();
}
class Maths implements Calculator
{

	@Override
	public void add() {
		System.out.println("add method"); 
		}


	@Override
	public void sub() {
		System.out.println("Suubtract method");
		
	}
}




public class Task1 {


	public static void main(String[] args) {
		
		Maths obj=new Maths();
		obj.add();
		obj.sub();
	}
}

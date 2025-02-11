package day8;

final class Parent1{
		final int i,j;
		public Parent1() {
		this.i=2;
		this.j=19;
		}
		}

		class Child1 { // HAS-A relation is having an object

		void sum() {
			Parent1  parent1= new Parent1();
			int s=parent1.i+parent1.j;
			System.out.println("sum="+s);
		}
		}
		public class Block {
		public static void main(String[] args) {
			Child1 child = new Child1();
			child.sum();
		}
}

package day8;


	class Parent{
		int a,b;
		public Parent() {
		this.a=2;
		this.b=5;
		}
		}

		class Child extends Parent{ //IS-A- RELATION

		void Prod() {
			int m=a*b;
			System.out.println("Product is ="+m);
		}
		}
		public class Inheretance {


		public static void main(String[] args) {
			Child prod = new Child();
			prod.Prod();
		}

	}



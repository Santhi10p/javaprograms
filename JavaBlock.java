package day8;

public class JavaBlock {
	
		static {
		System.out.println("static Executes before main");
		}
		{
		System.out.println("Anonymous block , executes before constructor");
		}
		public JavaBlock() {
		System.out.println("Executes after creation of an object");
		}

		public static void main(String[] args) {
			System.out.println("Main method");
			JavaBlock javaBlock= new JavaBlock();
			

		}
}


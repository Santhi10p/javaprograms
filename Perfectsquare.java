package Feb14;

import java.util.Scanner;

public class Perfectsquare {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int sqr=(int) Math.sqrt(n);
		if(sqr*sqr == n)
		{
			System.out.println(n+ " is a perfect square");
		}
		else
		{
			System.out.println(n+ " is not a perfect square");

		}
	}

}

package Program;

import java.util.Scanner;

public class FactRecersion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		int fact=factorial(n);
		if(n>=0) {
			System.out.println(" Factorial of "+n+" is "+fact);
		}
		else
		{
			System.out.println(" Enter valid input ");
		}
		
	}
	public static int factorial(int m)
	{
		if(m==0 || m==1)
			return 1;
		else
			return m*factorial(m-1);
	}

}

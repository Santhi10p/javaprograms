package Program;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		boolean isprime=true;
		if(n<=1)
			isprime=false;
		else {
		for(int i=2;i<=n/2;i++)
		{
			if(n % i == 0) {
				isprime = false;
			     break;
			}
		}
		}
		if(isprime == true)
			System.out.println(n+" is a prime");
		else
			System.out.println(n+" is not a prime");
		
	}

}

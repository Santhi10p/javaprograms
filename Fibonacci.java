package Program;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int n=sc.nextInt();
		int first=0;
		int second=1;
		System.out.println("\n Febonacci series :");

		for(int i=1;i<=n;i++)
		{
			
			
			System.out.print(first +" , ");
			int next=first+second;
			first=second;
			/*
			 * n=0+1 =>1 ,a=1,b=1
			 * n=1+1 =>2  ,a=1,b=2
			 * n=1+2 =>3 ,a=2,b=3
			 * n=2+3 =>5 ,a=3,b=5
			 * n=3+5 =>8 ,a=5,b=8
			 */
			second=next;
		}
		
		
	}

}

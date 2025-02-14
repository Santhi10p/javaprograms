package Feb14;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int first=0,second=1;
		int temp;
		if(n>1)
		{
			System.out.println("            Fibonacci Series");
			System.out.println("            ----------------");
			System.out.println();
			System.out.println(first+" , "+"\n"+ second+" , " );
		}
		else {
			System.out.println("Enter valid number");
		}
		for(int i=3;i<=n;i++)
		{
			temp=first+second;
			System.out.println(temp+" , ");
			first=second;
			second=temp;
		}
	}

}

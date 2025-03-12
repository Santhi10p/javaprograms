package Feb14;

import java.util.Scanner;

public class SumofNaturalno {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter how many natural no to be added");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("THe sum  of natural numbers is : "+sum);
	}

}

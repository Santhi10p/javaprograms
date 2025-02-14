package Feb14;

import java.util.Scanner;

public class Eigthtablesum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers to be added");
		int n=sc.nextInt();
		int res=1,sum=0;
		for(int i=1;i<=n;i++)
		{
			res=8*i;
			sum=sum+res;
		}
		System.out.println("The total vale of Eight table between 1 and "+n+"is "+sum);
	}

}

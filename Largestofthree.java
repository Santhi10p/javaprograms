package Feb14;

import java.util.Scanner;

public class Largestofthree {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the three numbers : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println("the gratest no is : "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("the gratest no is : "+n2);
		}
		else
		{
			System.out.println("the gratest no is : "+n3);
		}
	}

}

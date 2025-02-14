package Feb14;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int rev=0;
		int num=n,last;
		while(n>0)
		{
			last=n%10;
			rev=rev*10+last;
			n=n/10;
		}
		System.out.println(" PROGRAM TO CHECK THE NUMBER IS A PALINDROME OR NOT \n");
		if(num==rev)
		{
			System.out.println(num+" is a palindrome");
		}
		else
		{
			System.out.println(num+" is not a palindrome");
		}

	}

}

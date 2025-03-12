package Feb14;

import java.util.Scanner;

public class SwapTwono {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the two numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int temp;
		System.out.println("The numbers before swapping : ");
		System.out.println(" n1 = "+n1+" n2 = "+n2);
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("The numbers after swapping : ");
		System.out.println(" n1 = "+n1+" n2 = "+n2);
		}

}

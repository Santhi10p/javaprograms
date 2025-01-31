package day5;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choise : ");
		int i=sc.nextInt();
		System.out.println("Enter the two number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res;
		switch(i)
		{
		case 1:
			res=a+b;
			System.out.println("Addition of "+a+" and "+b+" is : "+res);
			break;
		
		case 2:
			res=a-b;
			System.out.println("Subtraction of "+a+" and "+b+" is : "+res);

			break;
		
		case 3:
			res=a*b;
			System.out.println("Multliplication of "+a+" and "+b+" is : "+res);

			break;
		default:
			System.out.println("invalid input");
	}

}
}

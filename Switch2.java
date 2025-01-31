package day5;
import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option 1.Add or 2.Sub or 3.Mul: ");
		String i=sc.next();
		System.out.println("Enter the two number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res;
		switch(i)
		{
		case "Add":
			res=a+b;
			System.out.println("Addition of "+a+" and "+b+" is : "+res);
			break;
		
		case "Sub":
			res=a-b;
			System.out.println("Subtraction of "+a+" and "+b+" is : "+res);
			break;
		
		case "Mul":
			res=a*b;
			System.out.println("Multliplication of "+a+" and "+b+" is : "+res);
			break;
		default:
			System.out.println("invalid input");
	}

}
}

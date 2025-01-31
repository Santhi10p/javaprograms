package day5;
import java.util.Scanner;
public class Switch3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shape : ");
		String i=sc.next();
		int res,a,b,c,r;
		switch(i)
		{
		case "Square":
			System.out.println("Enter the side value");
			a=sc.nextInt();
			res=a*a;
			System.out.println("Area of square is "+res);
			break;
		
		case "Rectangle":
			System.out.println("Enter the length and breadth : ");
			b=sc.nextInt();
			c=sc.nextInt();
			res=b*c;
			System.out.println("Area of rectangle is  "+res);
			break;
		
		case "Circle":
			System.out.println("Enter the length and breadth : ");
			r=sc.nextInt();
			double res1=((3.14)*r*r);
			System.out.println("Area of circle is "+res1);
			break;
		default:
			System.out.println("invalid input");
	}

}
}

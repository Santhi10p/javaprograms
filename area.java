package java1;
import java.util.*;
public class area {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("				AREA OF SQUARE			");
		System.out.println("Enter the side value :");
		int a=sc.nextInt();
		System.out.println("AREA OF SQUARE IS : " + (a*a)+"\n\n");
		System.out.println("					AREA OF RECTANGLE");
		System.out.println("Enter the length");
		int b=sc.nextInt();
		System.out.println("Enter the bredth value:");
		int c=sc.nextInt();
		System.out.println("AREA OF RECTANGLE IS :" + (b*c) + "\n\n");
		System.out.println("				AREA OF CIRCLE");
		System.out.println("eEnter the radius value :");
		int r=sc.nextInt();
		System.out.println("AREA OF CIRCLE IS : " + (3.14*r*r)+ "\n\n");
		System.out.println("				AREA OF TRIANGLE ");
		System.out.println("Enter the breadth :");
		int d=sc.nextInt();
		System.out.println("Enter the length  :");
		int e=sc.nextInt();
		System.out.println("AREA OF TRIANGLE : " + (0.5*d*e));
	}

}

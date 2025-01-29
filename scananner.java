package project1;
import java.util.Scanner;
public class scananner {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		
		System.out.println("Enter your Name : ");
		String sname=sc.next();
		System.out.println("Enter your user id : ");
		int sid=sc.nextInt();
		System.out.println("Enter you academic fees : ");
		float sfees=sc.nextFloat();
		System.out.println("Enter you gender first character : ");
		char sgender=sc.next().charAt(0);
		System.out.println(" 	STUDENT DETAILS");
		System.out.println("Student ID : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Student Fees : "+sfees);
		System.out.println("Student Gender : "+sgender);
	}
	
}

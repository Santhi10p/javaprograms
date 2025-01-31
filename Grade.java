package day5;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the four numbers");
	int m=sc.nextInt();
	if(m>100 || m<0)
	{
		return;
	}
	else if(m>=90 && m<=100)
	{
		System.out.println("Grade A");
	}
	else if(m>=80 && m<90)
	{
		System.out.println("Grade B");
	}
	else if(m>=70 && m<80)
	{
		System.out.println("Grade C");
	}
	else if(m>=60 && m<70)
	{
		System.out.println("Grade D");
	}
	else if(m>=50 && m<60)
	{
		System.out.println("Grade E");
	}
	else
	{
		System.out.println("Invalid input");
	}
	}
}

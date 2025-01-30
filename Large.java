package day4;
import java.util.Scanner;
public class Large {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int large;
		if(n1>=n2 && n1>=n3)
		{
			large=n1;
		}
		else if(n2>=n1 && n2>=n3)
		{
			large=n2;
		}
		else
		{
			large=n3;
		}
		System.out.println("The largest of "+n1+", " +n2+" and " +n3+" is "+large);
	}

}

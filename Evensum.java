package Feb14;
import java.util.Scanner;
public class Evensum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many even numbers to be sum : ");
		int n=sc.nextInt();
		int times=0;
		int sum=0;
		int num=2;
		while(times<n)
		{
			sum=sum+num;
			num=num+2;
			times++;
		}
		System.out.println("The sum of "+n+" even numbers is "+sum);
	}

}

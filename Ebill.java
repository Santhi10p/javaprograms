package day5;
import java.util.Scanner;
public class Ebill {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter ypur name : ");
		String name=sc.nextLine();
		System.out.println("Enter you unit");
		int unit=sc.nextInt();
		double amount;
		if(unit<0 && unit>=100)
		{
			amount=unit*(2.00);
		}
		else if(unit<100 && unit>=200)
		{
			amount=(100*(2.00)) + ((unit-100)*(3.00));
		}
		else 
		{
			amount=(100*(2.00))+ (200*(3.00)) + ((unit-300)*(5.00));
			amount=amount + (2.5*amount)/100;

		}
		System.out.println("Name : "+name);
		System.out.println("Units : " +unit);
		System.out.println("Amount : "+amount);
		
	}

}

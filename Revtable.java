package Feb14;
import java.util.Scanner;

public class Revtable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter which multiplication table you want : ");
		int n=10;
		for(int i=n;i>0;i--)
		{
			
			System.out.println(n +" * "+i+" = "+(n*i));
		}
	}
	
	

}

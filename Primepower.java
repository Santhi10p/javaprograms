package pro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primepower {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		int m=1;
		for(int i=1;i<=n;i++) {
			m=m*2;
		}
		int result=m+1;
		boolean a=checkprime(result);
		if(a==true) {
			System.out.println("prime");
		}
		
		else {
			for(int i=1;i<=result/2;i++) {
				if(result%i==0) {
					l.add(i);
				}
			
			}
			System.out.println(l);
		}
		
	}
	public static boolean checkprime(int n) {
		if(n<=1)
			return false;
		else if(n==2) {
			return true;
		}
		else if(n%2==0) {
			return false;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}

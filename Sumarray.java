package pro;

import java.util.Scanner;

public class Sumarray {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the val");
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i:arr) {
			sum +=i;
		}
		System.out.println(sum);
	}
}

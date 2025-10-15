package pro;

import java.util.Arrays;

public class Largest {
	public static void main(String[] args) {
		int[] a= {2,5,6,16,15,9};
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[max]<a[i])
			{
				int temp=a[max];
				a[max]=a[i];
				a[i]=temp;
			}
		}
		Arrays.sort(a);
		for(int i:a) {
			System.out.print(i);
		}
		int d=a.length;
		System.out.println("max is : "+a[d-1]);
		System.out.println("smax is : "+a[d-2]);
	}
	
}

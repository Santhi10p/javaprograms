package day7;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int a[]=new int[5];
		int s=0;
//		a[0]=45;
//		a[1]=45;
//		a[2]=56;
//		a[3]=76;
//		a[4]=12;
		
		//input data from user using Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array elemnts are");
	   for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	   
	   //find the sum of all array
	   for(int i=0;i<a.length;i++) {
		   s=s+a[i];
	   }
	   
	   System.out.println("sum="+s);
	   float avg = (float)s/a.length;
	   System.out.println("Average ="+avg);
	   int min=a[0];
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]<min)
		   {
			   min=a[i];
		   }
	   }
	   System.out.println("Minimum = "+min);
	   int max=a[0];
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]>max)
		   {
			   max=a[i];
		   }
	   }
	   System.out.println("Minimum = "+max);
		
	   
	   //min element of an array
	   //max of an array
	}



	}



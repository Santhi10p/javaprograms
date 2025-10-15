package pro;

import java.util.Arrays;

public class RotatebyK {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		int k=2;
		int n=arr.length;
		
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
		
		}
	public static void reverse(int arr[], int s,int e) {
		while(s<e) {
			int temp=arr[e];
			arr[e]=arr[s];
			arr[s]=temp;
			s++;
			e--;
		}
		System.out.println(Arrays.toString(arr));
	}
}

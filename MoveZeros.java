package pro;

import java.util.Arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int arr[]= {0,2,0,3,0,4,6};
		int n=arr.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		}
}

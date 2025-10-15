package pro;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int[] arr= {1,0,2,1,2,0,1};
		int n=arr.length;
		int mid=0;
		int low=0;
		int high=n-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

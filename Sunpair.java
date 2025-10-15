package pro;

public class Sunpair {
	public static void main(String[] args) {
		int arr[]= {1,4,6,3,7,9};
		int sum=9;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]+arr[i+1]==sum) {
				System.out.println("sum of pair of "+arr[i] +" and "+arr[i+1]+" is found");
				flag=true;
				break;
			}
		}
		if(flag=false) {
			System.out.println("pair not found");
		}
	}
}

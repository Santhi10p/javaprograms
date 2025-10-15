package pro;

public class Missingno {

	public static void main(String[] args) {
		int[] arr= {1,3,4,5,6,7,8,9};
		int n=arr.length+1;
		int asum=n*(n+1)/2;
		int sum=0;
		for(int i:arr) {
			sum +=i;
		}
		int misval=asum-sum;
		System.out.println(misval);
	}
}

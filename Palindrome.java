package pro;

public class Palindrome {

	public static void main(String[] args) {
		String name="madam";
		int n=name.length();
		boolean palin=true;
		for(int i=0;i<n/2;i++) {
			if(name.charAt(i)!=name.charAt(n-i-1)) {
				palin=false;
				break;
			}
		}
		if(palin) {
			System.out.println("palindrome");
		}
		else
			System.out.println("Not palindrome");
	}
}

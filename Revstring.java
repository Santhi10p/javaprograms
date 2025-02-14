package Feb14;

public class Revstring {

	public static void main(String[] args) {
		String s="hello";
		String rev="";
		int n=s.length()-1;
		for(int i=n;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse os the string is "+rev);
	}

	

}

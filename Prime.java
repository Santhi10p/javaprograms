package Program;

public class Prime {

	public static void main(String[] args) {
		int n=3;
		
		
	}
	void prime1(int n) {
		boolean isprime=true;
		if(n<=1)
			isprime=false;
		else
		{
			for(int i=2;i<=n;i++)
			{
				if(n % i == 0)
					isprime=true;
					break;
			}
		}
		if(isprime)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}

}

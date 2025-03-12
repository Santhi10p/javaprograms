package Feb14;
public class DisplayOddno {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("The sum of odd numbers from 1 to 100 is : "+sum);
	}

}

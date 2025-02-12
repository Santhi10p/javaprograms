package day9;

class AgeException extends Exception{
	public AgeException(String s) {
		super(s);
	}
}


class VoteAge{
	
	public void checkAge(int age)throws AgeException  {
		System.out.println("Before ttry");
		if(age<18) {
			throw new AgeException("Not Eligible to vote");
		}else {
			System.out.println("Eligible to vote");
		}
		
	}
}
public class Task4 {


	public static void main(String[] args) throws AgeException  {
		VoteAge vobj=new VoteAge();
		vobj.checkAge(16);
	}


}
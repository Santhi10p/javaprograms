package day9;
import java.util.Scanner;
class Withdrawamount extends Exception{
	public Withdrawamount(String s) {
		super(s);
	}
}


class Withdraw{
	
	public void Bank(int balance,int amount) throws Withdrawamount {
		
		if(amount>balance) {
			throw new Withdrawamount("insufficiant balance");
		}else {
			balance=balance-amount;
			System.out.println("amont withdrawn");
		}
		}
	}

public class Task5 {


	public static void main(String[] args) throws Withdrawamount {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amount=sc.nextInt();
		Withdraw vobj=new Withdraw();
		vobj.Bank(20000,amount);
	}


}

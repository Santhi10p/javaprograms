package Feb14;

class MyClass extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		System.out.println("Run method"+i+"	 "+Thread.currentThread());
		try
		{
			Thread.sleep(900000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		
		MyClass obj=new MyClass();
		MyClass obj1=new MyClass();
		obj.setName("first");
		obj.setName("second");
		obj.start();
		obj.join();
		obj1.start();
	}

}

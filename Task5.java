package Feb14;
class MyThreadclass implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		System.out.println("Run method"+i+"	 "+Thread.currentThread());
		try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		//System.out.println("run method");
	}
}
public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThreadclass tobj=new MyThreadclass();
		Thread obj1=new Thread(tobj);
		Thread obj2=new Thread(tobj);
		obj1.start();
		//obj1.join();
		obj2.start();
	}

}

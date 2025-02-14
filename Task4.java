package Feb14;

class MyClass extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		System.out.println("Run method "+i +"  "+Thread.currentThread());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class Task4 {


	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		
		MyClass obj=new MyClass();
		MyClass obj1=new MyClass();
		obj.setName("first");
		obj1.setName("second");
		obj.start();
		obj.join();
		obj1.start();
		
		
	}
}



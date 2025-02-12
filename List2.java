package Feb12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class List2 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	ArrayList<String> sobj=new ArrayList<String>();
	System.out.println("Enter the names ");
	//String n;
	//String[] name = new String[10];
	for(int i=1;i<=3;i++)
	{
		String name =sc.nextLine();
		sobj.add(name);
	}
	System.out.println(sobj);
	
	Iterator<String> stobj=sobj.iterator();
	while(stobj.hasNext())
	{
		String s=stobj.next();
		System.out.println(s);
	}
}
}

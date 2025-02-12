package Feb12;

import java.util.ArrayList;
import java.util.Iterator;

public class List3 {
	public static void main(String[] args)
	{
	ArrayList<String> lobj=new ArrayList<String>();
	lobj.add("as");
	lobj.add("ad");
	lobj.add("ag");
	lobj.add("ah");
	lobj.add("aj");
	lobj.add("ak");
	lobj.add("al");
	lobj.add("qw");
	lobj.add("qe");
	lobj.add("qt");
	System.out.println(lobj);
	
	Iterator<String> itobj=lobj.iterator();
	while(itobj.hasNext())
	{
		String i=itobj.next();
		System.out.println(i);
	}
}
}

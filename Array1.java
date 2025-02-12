package Feb12;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
		ArrayList<Integer> lobj=new ArrayList<Integer>();
		lobj.add(89);
		lobj.add(81);
		lobj.add(83);
		lobj.add(84);
		lobj.add(87);
		lobj.add(85);
		lobj.add(86);
		lobj.add(82);
		lobj.add(55);
		lobj.add(35);
		System.out.println(lobj);
		for(int i:lobj)
		{
			System.out.println(i);
		}
		System.out.println();
		Iterator<Integer> itobj=lobj.iterator();
		while(itobj.hasNext())
		{
			int i=itobj.next();
			System.out.println(i);
		}
	}

}

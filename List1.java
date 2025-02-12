package Feb12;

import java.util.ArrayList;
import java.util.Iterator;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> lobj=new ArrayList<Float>();
		lobj.add(89.0f);
		lobj.add(81.2f);
		lobj.add(83.3f);
		lobj.add(84.0f);
		lobj.add(87.3f);
		lobj.add(85.6f);
		lobj.add(86.6f);
		lobj.add(82.9f);
		lobj.add(55.9f);
		lobj.add(35.5f);
		System.out.println(lobj);
		
		Iterator<Float> itobj=lobj.iterator();
		while(itobj.hasNext())
		{
			float i=itobj.next();
			System.out.println(i);
		}
	}

}

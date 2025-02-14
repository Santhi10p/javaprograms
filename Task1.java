package Feb14;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Task1 {

	public static void main(String[] args) {
		String s="hello";
		char ch[]=s.toCharArray();
		LinkedHashMap<Character, Integer> lhmop=new LinkedHashMap<Character, Integer>();
		System.out.println(lhmop);
		int i=0;
		for(char c:ch)
		{
			//i++;
			lhmop.put(c, lhmop.getOrDefault(c,0)+1);
			//lhmop.put(c, i);
		
		//System.out.println(lhmop);
		}
		System.out.println(s);
		for(Entry<Character, Integer> lobj:lhmop.entrySet())
		{
			System.out.println(lobj.getKey()+"->");
		}
	}

}

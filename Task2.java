package Feb14;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Task2 {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,2,4};
		LinkedHashMap<Integer, Integer> lhmop=new LinkedHashMap<Integer, Integer>();
		System.out.println(lhmop);
		int i=0;
		for(int arr1:arr)
		{
			//i++;
			lhmop.put(arr1, lhmop.getOrDefault(arr1,0)+1);
			//lhmop.put(c, i);
		
		//System.out.println(lhmop);
		}
		//System.out.println(arr);
		for(Entry<Integer, Integer> lobj:lhmop.entrySet())
		{
			System.out.println(lobj.getKey()+"->"+lobj.getValue());
		}
	}

}

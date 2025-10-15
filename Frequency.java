package pro;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		int[] arr= {2,1,3,1,1,2};
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			map.put(i,map.getOrDefault(i,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());;
		}
	}
}

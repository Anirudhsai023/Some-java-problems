package funcs;
import java.util.*;
public class TryingSet {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(2, "Anirudh");
		hm.put(4, "Satya");
		hm.put(1, "Gurram");
		hm.put(5, "Sai");
		hm.put(3, "Venkata");
//		for(String i : hm.values()) {
//			System.out.println(i);
//		}
		
		for(Integer i : hm.keySet()) {
			System.out.println(i);
		}
		
		
}
	}

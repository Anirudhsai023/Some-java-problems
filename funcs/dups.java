package funcs;
import java.util.*;
public class dups {

	public static void main(String[] args) {
		Map<Character, Integer> dup = new TreeMap<>();
		String name = "Gurram Anirudh Venkata Satya Sai";
		for(int i = 0; i < name.length(); i++) {
			Character ele = Character.toLowerCase(name.charAt(i));
			if(ele != ' ') {
				if(dup.containsKey(ele)) {
					dup.put(ele, dup.get(ele)+1);
				}
				else {
					dup.put(ele, 1);
				}
						}	
			}
			
		System.out.println(dup.toString());

	}

}

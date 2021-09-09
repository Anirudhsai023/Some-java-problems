package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LearningGenerics {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Anirudh");
		System.out.println(arrayList);
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Anirudh");
		hashSet.add("sai");
		hashSet.add("Anirudh");
		System.out.println(hashSet);
		
		
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Anirudh", 100);
		System.out.println(hashMap);
		hashMap.put("Anirudh", 99);
		hashMap.put("Sai", 98);
		System.out.println(hashMap);
		
		
		
		
	}

}

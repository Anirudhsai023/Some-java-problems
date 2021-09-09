package funcs;
import java.util.*;

public class TryCollections {

	public static void main(String[] args) {
		ArrayList<Integer> dup = new ArrayList<>();
		dup.add(10);
		dup.add(20);
		
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		System.out.println(arr);
		arr.addAll(dup);
		System.out.println(arr);
		System.out.println(arr.get(2));
		arr.remove(2);
		System.out.println(arr);
		arr.set(0, 2);
		System.out.println(arr);
		System.out.println(arr.contains(4));
		System.out.println(arr.size());
		arr.clear();
		System.out.println(arr);
		
		
		
		Stack<String> stc = new Stack<>();
		stc.push("Gurram");
		stc.push("Anirudh");
		stc.push("Venkata");
		System.out.println(stc.peek());
		System.out.println(stc.pop());
		System.out.println(stc.peek());
		
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		int x = queue.poll();
		System.out.println(x);
		
		

	}

}

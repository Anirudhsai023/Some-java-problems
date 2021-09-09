package problems;

import java.util.PriorityQueue;

public class FileMerging {

	public static void optimalSearch(int[] arr, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int e : arr) {
			pq.add(e);
		}
		int count = 0, temp = 0;
		while(pq.size()>1) {
			temp = pq.poll() + pq.poll();
			pq.add(temp);
			count += temp;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int files[] = new int[] { 2, 3, 4, 5, 6, 7 };
		int size = files.length;
		optimalSearch(files, size);
	}

}

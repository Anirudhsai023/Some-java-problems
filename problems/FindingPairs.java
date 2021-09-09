package problems;

public class FindingPairs {

	public static void main(String[] args) {
		int A[] = { 2, 2, 1, 7, 5, 3 };
		int k = 4;
		int freq[] = new int[k];
		int count = 0;
		for(int ele:A) {
			int rem = ele%k;
			if(freq[k-rem] != 0) {
//				freq[k-rem]--;
				count++;
			}
			else {
				freq[rem]++;
			}
		}
		System.out.println(count);

	}

}

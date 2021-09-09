package problems;

public class FindPairs {

	public static void main(String[] args) {
		int[] arr = {2,7,6,1,9,8};
		int count = 0 ;
		for(int i = 0; i< arr.length;i++) {
			for(int j = 0 ;j < arr.length;j++) {
				if(arr[i] + arr[j] == 10) {
					count++;
	
				}
			}
		}
		System.out.println(count);
		

	}

}

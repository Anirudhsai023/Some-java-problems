package problems;

public class NegativeToStart {

	public static void main(String[] args) {
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int len = arr.length;
		int lt = 0;
		int rt = len - 1;
		int temp = 0;
		while(rt > lt) {
			//case 1 l +ve & r -ve 
			if(arr[lt] > 0 & arr[rt] < 0) {
				temp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = temp;
				lt++;
				rt--;
			}
			//case 2 l -ve & r +ve
			else if(arr[lt] < 0 & arr[rt] > 0) {
				lt++;
				rt--;
			}
			//case 3 l -ve & r -ve
			else if(arr[lt] < 0 & arr[rt] < 0) {
				lt++;
			}
			else {
				rt--;
			}
		}
		for(int e : arr) {
			System.out.print(e + " ");
		}

	}

}

package problems;

public class MinAndMax {

	public static void main(String[] args) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		int minval = minVal(arr);
		int maxval = maxVal(arr);
		System.out.println("Min value is : "+ minval);
		System.out.println("Max value is : "+ maxval);
		
	}
	
	static int minVal(int arr[]) {
		int minNum = 9999999;
		for(int e : arr) {
			if(e<minNum) {
				minNum = e;
			}
		}
		return minNum;
	}
	static int maxVal(int arr[]) {
		int maxNum = -999999;
		for(int e : arr) {
			if(e > maxNum) {
				maxNum = e;
			}
		}
		return maxNum;
	}

}

package introduction;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {9,8,7,6,5,4,3,2,1};
		int n = arr.length;
		int min_val=99999999;
		int temp,j;
		for(int i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(arr[j]<min_val) {
					min_val = arr[j];
				}
			}
			temp = arr[i];
			arr[i] = min_val;
			arr[j] = temp;
		}
		for(int ele : arr) {
			System.out.print(ele+" ");
		}

	}

}

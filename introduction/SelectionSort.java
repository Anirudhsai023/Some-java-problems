package introduction;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {4,2,6,9,-2};
		int n = a.length;
		int temp;
		for(int i = 0; i<n; i++ ) {
			int minInd = i;
			for(int j = i; j<n; j++ ) {
				if(a[j]< a[minInd]) {
					minInd = j;
				}
			}
			temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;
		}
		
		for(int e:a) {
			System.out.print(e+ " ");
		}
	}

}

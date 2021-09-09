package problems;

public class PalidromOrNot {

	public static void main(String[] args) {
		String s1 = "malayalam";
		int i = 0;
		int j = s1.length()-1;
		boolean flag = true;
		while(i<=j) {
			if(s1.charAt(i) != s1.charAt(j)) {
				flag = false;
				System.out.println("Not Palindrom");
			}
			i++;
			j--;
		}
		if(flag) System.out.println("Is palindrom");

	}

}

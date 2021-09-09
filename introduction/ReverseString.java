package introduction;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		
		int len = name.length();
		String reversename = "";
		for(int i = len-1; i>=0;i--) {
			reversename += name.charAt(i);
		}
		System.out.println(reversename);

	}

}

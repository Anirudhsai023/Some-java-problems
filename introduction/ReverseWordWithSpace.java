package introduction;

import java.util.Scanner;

public class ReverseWordWithSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String name = sc.nextLine();
		sc.close();
		
		int i = name.length() - 1;
		int j = name.length() - 1;
		String rname = "";
		while(i >=0) {
			while( i >= 0 && name.charAt(i) == ' ') {
				i--;
			}
			rname += name.substring(i+1,j+1);
			j=i;
			while(i >= 0 && name.charAt(i) != ' ') {
				i--;
			}
			rname += name.substring(i+1,j+1);
			j=i;
		}
		System.out.println(rname);
		
	}

}

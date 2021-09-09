package introduction;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String name = sc.nextLine();
		sc.close();
		
		String namearr[] = name.split(" ");
		int start=0;
		int end = namearr.length - 1;
		String temp;
		while(end>start) {
			temp = namearr[start];
			namearr[start] = namearr[end];
			namearr[end] = temp;
			start++;
			end--;
		}
		name = "";
		for(String e:namearr) {
			name = name + e + " ";
		}
		System.out.print(name);
		

	}

}

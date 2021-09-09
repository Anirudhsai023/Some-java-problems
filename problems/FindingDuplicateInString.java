package problems;
import java.util.*;

public class FindingDuplicateInString {

	public static void main(String[] args) {
		String s1 = "which characters have repeated in this string";
		Set<Character> dup = new HashSet<>();
		Set<Character> charArr = new HashSet<>();
		for(int i = 0; i< s1.length();i++) {
			if(dup.contains(s1.charAt(i))) {
				charArr.add(s1.charAt(i));
				continue;
			}
			dup.add(s1.charAt(i));
		}
		System.out.println(charArr);
	}

}

package introduction;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		String s1 = "anirudh sai";
		char temp[] = s1.toCharArray();
		Arrays.sort(temp);
		s1 = new  String(temp);
		System.out.println(s1);
		

	}

}

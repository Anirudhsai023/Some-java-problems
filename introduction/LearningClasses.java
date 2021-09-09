package introduction;
import java.util.Scanner;
public class LearningClasses {
	int num1,num2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		LearningClasses obj = new LearningClasses();
		obj.num1 = a;
		obj.num2 = b;
		System.out.println("Before swapping a: " + obj.num1 +" b: "+obj.num2);
		swap(obj);
		System.out.println("Before swapping a: " + obj.num1 +" b: "+obj.num2);
		sc.close();
		
	}
	static void swap(LearningClasses obj) {
		int temp = obj.num1;
		obj.num1 = obj.num2;
		obj.num2 = temp; 
	}

}

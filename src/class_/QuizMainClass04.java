package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizMainClass04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		while (true) { 
			int temp = num % 10; 
			int asdf = num / 10; 
			arr.add(temp); 
			if (asdf < 10) {
				break;
			}
			num = asdf; 
		}
		System.out.println(arr);
	}
}

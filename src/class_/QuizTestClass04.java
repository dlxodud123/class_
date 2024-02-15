package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTestClass04 {
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	public ArrayList<Integer> circul(int num) {
		ArrayList<Integer> arr = new ArrayList<>();
		while (true) { 
			int temp = num % 10; 
			int asdf = num / 10; 
			arr.add(temp); 
			if (asdf < 10) {
				if (asdf == 0) {
					break;
				}
				arr.add(asdf);
				break;
			}
			num = asdf; 
		}
		return arr;
	}
	public void output(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			String s = arr.get(i) + "";
			System.out.print(s);
		}
	}
}

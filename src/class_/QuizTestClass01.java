package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTestClass01 {
	public ArrayList<Integer> input() {
		ArrayList<Integer> arr = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력 : ");
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		
		return arr;
	}
	public int circul(int num1, int num2) {
		int max;
		if (num1 > num2) {
			max = num1;
		}else {
			max = num2;
		}
		return max;
	}
	public void ouput(int max) {
		System.out.println("더 큰수 : " + max);
	}
}

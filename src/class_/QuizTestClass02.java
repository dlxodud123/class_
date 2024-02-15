package class_;

import java.util.Scanner;

public class QuizTestClass02 {
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		return num;
	}
	public void circul(int num) {
		if (num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}

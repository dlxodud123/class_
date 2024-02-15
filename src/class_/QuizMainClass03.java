package class_;

import java.util.Scanner;

public class QuizMainClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 2; i <=num; i++) {
			if (num % i == 0) {
				if (i == num) {
					System.out.println(num+"는 소수입니다");
				}
			}
		}
	}
}

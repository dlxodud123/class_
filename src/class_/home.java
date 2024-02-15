package class_;

import java.util.Scanner;

public class home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
			if (i == num) {
				if (count == 2) {
					System.out.println("소수입니다.");
					return;
				}
			}
		}
		System.out.println("소수가 아닙니다");
	}
}

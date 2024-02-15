package class_;

import java.util.Scanner;

public class hometest {
	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	public int circul(int num) {
		int sosu = 0;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
			if (i == num) {
				if (count == 2) {
					sosu = 1;
				}
			}
		}return sosu;
	}
	public void output(int sosu) {
		if (sosu == 1) {
			System.out.println("소수 입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
	}
}

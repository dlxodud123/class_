package class_;

import java.util.Scanner;

public class TestClass04 {
	public void sumFunc() {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + num + "까지의 합 : " + sum);
	}
}

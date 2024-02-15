package class_;

import java.util.Scanner;

public class TestClass07 {
	public int inputData() {
		System.out.println("입력 받는 기능 입니다.");
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		return num;
	}
	public int opData(int num, int sum) {
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	public void printData(int num, int sum) {
		System.out.println("1 ~ " + num + "까지의 합 : " + sum);
	}
}

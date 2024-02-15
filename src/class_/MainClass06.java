package class_;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		
		TestClass06 tc = new TestClass06();
		sum = tc.sumFunc(num);
		System.out.println("합계 : " + sum);
		
		tc.test(num, "asd");
	}

}

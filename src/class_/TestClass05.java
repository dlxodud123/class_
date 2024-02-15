package class_;

public class TestClass05 {
	public void sumFunc(int num) {
		//Scanner sc = new Scanner(System.in);
		int sum = 0;
		//System.out.print("수 입력 : ");
		//num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + num + "까지의 합 : " + sum);
	}
}

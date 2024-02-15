package class_;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 tc = new TestClass07();
		int num, sum = 0;
		num = tc.inputData();
		sum = tc.opData(num, sum);
		tc.printData(num, sum);
	}
}

package class_;

import java.util.ArrayList;

public class QuizMainClass01 {
	public static void main(String[] args) {
		QuizTestClass01 q = new QuizTestClass01();
		
		ArrayList<Integer> arr = q.input();
		int num1 = arr.get(0);
		int num2 = arr.get(1);
		
		int max = q.circul(num1, num2);
		
		q.ouput(max);
	}
}

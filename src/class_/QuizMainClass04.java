package class_;

import java.util.ArrayList;

public class QuizMainClass04 {
	public static void main(String[] args) {
		QuizTestClass04 q = new QuizTestClass04();
		int num = q.input();
		ArrayList<Integer> arr = q.circul(num);
		q.output(arr);
	}
}

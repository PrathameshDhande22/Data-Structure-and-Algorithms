package tutorial.Stack;

import java.util.Arrays;
import java.util.Stack;

public class Stack_Span_Problem {

	/**
	 * to find the Maximum No of Consecutive Days for which price <=today's price
	 * 
	 * @param stocks of each day
	 * @return array of span of the day it was maximum.
	 */
	public static int[] stackSpanProblem(int stocks[]) {
		int span[] = new int[stocks.length];
		Stack<Integer> s = new Stack<Integer>();
		s.push(0);
		span[0] = 1;

		for (int i = 1; i < stocks.length; i++) {
			int currPrice = stocks[i];
			while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {
				s.pop();
			}
			if (s.isEmpty()) {
				span[i] = i + 1;
			} else {
				int prevHigh = s.peek();
				span[i] = i - prevHigh;
			}
			s.push(i);
		}
		return span;
	}

	public static void main(String[] args) {
		int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
		System.out.println(Arrays.toString(stackSpanProblem(stocks)));
	}

}

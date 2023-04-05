package question.Recursion;

public class ConvertToString {
	/*
	 * Question 2: You are given a number (eg - 2019), convert it into a String of
	 * english like "two zero one nine". Use a recursive function to solve this
	 * problem. NOTE - The digits of the number will only be in the range 0-9 he
	 * last digit of a number can't be 0. Input : 1947 Output : One Nine Four Seven
	 */

	public static String numbers[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten" };

	public static void printString(int no) {
		if (no == 0) {
			return;
		}
		int digit = no % 10;
		printString(no / 10);
		System.out.println(numbers[digit]);
	}

	public static void main(String[] args) {
		int no = 1947;
		printString(no);

	}

}

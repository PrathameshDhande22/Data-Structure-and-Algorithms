package question.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * An Arraylist is monotonic if it is either monotone increasing or monotone
 * decreasing. </br>
 * An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <=
 * nums.get(j). </br>
 * An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >=
 * nums.get(j).</br>
 * Given an integer Arraylist nums, return true if the given list is monotonic,
 * or false otherwise.
 * 
 */
public class Monotonic_Array {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 6, 5, 4, 4);
		System.out.println(monotone(list));
	}

	/**
	 * Function to check if the arrayList is monotonic or not
	 * 
	 * @param list to find the monotone
	 * @return true if list is monotonic otherwise false.
	 */
	public static boolean monotone(ArrayList<Integer> list) {
		boolean inc = true;
		boolean dec = true;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) < list.get(i + 1)) {
				dec = false;
			} else if (list.get(i) > list.get(i + 1)) {
				inc = false;
			}
		}
		return inc | dec;
	}

}

package tutorial.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Find if any pair in a Sorted Arraylist has a target sum.
 */
public class PairSum1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 4, 5, 6);
		int target = 10;
		System.out.println(brutePairSum(list, target));
		System.out.println(pairSum1(list, target));
	}

	/**
	 * Optimal solution using Two pointer approach
	 * 
	 * @param list   with elements sorted
	 * @param target sum to find from the list
	 * @return true if target sum exists in the list otherwise false
	 */
	public static boolean pairSum1(ArrayList<Integer> list, int target) {
		int lp = 0;
		int rp = list.size() - 1;
		while (lp < rp) {
			if (list.get(lp) + list.get(rp) == target) {
				return true;
			} else if (list.get(lp) + list.get(rp) > target) {
				rp--;
			} else {
				lp++;
			}
		}
		return false;
	}

	/**
	 * Brute Force approach to solve the problem using the two for loops just like
	 * done in the array pair.
	 * 
	 * @param list   with Elements sorted
	 * @param target sum to find in a list
	 * @return true if sum is possible of a given target otherwise false
	 */
	public static boolean brutePairSum(ArrayList<Integer> list, int target) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == target) {
					return true;
				}
			}
		}
		return false;
	}

}

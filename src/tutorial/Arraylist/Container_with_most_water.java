package tutorial.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * For given n Lines on x-axis, use 2-lines to form a container such that it
 * holds maximum value
 */
public class Container_with_most_water {
	public static void main(String[] args) {
		ArrayList<Integer> height = new ArrayList<Integer>();
		Collections.addAll(height, 1, 8, 6, 2, 5, 4, 8, 3, 7);

		System.out.println(bruteSolve(height));
		System.out.println(solveWater(height));

	}

	/**
	 * Solution using Two Pointer approach which takes Time Complexity as O(n) which
	 * is smaller than brute force
	 * 
	 * @param height 
	 * @return Maximum Water that can hold
	 */
	public static int solveWater(ArrayList<Integer> height) {
		int maxWater = 0;
		// two pointer approach
		int lp = 0; // left pointer
		int rp = height.size() - 1; // right pointer
		while (lp < rp) {
			int ht = Math.min(height.get(lp), height.get(rp));
			int wt = rp - lp;
			int currWater = ht * wt;
			maxWater = Math.max(maxWater, currWater);
			if (height.get(lp) < height.get(rp)) {
				lp++;
			} else {
				rp--;
			}
		}
		return maxWater;
	}

	/**
	 * Solution using Brute Approach Which takes the time Complexity as O(n^2)
	 * 
	 * @param height
	 * @return Maximum Water that can Hold
	 */
	public static int bruteSolve(ArrayList<Integer> height) {
		int maxWater = 0;
		for (int i = 0; i < height.size(); i++) {
			for (int j = i + 1; j < height.size(); j++) {
				int ht = Math.min(height.get(i), height.get(j));
				int wt = j - i;
				int currWater = ht * wt;
				maxWater = Math.max(maxWater, currWater);
			}
		}
		return maxWater;
	}
}

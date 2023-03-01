package question;

public class Rainwater {
	/**
	 * Raining trapwater problem is implemented in this function <br>
	 * <b>Question </b> : Given n non-negative integers representing on elevation
	 * map where the width of each bar is 1 compute how much water it can trap after
	 * raining.
	 * 
	 * @param arr : Array to be passed as the bar of the height
	 * @return total Water that can trapped by the bar.
	 */
	public static int trapwater(int arr[]) {
		int n = arr.length;

		// calculate left max boundary
		int left[] = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}

		// calculate right max boundary
		int right[] = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}

		// calculate trapwater
		int trapwater = 0;
		for (int i = 0; i < n; i++) {
			int waterlevel = Math.min(right[i], left[i]);
			trapwater += waterlevel - arr[i];
		}
		return trapwater;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
		System.out.println(trapwater(arr));
	}

}

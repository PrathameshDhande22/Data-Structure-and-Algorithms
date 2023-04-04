package tutorial.Recursion;

public class FriendsPairing {

	/**
	 * Friends Pairing Problem
	 * 
	 * @param n - Number of friends
	 * @return number of ways in which friends can remain single or paired up.
	 */
	public static int friendsPair(int n) {
		if (n == 1 || n == 2) {
			return n;
		}
		return friendsPair(n - 1) + (n - 1) * friendsPair(n - 2);
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(friendsPair(n));
	}

}

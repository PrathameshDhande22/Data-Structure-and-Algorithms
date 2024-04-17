package tutorial.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class First_non_repeating_Character_in_String {

	/**
	 * First Non Repeating Character is printed
	 * 
	 * @param str to be passed to find Non Repeating Character.
	 */
	public static void FirstNonRepeating(String str) {
		int freq[] = new int[26];
		Queue<Character> q = new LinkedList<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			q.add(ch);
			freq[ch - 'a']++;
			while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
				q.remove();
			}
			if (q.isEmpty()) {
				System.out.println(-1);
			} else {
				System.out.println(q.peek());
			}
		}
	}

	public static void main(String[] args) {
		String str = "aabccxb";
		FirstNonRepeating(str);

	}

}

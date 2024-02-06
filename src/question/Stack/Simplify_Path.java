package question.Stack;

import java.util.Stack;

public class Simplify_Path {

	/**
	 * We have an absolute path for a file (Unix-style), simplify it. Note that
	 * absolute path always begin with ‘/’ ( root directory ), a dot in path
	 * represent current directory and double dot represents parent directory
	 * 
	 * @param path in the form of string
	 * @return absolute path
	 */
	public static String getAbsolutePath(String path) {
		Stack<String> stack = new Stack<String>();

		String dir = "";
		for (char curr : path.toCharArray()) {
			if (curr == '/') {
				if (dir.equals("..")) {
					if (!stack.isEmpty())
						stack.pop();
				} else if (!dir.equals(".") && dir.length() != 0) {
					stack.push(dir);
				}
				dir = "";
			} else {
				dir += curr;
			}
		}
		dir = "";
		if (stack.isEmpty()) {
			return "/";
		}

		else {
			while (!stack.isEmpty()) {
				dir = "/" + stack.pop() + dir;
			}
		}

		return dir;
	}

	public static void main(String[] args) {
		String path = "/a//b////c/d//././/../";
		System.out.println(getAbsolutePath(path));
	}

}

package tutorial.Strings;

public class Shortestpath {

	/**
	 * finding the shortest path from origin having values as West,East,North and
	 * south
	 * 
	 * @param path consist of Character W,S,E,N
	 * @return path or displacement value to reach the path from starting point or
	 *         origin
	 */
	public static float getShortestPath(String path) {
		int x = 0, y = 0;
		for (int i = 0; i < path.length(); i++) {
			char dir = path.charAt(i);
			// for west direction
			if (dir == 'W') {
				x--;
			}
			// for east direction
			else if (dir == 'E') {
				x++;
			}
			// for north direction
			else if (dir == 'N') {
				y++;
			}
			// for south direction
			else {
				y--;
			}
		}
		// simply calculating the displacement
		return (float) (Math.sqrt((x * x) + (y * y)));
	}

	public static void main(String[] args) {
		String path = "WNEENESENNN";
		System.out.println(getShortestPath(path));
	}

}

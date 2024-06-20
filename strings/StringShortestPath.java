class StringShortestPath {
	static void printPath(String str) {
		int y = 0;
		int x = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'W') {
				x--;
			} else if (str.charAt(i) == 'E') {
				x++;
			} else if (str.charAt(i) == 'N') {
				y++;
			} else if (str.charAt(i) == 'S') {
				y--;
			}
		}
		System.out.println("Current Cordinate:" + x + "," + y);
		double ans = Math.sqrt((x * x + y * y));
		System.out.println(ans);
	}

	public static void main(String[] args) {
		String str = "WNEENESENNN";
		printPath(str);
	}
}

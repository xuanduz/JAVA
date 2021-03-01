
public class Game {

	/*
	 * Ham show()
	 */
	public Node Node[][];

	public void show(int a[][]) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(a[i][j] + "|");
			}
			System.out.println();
		}
	}

	/*
	 * Cac ham validate()
	 */
	public boolean validateRow(int r, int c, int value, int Node[][]) {
		for (int i = 0; i < 9; i++) {
			if (Node[r][i] == value) {
				return false;
			}
		}
		return true;
	}

	public boolean validateColumn(int r, int c, int value, int Node[][]) {
		for (int i = 0; i < 9; i++) {
			if (Node[i][c] == value) {
				return false;
			}
		}
		return true;
	}

	public boolean validateZone(int r, int c, int value, int Node[][]) {
		if (0 <= r && r <= 2) {
			r = 0;
		} else if (3 <= r && r <= 5) {
			r = 3;
		} else if (6 <= r && r <= 8) {
			r = 6;
		}
		if (0 <= c && c <= 2) {
			c = 0;
		} else if (3 <= c && c <= 5) {
			c = 3;
		} else if (6 <= c && c <= 8) {
			c = 6;
		}
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (Node[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * Ham kiem tra dung nhap
	 */
	public boolean stopIn(int Node[][]) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (Node[i][j] == 0) {
					return false;
				}
			}
		}
		return false;
	}
}
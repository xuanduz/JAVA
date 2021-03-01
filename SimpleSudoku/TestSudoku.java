import java.util.Scanner;

public class TestSudoku {
	public static Scanner gg = new Scanner(System.in);

	public static void main(String[] args) {
		Game a = new Game();
		int Node[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		a.show(Node);
		while (a.stopIn(Node) == false) {
			System.out.println();
			int r, c, value;
			System.out.print("Nhap hang, cot va gia tri: ");
			r = gg.nextInt();
			c = gg.nextInt();
			value = gg.nextInt();
			if (Node[r][c] != 0) {
				System.out.println("Khong the nhap vo day !!");
			} else {
				if (a.validateRow(r, c, value, Node)) {
					if (a.validateColumn(r, c, value, Node)) {
						if (a.validateZone(r, c, value, Node)) {
							Node[r][c] = value;
							a.show(Node);
							System.out.println("Nhập tiếp đê ༼ つ ◕_◕ ༽つ");
						} else
							System.out.println("Trung vung rui. Nhap lai!! (¬‿¬)");
					} else
						System.out.println("Trung cot rui. Nhap lai!! (¬‿¬)");
				} else
					System.out.println("Trung hang rui. Nhap lai!! (¬‿¬)");
			}
		}
		System.out.println("(☞ﾟヮﾟ)☞ Congratulate ☜(ﾟヮﾟ☜)");
	}
}
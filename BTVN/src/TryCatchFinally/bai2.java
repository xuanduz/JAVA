package TryCatchFinally;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai2 {

	public static char space = ' ';

	public static void countChar(String check, String temp, List<String> list) {
		for (int i = 0; i < check.length(); i++) {

			if (check.charAt(i) != space) {
				temp += check.charAt(i);
			}
			if (check.charAt(i) == space || i == check.length()) {
				list.add(temp);
				temp = "";
			}
		}
		list.add(temp); // them phan tu cuoi cung
	}

	public static boolean isNumeric(String strNum) { // kiem tra
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException d) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap chuoi String: ");
		String check = sc.nextLine();

		List<String> list = new ArrayList<String>();

		String temp = "";
		String temp2 = "";
		int count = 0;
		countChar(check, temp, list);

		for (int i = 0; i < list.size(); i++) {
			if (isNumeric(list.get(i)) == false) {
				temp2 = "false";
				break;
			} else {
				count++;
			}
		}
		if (temp2 == "false") {
			System.out.println(temp2);
		} else {
			System.out.println("true, co " + count + " so");
		}

	}

}

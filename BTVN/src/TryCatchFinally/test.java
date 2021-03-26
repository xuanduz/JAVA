package TryCatchFinally;

import java.util.Random;

import java.util.Scanner;


public class test {
	public static void main(String args[]) {
		long[] arr = new long[10];
		Random rand = new Random(); // instance of random class
		int upperbound = Integer.MAX_VALUE;
//		int int_random = rand.nextInt(upperbound);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(upperbound);
		}
		System.out.println("Random integer");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Random integer value from 0 to " + (upperbound - 1) + " : " + arr[i]);
		}
		System.out.println("Nhap gia tri n1 can kiem tra: ");
		Scanner sc = new Scanner(System.in);
		
		try {
			int n1 = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("Khong phai so nguyen");
		}
		finally {
			System.out.println("Break");
		}
		
		
		
	}
}
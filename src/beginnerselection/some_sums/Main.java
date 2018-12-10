package beginnerselection.some_sums;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				int digitSum = sumDigits(i);
				if (a <= digitSum && digitSum <= b) {
					sum += i;
				}
			}
			System.out.println(sum);
		}
	}

	/**
	 * 数字和(各桁の和)を求める
	 * 
	 * @param i
	 *            数字和を求める対象の整数
	 * @return sum 数字和
	 */
	public static int sumDigits(int i) {
		int sum = 0;
		while (i != 0) {
			sum += i % 10;

			i /= 10;
		}
		return sum;
	}

}

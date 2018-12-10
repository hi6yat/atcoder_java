package beginnerselection.coins;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int x = scanner.nextInt();
			int total = 0;
			int count = 0;
			for (int i = 0; i <= a; i++) {
				for (int j = 0; j <= b; j++) {
					for (int k = 0; k <= c; k++) {
						total = i * 500 + j * 100 + k * 50;
						if (total == x) {
							count++;
							total = 0;
						}
						if (total > x) {
							break;
						}
					}
				}
			}
			System.out.println(count);

		}
	}
}

package beginnersselection.otoshidama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int y = scanner.nextInt();

			//
			int sum = 0;
			int h = 0;
			int t5 = 0;
			int t = 0;

			for (h = 0; h <= n; h++) {
				for (t5 = 0; t5 <= n; t5++) {
					t = n - h - t5;
					if (t >= 0) {

					} else {
						
					}
					if(sum == y) {
						
					}
				}
			}

		}
	}

}

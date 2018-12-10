package beginnercontest001.visibility;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int m = scanner.nextInt();
			String vv = null;
			if (100 > m) {
				vv = "00";
			} else if (100 <= m && m <= 5000) {
				vv = String.format("%04d", m).substring(0, 2);
			} else if (6000 <= m && m <= 30000) {
				vv = String.valueOf(String.valueOf(m / 1000 + 50).substring(0, 2));
			} else if (35000 <= m && m <= 70000) {
				int i = m / 1000;
				vv = String.valueOf((i - 30) / 5 + 80).substring(0, 2);
			} else if (m > 70000) {
				vv = "89";
			}
			System.out.println(vv);
		}
	}

}

package beginnersselection.card_games_for_two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();

			for (int i = 0; i < N; i++) {
				list.add(scanner.nextInt());
			}
		}
		Collections.sort(list, Comparator.reverseOrder());
		int aliceTotal = 0;
		int bobTotal = 0;
		for (int i = 0; i < list.size(); i++) {
			if (isEven(i)) {
				aliceTotal += list.get(i);
			} else {
				bobTotal += list.get(i);
			}
		}

		System.out.println(aliceTotal - bobTotal);
	}

	static boolean isEven(int i) {
		return i % 2 == 0;
	}

}

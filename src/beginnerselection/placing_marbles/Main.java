package beginnerselection.placing_marbles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(scanner.next().chars().filter(v -> v == '1').count());
		}
	}
}

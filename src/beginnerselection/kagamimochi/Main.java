package beginnerselection.kagamimochi;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();

			List<Integer> integers = IntStream.range(0, N).mapToObj(i -> scanner.nextInt())
					.collect(Collectors.toList());

			System.out.println(integers.stream().distinct().collect(Collectors.toList()).size());
		}

	}

}

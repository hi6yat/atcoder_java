import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			List<Long> list = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				list.add(scanner.nextLong());
			}
			int count = 0;
			while (isAllEven.test(list)) {
				list = list.stream().map(l -> l / 2).collect(Collectors.toList());
				count++;
			}
			System.out.println(count);
		}
	}

	static Predicate<List<Long>> isAllEven = list -> {
		return list.stream().allMatch(l -> l % 2 == 0);
	};
}

public class InBetween {
	static void printResult(int start, int end) {
		if (start >= end) {
			throw new IllegalArgumentException("End should be larger than start!");
		}
		while (start < end - 1) {
			System.out.println(start + 1);
			start++;
		}
	}

	static int sum(int start, int end) {
		if (start >= end) {
			throw new IllegalArgumentException("End should be larger than start!");
		}
		int sum = 0;
		while (start < end - 1) {
			sum += start + 1;
			start++;
		}
		return sum;
	}

	// Testing
	public static void main(String[] args) {
		printResult(1, 3);
		System.out.println(sum(1, 5));
	}
}
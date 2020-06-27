public class Calculation {
	public static void main(String[] args) {
		double x = 20;
		double y = 80;
		double z = 25 * (x + y);
		System.out.println(z);
		double remainder = z % 40;
		if (remainder <= 20) System.out.println("Total was over the limit!");
	}
}
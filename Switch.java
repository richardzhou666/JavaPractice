public class Switch {
	public static void main(String[] args) {
		char letter = 'C';
		switch (letter) {
			case 'A':
				System.out.println("Apple");
				break;
			case 'B':
				System.out.println("Banana");
				break;
			case 'C':
				System.out.println("Cheeries");
				break;
			case 'D':
				System.out.println("Dragon Fruit");
				break;
			case 'E':
				System.out.println("Elder Berry");
				break;
			default:
				System.out.println("Not in fruit basket");
		}
	}
}
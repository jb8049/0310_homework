package sugang;

public class Qus7 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			if (i <= 5) {
				for (int j = 1; j <= (5 - i); j++) {
					System.out.print('_');
				}
				for (int j = 1; j <= (2 * i) - 1; j++) {
					System.out.print('*');
				}
				System.out.println();
			} else {
				for (int k = 1; k <= i - 5; k++) {
					System.out.print('_');
				}
				for (int k = 1; k <= 19 - (2 * i); k++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}
}
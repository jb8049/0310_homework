package sugang;

public class Qus5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			if (i <= 5) {
				for(int c=1 ; c<= i-1; c++) {
					System.out.print('_');
				}
				
				for (int j = 1; j <=6-i; j++) {
					System.out.print('*');
				}
			} else {
				for(int c=1 ; c<=9-i; c++) {
					System.out.print('_');
				}
								
				for (int j = 1; j <= i-4; j++) {
					System.out.print('*');

				}
			} System.out.println();
		}

	}
}

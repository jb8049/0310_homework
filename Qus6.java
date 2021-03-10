package sugang;

public class Qus6 {

	public static void main(String[] args) {
		
		
		int hypen = 0;
		
		for(int i= 5; i>0; i-- ) {
			
			for(int j=1; j<=hypen; j++) {
				System.out.print('_');
			}
			for(int c=1; c<=(i*2)-1; c++) {
				System.out.print('*');
			}
			hypen++ ;
			System.out.println();
		}

	}

}

package Controlstat;

public class Switch2 {
	public static void main(String args[]) {
		
		char branch='c';
		int collgeyear=4;
		
		switch (collgeyear) {
		
		case 1:
			System.out.println("first year: English,Maths,Science");
			break;
			
		case 2:
			switch (branch) {
			
			case 'c':
				System.out.println("Computer science");
				break;
				
			case 'E':
				System.out.println("Electrical and eletronic engineering");
				break;
				
			case 'm':
				System.out.println("mechancial Engg");
				break;
			}
			
		case 3:
			switch (branch) {
			
			case 'c':
				System.out.println("Computer science");
				break;
				
			case 'E':
				System.out.println("Electrical and eletronic engineering");
				break;
				
			case 'm':
				System.out.println("mechancial Engg");
				break;
			}
			
		case 4:
			switch (branch) {
			
			case 'c':
				System.out.println("Computer science");
				break;
				
			case 'E':
				System.out.println("Electrical and eletronic engineering");
				break;
				
			case 'm':
				System.out.println("mechancial Engg");
				break;
			}
		}
	}

}

package Printer;

public class Epson extends Hp{
	
	   //Method1
		public void inkTank() {
			System.out.println("inkTank");
		}
		
		//Method2
		public void scanner() {
			System.out.println("scanner");
		}
		
		//Method3
		public void inkTankA3() {
			System.out.println("inkTankA3");
		}
		
		public static void main(String[] args) {
			Epson e=new Epson();
			e.inkTank();
			e.inkTankA3();
			e.scanner();
		}

}

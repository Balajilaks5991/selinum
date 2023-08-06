package Printer;


public class Brother extends Epson{
	   
	    //Method1
		public void laser1() {
			System.out.println("laser1");
		}
		
		//Method2
		public void laserAll() {
			System.out.println("laserAll");
		}
		
		//Method3
		public void laserA3() {
			System.out.println("laserA3");
		}
		
		public static void main(String[] args) {
			Brother b=new Brother();
			b.laser1();
			b.laserAll();
			b.laserA3();
			b.laserPrinter();
			
		}
}

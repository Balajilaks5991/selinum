package Printer;

public class Hp {

	//Method1
	public void laserPrinter() {
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
		Hp h=new Hp();
		h.laserPrinter();
		h.laserAll();
		h.laserA3();
		
	}
}

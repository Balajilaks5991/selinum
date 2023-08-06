package Laptop;
import Printer.Brother;
public class Lenovo {
	
	//method1
	public void lenovoSlim() {
		System.out.println("lenovoSlim");
	}
	
	//method2
	public void thinkPad() {
		System.out.println("thinkPad");
	}
	
	//method3
		public void ideaPad() {
			System.out.println("ideaPad");
		}
	
		public static void main(String[] args) {
			Lenovo l=new Lenovo();
			l.lenovoSlim();
			l.ideaPad();
			l.thinkPad();
			
			Brother b=new Brother();
			b.laserA3();
			
		}
}

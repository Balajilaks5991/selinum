package Laptop;
import Accessories.Ram;
public class Dell extends Ram{
	
	
	
	//method1
	public void dellGaming() {
		System.out.println("dellGaming");
	}
	
	//method2
		public void dellVoltra() {
			System.out.println("dellVoltra");
		}
	
		//method3
				public void dellUltra() {
					System.out.println("dellUltra");
				
				}	
	
		public static void main(String[] args) {
			Dell d=new Dell();
			d.dellGaming();
			d.dellUltra();
			d.dellVoltra();
			d.crusal();
			
			
		}

}

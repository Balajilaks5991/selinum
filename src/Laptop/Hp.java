package Laptop;

import Accessories.Ram;
public class Hp extends Ram{
	
	
	//method1
		public void hpSlim() {
			System.out.println("hpSlim");
		}
		
		//method2
		public void hpGaming() {
			System.out.println("hpGaming");
		}
		
		//method3
			public void hpVoltra() {
				System.out.println("hpVoltra");
			}
		
			public static void main(String[] args) {
				Hp h=new Hp();
				h.hpSlim();
				h.hpGaming();
				h.hpVoltra();
				h.crusal();
				
			}

}

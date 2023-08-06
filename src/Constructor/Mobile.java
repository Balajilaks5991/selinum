package Constructor;

public class Mobile extends Manucfac{
	
	public Mobile() {
		this(123);
		System.out.println("default mobile");
	}
	
	public Mobile(int id) {
		this (true);
		System.out.println("Mobile Id");
	}
	
	public Mobile(String Name) {
		super("VIVO PVT LTD");
		System.out.println("Mobile Name");
	}
	public Mobile(boolean id) {
		this("Vivo y22");
		System.out.println("dMobile Stock");
	}
	
	public static void main(String args[]) {
		Mobile m=new Mobile();
	}
	

}

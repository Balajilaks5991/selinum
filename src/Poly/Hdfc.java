package Poly;

public class Hdfc extends Icici {
	
	
	@Override
	public void homeLone(int id) {
		System.out.println("Hdfc bank Home Loan interest at"+id+"%");
	}
	
	public static void main(String[] args) {
		Hdfc h=new Hdfc();
		h.homeLone(9);
	}

}

package Poly;

public class Icici {

	public void homeLone(int id) {
		System.out.println("ICICI bank Home Loan interest at"+id+"%");
	}
	
	public static void main(String[] args) {
		Icici i=new Icici();
		i.homeLone(8);
	}
}

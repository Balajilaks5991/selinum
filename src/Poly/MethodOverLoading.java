package Poly;

public class MethodOverLoading {
	
	public void staffInfo() {
		System.out.println("Staff is abesent");
	}
	
	public void staffInfo(int id) {
		System.out.println("Staff id"+id);
	}
	
	public void staffInfo(String name) {
		System.out.println("Staff Name"+name);
	}
	
	public void staffInfo(int id,String name,long pho) {
		System.out.println("Staff id" +id);
		System.out.println("Staff Name"+name);
		System.out.println("Staff PhoneNumber"+pho);
	}
	
	public static void main (String[] args) {
		MethodOverLoading m=new MethodOverLoading();
		m.staffInfo();
		m.staffInfo(12);
		m.staffInfo("Balaji");
		m.staffInfo(12,"Balaji",7299237011l);
		
	}

}

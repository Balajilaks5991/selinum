package Server;

public class Lenovo {
	
	//Method1
	public void rackServer() {
		System.out.println("rackServer");
	}
	
	//Method2
	public void dataBaseServer() {
		System.out.println("dataBaseServer");
	}
	
	//Method3
	public void deskServer() {
		System.out.println("deskServer");
	}
	
	public static void main(String[] args) {
		Lenovo l=new Lenovo();
		l.rackServer();
		l.dataBaseServer();
		l.deskServer();
	}

}

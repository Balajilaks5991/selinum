package Constructor;

public class School extends College {
	
	public School() {
		this(100);
		System.out.println("Default Cons");
	}
	
	public School(int id) {
		this(7299237011l);
		System.out.println("Int Cons");
	}
	
	public School(String str) {
		super("RRIUM collge");
		System.out.println("String Cons");
	}
	
	public School(long l) {
		this("Balaji");
		System.out.println("long Cons");
	}
	public static void main(String args[]) {
		School s=new School();
	}
}

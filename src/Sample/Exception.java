package Sample;

public class Exception {
	public static void main(String[] args) {
		try {
			String s="balag1234";
			int pare= Integer.parseInt(s);
			System.out.println(pare);
		}catch(Throwable e){
			e.printStackTrace(); 
     	}
		  System.out.println("End");
     	
	}

}

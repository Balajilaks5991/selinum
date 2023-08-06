package String;

public class Str {
	public static void main(String args[]) {
	
		String s="Welcome to Java Program";
		//length
		int l=s.length();
		System.out.println(l);
		
		//chat at
		char c=s.charAt(1);
		System.out.println(c);
		
		//char array
		char[] cs=s.toCharArray();
		for (int i=0;i<cs.length;i++) {
			System.out.println(cs[i]);
		}
	
		//upper case
		String up=s.toUpperCase();
		System.out.println(up);
		
		//Lower case
		String lc=s.toLowerCase();
		System.out.println(lc);
		
		//replace
		String re=s.replace(" ","@");
		System.out.println(re);
		
		//empty
		String s1="   Java Program   ";
		boolean em=s1.isEmpty();
		System.out.print(em);
		
		//trim
		String trim=s1.trim();
		System.out.println(trim);
		
		int ip=s.indexOf("e");
		System.out.println(ip);
		
		int lio=s.lastIndexOf("m");
		System.out.println(lio);
		
		boolean sw=s.startsWith("Welcome");
		System.out.println(sw);
		
		boolean ew=s.endsWith("m");
		System.out.println(ew);
		
		boolean con=s.contains("Welcome");
		System.out.println(con);
		
		boolean eq=s.equals("Welcome to Java Program");
		System.out.println(eq);
		
		boolean ieq=s.equalsIgnoreCase("welcome to java Program");
		System.out.println(ieq);
		
		int com=s.compareTo("welcome to Java Program");
		System.out.println(com);
		
		int icom=s.compareToIgnoreCase("Welcome to Java Program");
		System.out.println(icom);
		
		String ss=s.substring(0,7);
		System.out.println(ss);
		
		String[] sp=s.split(" ");
		for(int i=0;i<sp.length;i++) {
			System.out.println(sp[i]);
		}
		
		
		

}

}

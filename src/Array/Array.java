package Array;

public class Array {
	public static void main(String args[]) {
		int a[]=new int[6];
		int sw;
		a[0]=120;
		a[1]=150;
		a[2]=100;
		a[3]=110;
		a[4]=130;
		a[5]=110;
		
				
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			System.out.println(a[j]);
			  }
			}
		}
		
		
		
		
		
	
	}

}

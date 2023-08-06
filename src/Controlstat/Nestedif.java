package Controlstat;

public class Nestedif {
	
	public static void main(String args[]) {
		int age =18;
		int weight =49;
		
		if (age>=18) {
			if (weight>50) {
				System.out.println("Your eliglble for voting");
			}else {
				System.out.println("Your not eliglable for voting");
			}
		}else {
			System.out.println("Age must be greater that 18");
		}
	}

}

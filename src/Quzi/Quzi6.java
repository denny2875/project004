package Quzi;

public class Quzi6 {

	public static void main(String[] args) {
		

		int sum = 0; 
		int i; 

		for (i = 1; i <= 100; i++) {
			sum = sum + i; 
			if (sum >= 500) {
				break;
			}
		}
		
			System.out.println("i: " + i + " , num " + sum); // 
		}
	}



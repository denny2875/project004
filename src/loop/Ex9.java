package loop;

public class Ex9 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		
		for (i = 1; i <= 20; i++) {
			sum = sum + i;
			System.out.println("i : " + i + ", sum : " + sum);
			
			if (sum >= 100) {
				break;
			}
		}
		System.out.println("i : " + i);
		System.out.println("sum : " + sum);
		
		
		

	}

}

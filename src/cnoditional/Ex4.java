package cnoditional;

public class Ex4 {

	public static void main(String[] args) {
		
		int rank = 2;
		
		switch (rank) {
		case 1: 
			System.out.println("메달의 색은 금색입니다.");
			break;
		case 2: 
			System.out.println("메달의 색은 은색입니다.");
			break;
		case 3: 
			System.out.println("메달의 색은 동색입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
			
	}

}

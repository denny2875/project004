package cnoditional;

public class Ex6 {

	public static void main(String[] args) {
		
		
        String rank = "1";
		
		switch (rank) {
		case "1": 
			System.out.println("메달의 색은 금색입니다.");
			break;
		case "2": 
			System.out.println("메달의 색은 은색입니다.");
			break;
		case "3": 
			System.out.println("메달의 색은 동색입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
						
		}
		float r = 1.1f;
//		실수 타입은 에러
//		switch (r) {
//		case 1.5f:
//			
//			break;
//
//		default:
//			break;
//		}
		
	}

}

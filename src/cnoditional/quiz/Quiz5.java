package cnoditional.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		int day = 2;
		
		if ((3 <= day) && (day <= 5)) {
			System.out.println("현재 계절은 봄입니다");
		}else if ((6 <= day) && (day <= 8)){
			System.out.println("현재 계절은 여름입니다.");
		}else if((9 <= day) && (day <= 11)){
			System.out.println("현재 계절은 가을입니다.");
		}else if((12 <= day) && (day <= 2) && (day <= 1)){
			System.out.println("현재 계절은 겨울입니다.");
		}else{
			System.out.println("월이 잘못되었습니다.");
		}
		
		
		
		
		
	}

}

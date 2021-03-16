package Basic_Study2;

public class Student {
	//필드
	String name;
	int score;
	
	Student(){
		//생성자
		score = 50;
	}
	
	//메소드
	int study (int score) {
		System.out.println("공부를 열심히 해서 1점+");
		score++;
		return score;
		
	}
	
	int playGame(int score) {
		System.out.println("게임을 열심히 해서 1점-");
		score--;
		return score;
	}
	
	int sleep(int score) {
		System.out.println("잠만잠");
		return score;
	}

}

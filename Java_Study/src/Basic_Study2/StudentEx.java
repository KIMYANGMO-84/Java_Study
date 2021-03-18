package Basic_Study2;

public class StudentEx {
	
	public static void main(String[] args) {
		Student s1 = new Student();
			
		for(int i = 0;i<30;i++) {
			int j = (int)(Math.random()*3 + 1);
			if(j == 1) {
				s1.score = s1.study(s1.score);
			} else if(j == 2) {
				s1.score = s1.playGame(s1.score);
			} else {
				s1.score = s1.sleep(s1.score);
			}
		}
		if(s1.score >= 70) {
			System.out.println(s1.score + "점 더욱 열심히 공부하도록");
		} else {
			System.out.println(s1.score + "점 때려쳐 ㅅㅂ");

		}
		
		
		
		
	}

}

//클래스의 용도
// 1.라이브러리(AIP: Application Program Interface)클래스 객체 생성 및 메소드 제공역할
// 2.실행클래스 main()메소드 제공 역할
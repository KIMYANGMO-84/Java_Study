package Basic_Study2;

public class Student {
	//�ʵ�
	String name;
	int score;
	
	Student(){
		//������
		score = 50;
	}
	
	//�޼ҵ�
	int study (int score) {
		System.out.println("���θ� ������ �ؼ� 1��+");
		score++;
		return score;
		
	}
	
	int playGame(int score) {
		System.out.println("������ ������ �ؼ� 1��-");
		score--;
		return score;
	}
	
	int sleep(int score) {
		System.out.println("�Ḹ��");
		return score;
	}

}

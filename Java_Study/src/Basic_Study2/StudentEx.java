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
		
		System.out.println(s1.score);
		
		
		
	}

}

//Ŭ������ �뵵
// 1.���̺귯��(AIP: Application Program Interface)Ŭ���� ��ü ���� �� �޼ҵ� ��������
// 2.����Ŭ���� main()�޼ҵ� ���� ����
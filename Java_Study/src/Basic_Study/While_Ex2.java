package Basic_Study;

import java.util.Scanner;

public class While_Ex2 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
	
				
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------------------");
			System.out.print("����> ");
			balance = scanner.nextInt();
			if(balance == 1) {
				System.out.println("���ݾ�> " + 10000);
			} else if(balance == 2) {
				System.out.println("��ݾ�> " + 2000);
			} else if(balance == 3) {
				System.out.println("�ܾ�> " + 8000);
			} else if(balance == 4) {
				break;			
			} else {
				System.out.println("1~4 ���� ���ڸ� ���� �����մϴ�.");
			}
		}
		System.out.println("���α׷�����");
	}

}

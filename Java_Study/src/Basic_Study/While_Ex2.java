package Basic_Study;

import java.util.Scanner;

public class While_Ex2 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
	
				
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			balance = scanner.nextInt();
			if(balance == 1) {
				System.out.println("예금액> " + 10000);
			} else if(balance == 2) {
				System.out.println("출금액> " + 2000);
			} else if(balance == 3) {
				System.out.println("잔액> " + 8000);
			} else if(balance == 4) {
				break;			
			} else {
				System.out.println("1~4 까지 숫자만 선택 가능합니다.");
			}
		}
		System.out.println("프로그램종료");
	}

}

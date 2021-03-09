package Basic_Study;
//while문과 Math.random()메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈의 합이 5가 아니면 계속 주사위를 던지고, 합이 5면 멈추는 코드를 작성
public class While_Ex1 {

	public static void main(String[] args) {
								
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			if(dice1 + dice2 == 5) {
				System.out.println("Dice1: " + dice1);
				System.out.println("Dice2: " + dice2);
				System.out.println("합계가 5가 입니다.");
				System.out.println(dice1 + " + " + dice2 + " = " + (int)(dice1 + dice2));
				break;
			}
			System.out.println("Dice1: " + dice1);
			System.out.println("Dice2: " + dice2);
			System.out.println("합계가 5가 아닙니다.");
			System.out.println(dice1 + " + " + dice2 + " = " + (int)(dice1 + dice2));
		}
		
		
	}
}

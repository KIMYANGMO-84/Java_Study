package Basic_Study;
//while���� Math.random()�޼ҵ带 �̿��ؼ� 2���� �ֻ����� ������ �� ������ ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� 5�� ���ߴ� �ڵ带 �ۼ�
public class While_Ex1 {

	public static void main(String[] args) {
								
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			if(dice1 + dice2 == 5) {
				System.out.println("Dice1: " + dice1);
				System.out.println("Dice2: " + dice2);
				System.out.println("�հ谡 5�� �Դϴ�.");
				System.out.println(dice1 + " + " + dice2 + " = " + (int)(dice1 + dice2));
				break;
			}
			System.out.println("Dice1: " + dice1);
			System.out.println("Dice2: " + dice2);
			System.out.println("�հ谡 5�� �ƴմϴ�.");
			System.out.println(dice1 + " + " + dice2 + " = " + (int)(dice1 + dice2));
		}
		
		
	}
}

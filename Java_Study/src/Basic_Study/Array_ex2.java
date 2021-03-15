package Basic_Study;

public class Array_ex2 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i = 0;i < 6;i++) {
			int ball =  (int)(Math.random()*46) + 1;
			lotto[i] = ball;
			System.out.println(i + 1 + "¹øº¼ : " + lotto[i]);
		}
		
		
	}

}

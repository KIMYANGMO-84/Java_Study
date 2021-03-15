package Basic_Study;

public class Array_ex3 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int i = 0;		
		while(i != 6) {
			int ball = (int)(Math.random()*46) + 1;
			lotto[i] = ball;						
			i++;			
		}
		for(int j = 0;j<lotto.length;j++) {
			System.out.println(j + 1 + "번째 볼 값 : " + lotto[j]);
		}
	}

}

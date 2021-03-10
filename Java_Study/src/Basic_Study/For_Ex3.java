package Basic_Study;
/* for 문을 이용하여 다음과 같이 *를 출력하는 코드를 작성
 *  *
 *  **
 *  ***
 *  **** 
 * */

public class For_Ex3 {
	public static void main(String[] args) {
		String x = "*";
		String y = "*";
		for(int i = 1;i<=4;i++) {
			System.out.println(x);
			x = x + y;
		}
		
		
	}

}

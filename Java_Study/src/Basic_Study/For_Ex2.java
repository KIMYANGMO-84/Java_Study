package Basic_Study;
//중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 출력 x,y는 10이하의 자연수
public class For_Ex2 {
	public static void main(String[] args) {
		for(int x = 1;x<=10;x++) {
			for(int y =1;y<=10;y++) {
				if(4*x + 5*y == 60) {
					System.out.println("x : " + x + ", " + "y : " + y);
				}
			}
		}
	}

}

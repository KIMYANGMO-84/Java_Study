package Basic_Study;
/* for ���� �̿��Ͽ� ������ ���� *�� ����ϴ� �ڵ带 �ۼ�
 *      *
 *     **
 *    ***
 *   **** 
 * */
public class For_Ex4 {
	public static void main(String[] args) {
		String x = " ";
		String y = "*";
		String y1 = "";
		
		for(int i = 1;i<=4;i++) {
			for(int j = 3;j>=i;j--) {
				System.out.print(x);
			}
			y1 = y1 + y;
			System.out.print(y1);
			System.out.println();
			
		}
		
	}
}

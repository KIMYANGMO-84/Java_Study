package Basic_Study;

//for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ�
public class For_Ex1 {

    public static void main(String[] args) {
        int total = 0;
        for(int i = 1;i<=100;i++) {
        	if(i%3 == 0) {
        		total = total + i;
        	} 
        }
        System.out.print(total);
    }

}

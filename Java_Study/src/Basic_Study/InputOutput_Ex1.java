package Basic_Study;

public class InputOutput_Ex1 {
	
	public static void main(String[] args) {
		
		int value = 123;
		
		System.out.printf("��ǰ�� ���� : %d��\n", value);
		System.out.printf("��ǰ�� ���� : %6d��\n", value);
		System.out.printf("��ǰ�� ���� : %-6d��\n", value);
		System.out.printf("��ǰ�� ���� : %06d��\n", value);

		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ���� : %10.2f\n", 10, area);
		
		String name = "����";
		String job = "�븮";
		
		System.out.printf("%6d | %-10S | %10s\n", 1, name, job);
		
	}

}

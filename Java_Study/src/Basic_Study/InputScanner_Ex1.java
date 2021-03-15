package Basic_Study;

import java.util.Scanner;

public class InputScanner_Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input;
		
		while(true) {
			input = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + input + "\"");
			
			if(input.equals("Quit")){
				break;
			}
			
		}
		
		System.out.println("종료");
	}

}

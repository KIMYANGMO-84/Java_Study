package Basic_Study;

public class InputOutput_Ex3 {
	
	public static void main(String[] args) throws Exception {
		
		int keycode;
		
		while(true) {
			keycode = System.in.read();
			System.out.println("keycode : " + keycode);
			
			if(keycode == 113) {
				break;
			}					
		}
		
		System.out.println("Á¾·á");
	}

}

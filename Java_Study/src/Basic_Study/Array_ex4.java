package Basic_Study;

public class Array_ex4 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		for(int i = 0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			} else {
				continue;
			}
		}
		
		System.out.println("Max: " + max);
	}

}

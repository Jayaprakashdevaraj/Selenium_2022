package week1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "changeme";
		
		char[] input = name.toCharArray();
		
		for(int i=0;i<input.length;i++) {
			if(i%2==0) {
				System.out.print(Character.toUpperCase(input[i]));
			}else {
				System.out.print((input[i]));
			}
		}

	}

}

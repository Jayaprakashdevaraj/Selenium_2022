package week1.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");
		int count = 0;

		for (int i=1; i<=split.length; i++) {
			for (int j = 0; j < split.length-2; j++) {
				if (split[i].equalsIgnoreCase(split[j])) {
					count++;
					if (count>1)
						split[j] = "";
				}
			}
		}
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]+" ");

		}
	}
}

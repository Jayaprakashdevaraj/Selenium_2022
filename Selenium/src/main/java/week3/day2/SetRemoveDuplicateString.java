package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetRemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {2,3,4,5,2,5,8,4,7,8};
		Set<Integer> unique = new LinkedHashSet<Integer>();
		for (int i = 0; i < num.length-1; i++) {
			
				System.out.println(unique.addAll(unique));
			
		}

	}

}

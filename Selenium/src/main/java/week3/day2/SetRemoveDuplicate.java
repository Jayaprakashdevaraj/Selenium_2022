package week3.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="google";
		char[] charArray = s.toCharArray();
		Set<Character> a = new LinkedHashSet<Character>();
		for (int i = 0; i<= charArray.length-1; i++) {
			a.add(charArray[i]);
		}
		System.out.println(a);
		

	}

}

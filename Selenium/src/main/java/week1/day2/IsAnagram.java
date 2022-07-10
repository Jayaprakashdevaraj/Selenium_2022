package week1.day2;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello";
		String str2 = "eolhl";
		boolean bAnagram = true;
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<ch2.length; i++) {
			if(ch1[i] != ch2[i]) {
				System.out.println("Not Anagram");
				bAnagram =false;
				break;
			}
		}
		if (bAnagram) {
			System.out.println("It is Anagram");
		}


	}

}

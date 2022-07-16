package week1.assignments;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split = test.split(" ");
		//String a = Arrays.toString(split);
		for(int i=0; i<split.length;i++) {
			if(i%2!=0) {
				String reverse="";
				char[] charArray = split[i].toCharArray();
				for(int j=charArray.length-1; j>=0;j--) {
					reverse = reverse+charArray[j];	
				}
				split[i] =reverse;
			}
		}
		for(int i=0; i<split.length;i++) {
			System.out.println(split[i]+ " ");
		}
		
		

	}

}

package week1.day2;

import java.util.Arrays;

public class FindDups {
	public static void main(String[] args) {
		int[] score = { 1,2,3,6,5,6,7,8,8};
		Arrays.sort(score);
		
		for (int i=0; i<score.length-1; i++ ) {
			for(int j=i+1; j<score.length;j++)
			if (score[i]==score[j]) {
				System.out.println(score[i]);
			}
		}
		
	}

}

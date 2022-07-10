package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 1,2,3,4,5,6,7,8,8,9,3,2,32,31,3,2,43,4,32,42,34,32,4,23,4};
		int length = score.length;
		
		//Size of the array
		System.out.println("The count is "+length);
		
		//Read first value
		System.out.println("The forst value is "+score[0]);
		
		//read last value
		System.out.println("The last value is "+score[length-1]);

		//sort ascending order
		Arrays.sort(score);
		
		
		//Fine no of 3 
		int num=3;
		int count=0;
		for (int i=0; i<score.length; i++ ) {
			if (score[i]==num) {
				count++;
			}
		}
		System.out.println("no of 3 is "+count);
	}

}

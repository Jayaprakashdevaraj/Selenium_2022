package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> learners = new ArrayList<String>();
		learners.add("Jp");
		learners.add("Ravi");
		learners.add("Ragu");
		learners.add("Jp");
		learners.add("Siva");
		
		int count = learners.size();
		System.out.println(count);
		
		learners.remove("Ragu");
		System.out.println(learners);
		
		learners.add(1, "Hema");
		System.out.println(learners);
		
		System.out.println(learners.get(learners.size()-1));
		
		//Sort
		Collections.sort(learners);
		System.out.println(learners);
		
	

	}

}

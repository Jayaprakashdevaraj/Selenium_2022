package week3.day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapPrintSingleOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,3,2,5};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
			
		}

	}

}

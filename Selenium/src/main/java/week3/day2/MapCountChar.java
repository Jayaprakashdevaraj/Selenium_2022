package week3.day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName = "amazon india";
		/*a=3 m=1 z =1 o =1 n=2 i=2 d=1;
		 *  char = key
		 *  Integer = value
		 */
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
	char[] charArray = companyName.toCharArray();
/*		for (int i = 0; i < charArray.length; i++) {
			char key = charArray[i];
			if(map.containsKey(key)) {
				Integer value = map.get(key);
				map.put(key, value+1);
			}else {
			map.put(key, 1);
			}
		}
		System.out.println(map);
*/
	// simple method in JAVA 1.8
	for (int i = 0; i < charArray.length; i++) {
		map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
	}
	System.out.println(map);
	
	}
	
	//find max occ
	int maxOcc =0;
	char maxOccChar =0;
	

}

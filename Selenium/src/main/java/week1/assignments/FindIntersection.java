package week1.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s1 = {3,2,11,4,6,7};	 
		int[] s2 = {1,2,8,4,9,7};
		for(int i=0; i<s1.length;i++) {
			for (int j=0; j<s2.length;j++) {
				if(s1[i] == s2[j]) {
					System.out.println(s1[i]);
				}
			}
		}

	}

}

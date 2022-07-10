package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String literal
		String companyName = "TestLeaf";
		
		//String Object
		String company = new String ("testleaf");
		
		//length
		int length = companyName.length();
		System.out.println("length is "+length);
		
		//tocharArray
		char[] chars = companyName.toCharArray();
		System.out.println(chars);
		for(int i=0;i<chars.length;i++) {
			System.out.println(chars[i]);
		}
		
		//equal
		boolean equals = companyName.equals(company);
		System.out.println(equals);
		
		//contains - case sensitive
		boolean contains = companyName.contains("test");
		System.out.println(contains);
		
		//charAt
		char third = companyName.charAt(2);
		System.out.println(third);
		
		//index of
		int indexOf = companyName.indexOf('e');
		System.out.println(indexOf);

	}

}

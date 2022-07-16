package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Madam";
		String s2="";
		int length = s1.length();
		for(int i=(length-1); i>=0;--i) {
			s2 =s2 + s1.charAt(i);
		}
		if(s1.toLowerCase().equals(s2.toLowerCase())) {
			System.out.println(s1+" is palindrome");
		}else {
			System.out.println(s1+" is not palindrome");
		}
		
	

	}

}

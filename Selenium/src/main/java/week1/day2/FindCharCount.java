package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Cognizant";
		int count = 0;
		char[] charArray = name.toCharArray();
		
for(int i=0; i<name.length();i++) {
	if(charArray[i]=='a') {
		count++;
	}
}
System.out.println("no of a is "+count);

	}

}

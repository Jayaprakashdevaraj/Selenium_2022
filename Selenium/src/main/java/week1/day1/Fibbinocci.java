package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =0;
		int n2 =1;
		int n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2; i<11; i++) {
			n3= n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}

}
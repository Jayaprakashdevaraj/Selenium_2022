package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 13;
		boolean isPrime= false;
		for (int i=2;i<=n1/2;i++) {
			if(n1%i==0) {
				isPrime = true;
				break;
			}
		}
		if (!isPrime) {
			System.out.println(n1+" is prime number");
		}else {
			System.out.println(n1+" is not prime number");
		}
		

	}

}

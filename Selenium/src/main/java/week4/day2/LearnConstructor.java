package week4.day2;

public class LearnConstructor {
	{
		System.out.println("I am block");
	}
	
	static {
		System.out.println("I am static block");
	}
	public LearnConstructor() {
		System.out.println("I am constructor block");
	}

	public static void main(String[] args) {
		System.out.println("I am main block");
		
		LearnConstructor con = new LearnConstructor();
	}
}

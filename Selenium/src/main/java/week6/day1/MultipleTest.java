package week6.day1;

import org.testng.annotations.Test;

public class MultipleTest {
	@Test
	public void run() {
		System.out.println("run");
	}
	
	@Test
	public void eat() {
		System.out.println("eat");
	}

	@Test
	public void walk() {
		System.out.println("walk");
	}
	
	@Test(priority = -1)
	public void sleep() {
		System.out.println("sleep");
	}


}

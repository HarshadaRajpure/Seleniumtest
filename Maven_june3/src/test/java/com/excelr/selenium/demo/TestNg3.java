package com.excelr.selenium.demo;

import org.testng.annotations.Test;

public class TestNg3 {

	
	@Test
	public void test1() {
		System.out.println("In testcase1");
	}
	
	@Test
	public void test2() {
		System.out.println("In testcase2");
	}
	
	@Test(priority = 6,invocationCount = 7)
	public void test3() {
		System.out.println("In testcase3");
	}
	
	@Test(priority = -6)
	public void test4() {
		System.out.println("In testcase4");
	}
	
	@Test
	public void test5() {
		System.out.println("In testcase5");
	}
}

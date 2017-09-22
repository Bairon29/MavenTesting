package com.junit.scholar2;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;



public class TestingAnotherTestNG {
	ResearchScholar research = new ResearchScholar();
	@Test(groups= {"priority1"})
	public void testgroup1() {
		System.out.println("from group 1");
		
	}
	@Test(groups= {"priority2"})
	public void testgroup2() {
		System.out.println("from group 2");
		
	}
}

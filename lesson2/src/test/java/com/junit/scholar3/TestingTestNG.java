package com.junit.scholar3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestingTestNG {
	ResearchScholar research = new ResearchScholar();
	@Test(dependsOnMethods= {"RankTestResearch"}, alwaysRun=true)
	public void RankTestResearch3() {
		research.rank(34);
		assertEquals("D", research.getRank());
		
	}
	@Test
	public void RankTestResearch() {
		research.rank(34);
		assertEquals("D", research.getRank());
		
	}
	@Test(timeOut=2000)
	public void RankTestResearch1() {
		research.rank(34);
		assertEquals("D", research.getRank());
		
	}
	@Test(enabled=false)
	public void RankTestResearch4() {
		research.rank(34);
		assertEquals("D", research.getRank());
		
	}
	@BeforeTest
	public void RankTestResearch5() {
		research.rank(34);
		assertEquals("D", research.getRank());
		
	}
	@AfterTest
	public void RankTestResearch6() {
		research.rank(34);
		assertEquals("D", research.getRank());
		
	}
	@BeforeSuite
	public void RankTestResearch7() {
		research.rank(34);
		assertEquals("D", research.getRank());
		
	}
	@AfterSuite
	public void RankTestResearch8() {
		research.rank(34);
		assertEquals("D", research.getRank());
		
	}
}

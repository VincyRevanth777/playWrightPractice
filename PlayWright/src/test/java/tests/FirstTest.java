package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class FirstTest extends BaseTest {

	@Test
	public void verifyTitle() {
		
		page.navigate("https://www.google.com/");
		
		System.out.println("Page Title :"+page.title());
		
	}
}

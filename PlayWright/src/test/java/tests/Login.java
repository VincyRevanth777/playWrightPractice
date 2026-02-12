package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class Login extends BaseTest{
	
	
	@Test
	public void loginSucess() {
		LoginPage loginPage = new LoginPage(page);
		
		page.navigate("https://practicetestautomation.com/practice-test-login/");
		
		
		loginPage.addUserName("student");
		loginPage.fillPassword("Password123");
		loginPage.clickLogin();
	}
	

}

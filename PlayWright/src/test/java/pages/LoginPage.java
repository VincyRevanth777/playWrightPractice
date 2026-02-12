package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	
	private Page page;
	private final String userName = "//*[@id=\"username\"]";
	private final String passWord = "//*[@id=\"password\"]";
	private final String loginButton = "//*[@id=\"submit\"]";
	
	public LoginPage(Page page) {
		this.page=page;
	}
	
	public void addUserName(String username) {
		page.fill(userName, username);
	}
	
	public void fillPassword(String password) {
		page.fill(passWord, password);
	}
	
	public void clickLogin() {
		page.click(loginButton);
	}
	

}

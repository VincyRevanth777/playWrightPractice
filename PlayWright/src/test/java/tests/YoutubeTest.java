package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class YoutubeTest extends BaseTest {
	
	
	@Test
	public void testYoutube() {
		try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = context.newPage();
		      page.navigate("https://www.youtube.com/");
		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).click();
		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).fill("raj prakash paul");
		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).press("Enter");
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Home").setExact(true)).click();
		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).click();
		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).fill("telugu ");
		      page.locator("div").filter(new Locator.FilterOptions().setHasText("telugu songs")).nth(5).click();
		    }
	}
	
	
	@Test
	public void youtubeTest2() {
		try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = context.newPage();
		      page.navigate("https://www.youtube.com/");
		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).click();
		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).fill("telugu songs");
		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).press("Enter");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Settings")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Location: India")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("United Kingdom")).click();
		    }
	}

}




//

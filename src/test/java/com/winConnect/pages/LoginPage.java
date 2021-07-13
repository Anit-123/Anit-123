package com.winConnect.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.winConnect.test.framework.PageObject;

public class LoginPage extends PageObject {
    
	WebDriver driver;
	@FindBy(how = How.XPATH, using = Loginlocators.userName)
	private WebElement username_win;
	@FindBy(how = How.XPATH, using = Loginlocators.passcode)
	private WebElement passcode_win;
	@FindBy(how = How.XPATH, using = Loginlocators.submit_button)
	private WebElement Submit;
	@FindBy(xpath = Loginlocators.error_msg)
	WebElement failedMsg;
	@FindBy(css = "div a div i")
	List<WebElement> loadMeterTbs;
	
	public void SetLogindetails() {
		win_Loginentries("Anita.Karthesan", "WelcomeHub2020");
		// return this;
	}

	public LoginPage SetLogindetails1() {
		win_Loginentries("subin.Fernad", "Selenium123");
		return this;
	}

	public LoginPage SetLogindetails2() {
		String expectedMessage = "Your Username or Password is incorrect. Please try again!";
		if (failedMsg.getAttribute("class").contains("Your Username or Password is incorrect")) {
			System.out.println("Success message is " + failedMsg.getText());
		}
		return this;
	}

	public void win_Loginentries(String string1, String string2) {
		// wait.until(ExpectedConditions.elementToBeClickable(username_win));
		elementisClickable(username_win);
		username_win.clear();
		username_win.sendKeys(string1);
		passcode_win.clear();
		passcode_win.sendKeys(string2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public void submit_win() {
		Submit.click();
	}
	
	public void nextpage_win() {
		checkPageTitleContains("Security");
		checkPageUrlContains(getCurrentUrl());
		System.out.println(getCurrentUrl());
			
	}
	public void menupage_win() {
        List<WebElement> rowwData =driver.findElements(By.cssSelector("div.MuiGrid-item-73:nth-child(n + 1) > div:nth-child(1) > div:nth-child(2)"));
		System.out.println("Displays count verified for CSScalculation  "  + rowwData.size());
		for(int j = 1; j < rowwData.size(); j++) {
		if(rowwData.get(j).getText().contains("Security"))  
			System.out.println("the value is present :  " + rowwData.get(j).getText());
	}}
}
/*
 * public static void main(String[] args){
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\Anita.Karthesan\\Selenium folder\\chromedriver_win32 (1)\\chromedriver.exe"
 * ); WebDriver driver = new ChromeDriver();
 * driver.get("http://10.30.40.17:3550/pages/login"); }
 */
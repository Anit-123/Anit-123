package com.winConnect.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.winConnect.pages.LoginPage;
import com.winConnect.test.framework.helpers.WebDriverHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepLogincheck {
	
	private LoginPage loginpage;
	private WebDriver driver;

	public StepLogincheck() {
		// TODO Auto-generated constructor stub

		driver = WebDriverHelper.getWebDriver();

		loginpage = PageFactory.initElements(driver, LoginPage.class);

	}
	
	@Given("I want to launch the browser and open the url")
	public void i_want_to_launch_the_browser_and_open_the_url() {
		
		driver.get("http://10.30.40.17:3550/pages/login");
	    
	}

	@When("i enters username and password")
	public void i_enters_username_and_password() {
	    
		loginpage.SetLogindetails();
		loginpage.submit_win();
	}

	@Then("I check the main application page open")
	public void i_check_the_main_application_page_open() {
		loginpage.nextpage_win();
	    
	}

	@Then("check all available opion on page.")
	public void check_all_available_opion_on_page() {
	    
		loginpage.menupage_win();
	}
	
	@When("I check for a Username with {string} the {string} in step")
	public void i_check_for_a_Username_with_the_in_step(String username, String password) {
	    loginpage.win_Loginentries(username, password);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String state) {
	    
	}





}

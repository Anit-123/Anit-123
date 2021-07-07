package com.winConnect.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.winConnect.pages.LoginPage;
import com.winConnect.test.framework.helpers.WebDriverHelper;

public class StepLoginDef {

	private LoginPage loginpage;
	private WebDriver driver;

	public StepLoginDef() {
		// TODO Auto-generated constructor stub

		driver = WebDriverHelper.getWebDriver();

		loginpage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {

		// driver.get("http://10.30.40.17:3550/pages/login");

	}

	@Given("open the URL")
	public void open_the_URL() {

		driver.get("http://10.30.40.17:3550/pages/login");

	}

	@When("I enters username and password")
	public void i_enters_username_and_password() {

		loginpage.SetLogindetails();
	}
	
	@When("press the submit button")
	public void press_the_submit_button() {
	    
		loginpage.submit_win();
	}
    
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
		String expectedUrl = driver.getCurrentUrl();
		loginpage.nextpage_win();

	}
	@Given("I want to open application")
	public void i_want_to_open_application() {
		driver.get("http://10.30.40.17:3550/pages/login");
	    
	}
	@When("I check for a Username with Anita.Karthesan the WelcomeHub{int} in step")
	public void i_check_for_a_Username_with_Anita_Karthesan_the_WelcomeHub_in_step(Integer int1) {
	   
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	   
		loginpage.SetLogindetails2();
	}
	
	@Then("I verify the Fail in step")
	public void i_verify_the_Fail_in_step() {
		
		loginpage.SetLogindetails2();
		
	}
}

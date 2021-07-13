package com.winConnect.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.winConnect.pages.AddContractsPages;
import com.winConnect.pages.LoginPage;
import com.winConnect.test.framework.PageObject;
import com.winConnect.test.framework.helpers.WebDriverHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addcontracts_subTest extends PageObject {
	
	private LoginPage loginpage;
	private AddContractsPages contractspage; 
	private WebDriver driver;
	public Addcontracts_subTest() {
		driver = WebDriverHelper.getWebDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		contractspage = PageFactory.initElements(driver, AddContractsPages.class);
	}
	@Given("I want to open Load &Meter tab")
	public void i_want_to_open_Load_Meter_tab1() {
	    
		driver.get("http://10.30.40.17:3550/pages/login");
		loginpage .SetLogindetails();;
		loginpage.submit_win();
		contractspage.gettincontractDetails();
	}

	@When("I Check for load & Meter page")
	public void i_Check_for_load_Meter_page() {
	   
	}

	@Then("it will shows the Tab {string} & {string}")
	public void it_will_shows_the_Tab(String string, String string2) {
	   
	}

	@Then("It should display of HotWater form")
	public void it_should_display_of_HotWater_form() {
	    
	}

	@Then("It should dispaly of MeteredGas form")
	public void it_should_dispaly_of_MeteredGas_form() {
	   
	}

	@Given("I want to open Load & Meter tab")
	public void i_want_to_open_Load_Meter_tab() {
	    
	}

	@When("I check for load & Meter page")
	public void i_check_for_load_Meter_page() {
	  
	}

	@Then("it will shows the Water Authority")
	public void it_will_shows_the_Water_Authority() {
	   
	}

	@Then("it shows the meters of hot water.")
	public void it_shows_the_meters_of_hot_water() {
	    
	}

	@When("I press the button Metered Gas")
	public void i_press_the_button_Metered_Gas() {
	  
	}

	@Then("it will shows the GasMetered tab")
	public void it_will_shows_the_GasMetered_tab() {
	  
	}

	@Given("I want to open Budget tab")
	public void i_want_to_open_Budget_tab() {
	   
	}

	@Then("it will display all its own {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void it_will_display_all_its_own(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
	  
	}

	@Then("all tab should display the $ Amount")
	public void all_tab_should_display_the_$_Amount() {
	    
	}

	@Then("all tab applicable to nagative and positive amount.")
	public void all_tab_applicable_to_nagative_and_positive_amount() {
	    
	}

	@Given("I want to open Prices,Fees And Charges")
	public void i_want_to_open_Prices_Fees_And_Charges() {
	  
	}

	@Then("it should shows {string} and {string}")
	public void it_should_shows_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("all tab should display details of Shared Price Plans & Fees and Charges.")
	public void all_tab_should_display_details_of_Shared_Price_Plans_Fees_and_Charges() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}

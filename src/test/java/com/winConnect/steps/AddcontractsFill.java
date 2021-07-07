package com.winConnect.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.winConnect.pages.AddContractsPages;
import com.winConnect.pages.LoginPage;
import com.winConnect.test.framework.helpers.WebDriverHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddcontractsFill {
	private LoginPage loginpage;
	private AddContractsPages contractspage; 
	private WebDriver driver;
	public AddcontractsFill() {
		driver = WebDriverHelper.getWebDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		contractspage = PageFactory.initElements(driver, AddContractsPages.class);
	}
	
	@Given("adding the {string} and {string}")
	public void adding_the_and(String username, String password) {
		loginpage .win_Loginentries(username,password);
	}

	@When("I complete submit")
	public void i_complete_submit() {
	    
		loginpage.submit_win();
	}

	@When("click the Add contracts option")
	public void click_the_Add_contracts_option() throws InterruptedException {
		
		contractspage.gettincontractDetails();
	    
	}

	@Then("It will navigate to Add contracts page")
	public void it_will_navigate_to_Add_contracts_page() {
		
		contractspage.nextpage_win();
	    
	}

	@Then("I validate the heading of the page as {string}")
	public void i_validate_the_heading_of_the_page_as(String string) {
	    
		contractspage.page_heading();
	}

	@When("I complete the details of the page")
	public void i_complete_the_details_of_the_page() {
	    
	}

	@When("Add values to {string},{string},{string}, {string} and {string}")
	public void add_values_to_and(String contractEn, String PropertyTy, String DevType, String ABN, String Location) {
	   
		try {
			contractspage.contractDetailsform(contractEn, PropertyTy, DevType, ABN, Location);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("Empty field shows red marker")
	public void empty_field_shows_red_marker() {
	   
	}

	@When("It should allows to next page of filling.")
	public void it_should_allows_to_next_page_of_filling() {
		
		contractspage.Nxt_details();
	}


}

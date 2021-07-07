package com.winConnect.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.winConnect.pages.ContractManagerPage;
import com.winConnect.pages.LoginPage;
import com.winConnect.test.framework.helpers.WebDriverHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContractsPage {
	
	private ContractManagerPage contractpage;
	private LoginPage loginpage;
	private WebDriver driver;
	public ContractsPage() {
		
		driver = WebDriverHelper.getWebDriver();
		contractpage = PageFactory.initElements(driver, ContractManagerPage.class);
		loginpage =  PageFactory.initElements(driver, LoginPage.class);
	}
	@Given("I want to veify contracts menu")
	public void i_want_to_veify_contracts_menu() {
	   
		driver.get("http://10.30.40.17:3550/pages/login");
		loginpage.SetLogindetails();
		loginpage.submit_win();
		//driver.get("http://10.30.40.17:3550/pages/appmenu");
		
	}

	@When("i enters Contracts option")
	public void i_enters_Contracts_option() {
	    contractpage.get_contractsoptions();
	}

	@Then("it should open Contracts page.")
	public void it_should_open_Contracts_page() {
	    
		contractpage.nextpage_win();
	}

	@When("i press the Contracts icon")
	public void i_press_the_Contracts_menu() {
		 contractpage.get_contractsoptions();
	}

	@Then("it will navigates to the Contracts display page")
	public void it_will_navigates_to_the_Contracts_display_page() {
	    
		contractpage.nextpage_win();
	}

	@Then("the heading of the page should be {string}")
	public void the_heading_of_the_page_should_be(String string) {
	   
		contractpage.page_heading();
	}

	@Then("sub menu bar is highlighted {string}")
	public void sub_menu_bar_is_highlighted(String string) {
	    
		contractpage.highlight_bkground();
	}
	
	@Then("the row state should shows the default no.of rows {string}")
	public void the_row_state_should_shows_the_default_no_of_rows(String string) {
	    
		contractpage.default_rowcount();
	}
	@Then("it should show Webtable with {int} rows with column tile.")
	public void it_should_show_Webtable_with_rows_with_column_tile(Integer int1) {
	   
	}

	@Then("column titles are {string}, {string}, {string}, {string}, {string}")
	public void column_titles_are(String string, String string2, String string3, String string4, String string5) {
	   
		contractpage.column_verify();
	}
	
	//row counting
	@Given("I open Contracts page")
	public void i_open_Contracts_page() {
		driver.get("http://10.30.40.17:3550/pages/login");
		loginpage.SetLogindetails();
		loginpage.submit_win();
		contractpage.get_contractsoptions();
	}

	@When("it will load the pending contracts records")
	public void it_will_load_the_pending_contracts_records() {
	   
		contractpage.column_verify();
	}

	@Then("I select the row count as <Row>")
	public void i_select_the_row_count_as_Row() {
		
	   contractpage.Calutating_Pages();
	}

	@Then("its outcome will be <RowData> rows with data incluing all columns")
	public void its_outcome_will_be_RowData_rows_with_data_incluing_all_columns() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}

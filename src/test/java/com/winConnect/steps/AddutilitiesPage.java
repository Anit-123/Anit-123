package com.winConnect.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.winConnect.pages.AddContractsPages;
import com.winConnect.pages.LoginPage;
import com.winConnect.test.framework.helpers.WebDriverHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddutilitiesPage {

	private LoginPage loginpage;
	private AddContractsPages contractspage; 
	private WebDriver driver;
	public AddutilitiesPage() {
		driver = WebDriverHelper.getWebDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		contractspage = PageFactory.initElements(driver, AddContractsPages.class);
	}
	
	@Given("I want to fill Utilities form on Add contracts page")
	public void i_want_to_fill_Utilities_form_on_Add_contracts_page() {
		
		driver.get("http://10.30.40.17:3550/pages/login");
		loginpage .SetLogindetails();;
		loginpage.submit_win();
		contractspage.gettincontractDetails();
	}

	@Given("I am completing the contracts Details")
	public void after_completing_the_contracts_Details() {
		contractspage.nextpage_win();
	}

	@When("I complete the contract details and press Next button")
	public void i_complete_the_contract_details_and_press_Next_button() {
		contractspage.page_heading();
	}

	@Then("It will land on {string} tab")
	public void it_will_land_on_tab(String string) {
		try {
			contractspage.SetcontractDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		contractspage.Nxt_details();
	}
	
	@When("I place tick the {string}")
	public void i_check_the(String option) {
		
		driver.switchTo().alert().dismiss();
		try {
				contractspage.UtilitesElec1(option);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	}
	@Then("The details fields are blank and ready to fill information")
	public void the_details_fields_are_blank_and_ready_to_fill_information() {
		contractspage.Utilities_heading();
	  }
	@Then("It will shows the details of electricity form to add the information")
	public void it_will_shows_the_details_of_electricity_form_to_add_the_information() {
	try {
				contractspage.SetElectricityDetails();
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
	@Then("It will shows the details of Hot water form to add the information")
	public void it_will_shows_the_details_of_Hot_water_form_to_add_the_information() {
	    
		try {
			contractspage.SethotWaterDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Then("It will shows the details of Metered Gas to add the information")
	public void it_will_shows_the_details_of_Metered_Gas_to_add_the_information() {
		
		//contractspage.Utilites_gas();
		 try {
			contractspage.SetmeteredDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("It will shows the details of Value Ads to add the information")
	public void it_will_shows_the_details_of_Value_Ads_to_add_the_information() {
		//contractspage.Utilites_valueAds();
		try {
		contractspage.SetvalueAddsDetails();
       //  contractspage.get_LoadMeteroptions();
       // contractspage.SetgasAuthorityDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("It will shows the details of EV charging to add the information")
	public void it_will_shows_the_details_of_EV_charging_to_add_the_information() {
		//contractspage.Utilites_EV();
		try {
			contractspage.SetEVchargeDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("It will shows the details of Solar PV to add the information")
	public void it_will_shows_the_details_of_Solar_PV_to_add_the_information() {
			
		//contractspage.Utilites_Solar();
		try {
			contractspage.SetSolarchargeDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("It will shows the details of Internet to add the information")
	public void it_will_shows_the_details_of_Internet_to_add_the_information() {
		//contractspage.Utilites_Internet();
		try {
			contractspage.SetInternetDetails();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Then("close the browser.")
	public void close_the_browser() {
	   driver.quit();
	}
	@Then("logout from the page")
	public void logout_from_the_page() {
	   contractspage.logout_options();
		
	}
	@Given("I want to open site contracts details page")
	public void i_want_to_open_site_contracts_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("After completing the Utilities page information")
	public void after_completing_the_Utilities_page_information() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I click the next button of the page")
	public void i_click_the_next_button_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I should lands on Site Detail")
	public void i_should_lands_on_Site_Detail() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("It show the heading as Add Contract")
	public void it_show_the_heading_as_Add_Contract() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("yet it shows the site details form to fill the information.")
	public void yet_it_shows_the_site_details_form_to_fill_the_information() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I add {string} {string} {string} {string} {string}")
	public void i_add(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("All details are filled and no fields are blank")
	public void all_details_are_filled_and_no_fields_are_blank() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Press the Next button.")
	public void press_the_Next_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("I want to add the site details of contract")
	public void i_want_to_add_the_site_details_of_contract() {
		
		driver.get("http://10.30.40.17:3550/pages/login");
		loginpage .SetLogindetails();;
		loginpage.submit_win();
		contractspage.gettincontractDetails();
		contractspage.nextpage_win();
		
		try {
			contractspage.SetcontractDetails();
			contractspage.UtilitesElec1("Hot Water");
			contractspage.SethotWaterDetails();
			contractspage.Nxt_details();
			//contractspage.SetcontractDetails();
			contractspage.SetSite_Details();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("I enters {string} {string} {string} {string}")
	public void i_enters(String Sitname, String STnumber, String StName, String StType, String Sub) {
//	    
//		try {
//			contractspage.setValue_Sitedetail(Sitname,STnumber,StName,StType,Sub);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}

	@When("Finally add {string}")
	public void finally_add(String string, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new cucumber.api.PendingException();
	}


}

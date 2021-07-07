package com.winConnect.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.winConnect.test.framework.PageObject;

public class AddContractsPages extends PageObject {
	private static final boolean True = false;
	private static final String option = null;
	WebDriver driver;
	@FindBy(how = How.XPATH, using = Menupagelocators.Contracts_iconwin)
	WebElement contract_button;
	@FindBy(how = How.XPATH, using = Contractspagelocators.addContract_win)
	WebElement addonButton;
	@FindBy(how = How.XPATH, using = Contractspagelocators.contrat_Entity_win)
	WebElement contractEntity1;
	@FindBy(how = How.XPATH, using = Contractspagelocators.property_Type_win)
	WebElement propertyType;
	@FindBy(how = How.XPATH, using = Contractspagelocators.development_Type_win)
	WebElement developmentType;
	@FindBy(how = How.XPATH, using = Contractspagelocators.aBN_ACN_win)
	WebElement aBNType;
	@FindBy(how = How.XPATH, using = Contractspagelocators.property_Location_State_win)
	WebElement propertyState;
	@FindBy(how = How.XPATH, using = Contractspagelocators.progress_Status_win)
	WebElement progressStatus;
	@FindBy(how = How.XPATH, using = Contractspagelocators.contract_Type_win)
	WebElement contractTy;
	@FindBy(how = How.XPATH, using = Contractspagelocators.distribution_Discount_win)
	WebElement distributionDiscount;
	@FindBy(how = How.XPATH, using = Contractspagelocators.Notes_win)
	WebElement notesForDetails;
	@FindBy(how = How.XPATH, using = Contractspagelocators.buttonOnNxt)
	WebElement nextContract_Deatils;
	@FindBy(tagName = "li")
	List<WebElement> dropdownlistlocators;
	@FindBy(xpath = Contractspagelocators.distribution_Discount_win)
	WebElement discount_win;
	@FindBy(xpath = Contractspagelocators.Notes_win)
	WebElement notes_In;
	@FindBy(xpath = Contractspagelocators.Electricity_Util)
	WebElement Electricity_op;
	@FindBy(xpath = Contractspagelocators.MeteredGas_Util)
	WebElement Metered_op;
	@FindBy(xpath = Contractspagelocators.HotWater_Util)
	WebElement hotwaterop;
	@FindBy(xpath = Contractspagelocators.ValueAdds)
	WebElement valueadds_op;
	@FindBy(xpath = Contractspagelocators.EVCharging)
	WebElement EVcharging_op;
	@FindBy(xpath = Contractspagelocators.SolarPV)
	WebElement solarPV_op;
	@FindBy(xpath = Contractspagelocators.Internet)
	WebElement internet_op;
	@FindBy(xpath = Contractspagelocators.businessModEV_win)
	WebElement BusinessmodelEV;
	@FindBy(xpath = Contractspagelocators.businessModSolar_win)
	WebElement BusinessmodelSolar;
	@FindBy(xpath = Contractspagelocators.connectionPtSolar_win)
	WebElement connection_var;
	@FindBy(xpath = Contractspagelocators.serviceTypeinternet_win)
	WebElement service_Internet;
	@FindBy(xpath = Contractspagelocators.addportableWater_win)
	WebElement tick_potable;
	@FindBy(xpath = Contractspagelocators.addAir_win)
	WebElement tick_Air;
	@FindBy(xpath = Contractspagelocators.addchilled_heated_win)
	WebElement tick_Chill_Heat;
	@FindBy(xpath = Contractspagelocators.heading_win)
	WebElement headingAdd;

	@FindBy(xpath = contractsSiteDetail.SiteName_win)
	WebElement SiteName;
	@FindBy(xpath = contractsSiteDetail.StreetNumber_win)
	WebElement StreetNumber;
	@FindBy(xpath = contractsSiteDetail.StreetName_win)
	WebElement StreetName;
	@FindBy(xpath = contractsSiteDetail.StreetType_win)
	WebElement StreetType;
	@FindBy(xpath = contractsSiteDetail.Suburb_win)
	WebElement Suburb;

	@FindBy(xpath = load_Meterlocators.ServiceTypemetGas_win)
	WebElement Metergas;
	@FindBy(xpath = load_Meterlocators.EV_Charging_win)
	WebElement Evcharge;
	@FindBy(xpath = load_Meterlocators.Solar_win)
	WebElement Solar_loadMeter;
	@FindBy(xpath = load_Meterlocators.Internet_win)
	WebElement internet_loadMeter;
	@FindBy(xpath = load_Meterlocators.gasAuthority_win)
	WebElement gasAuthorityselect;
	@FindBy(xpath = load_Meterlocators.volumebound_win)
	WebElement volumebound;
	@FindBy(xpath = load_Meterlocators.volumeboundReadT_win)
	WebElement volumeboundRT;
	@FindBy(xpath = load_Meterlocators.NoOfcaReadT_win)
	WebElement QuantityCA;
	@FindBy(xpath = load_Meterlocators.NoOfresidentialReadT_win)
	WebElement residentialRT;
	@FindBy(xpath = load_Meterlocators.NoOfcommercialReadT_win)
	WebElement commercialRT;
	@FindBy(xpath = load_Meterlocators.volboundreading_Schedule)
	WebElement volumeboundRSche;
	@FindBy(xpath = load_Meterlocators.NoOfcareading_Schedule)
	WebElement quantitycaRSch;
	@FindBy(xpath = load_Meterlocators.NoOfresireading_schedule)
	WebElement residentialRSch;
	@FindBy(xpath = load_Meterlocators.NoOfcommreading_schedule)
	WebElement commericialRSch;
	// @FindBy(xpath =load_Meterlocators.)
    //Electricity
	@FindBy(xpath = Contractspagelocators.serviceType_win)
	WebElement Service;
	@FindBy(xpath = Contractspagelocators.brand_win)
	WebElement brand;
	@FindBy(xpath = Contractspagelocators.businessMod_win)
	WebElement businessmod;
	@FindBy(xpath = Contractspagelocators.gateMeterpaidBy_win)
	WebElement gateMeter;
	@FindBy(xpath = Contractspagelocators.ENOwner_win)
	WebElement ENOwner;
	@FindBy(xpath = Contractspagelocators.ENOperator_win)
	WebElement ENOperator;
	@FindBy(xpath = Contractspagelocators.ENSeller_win)
	WebElement ENSeller;
	@FindBy(xpath = Contractspagelocators.ENOwnerABN_win)
	WebElement ENOwnerABN;
	@FindBy(xpath = Contractspagelocators.ENOperatorABN_win)
	WebElement ENOperatorABN;
	@FindBy(xpath = Contractspagelocators.ENSellerABN_win)
	WebElement ENSellerABN;
    
	//Hot Water
	@FindBy(xpath = Contractspagelocators.ServiceTypehotwater_win)
	WebElement hotwaterservice;
	@FindBy(xpath =Contractspagelocators.businessModhotwater_win)
	WebElement businessModel;
	@FindBy(xpath =Contractspagelocators.brandHotwater_win)
	WebElement brandhotwater;
	
	@FindBy(xpath = Logoutlocators.logout_win)
	WebElement logout_sub;
	@FindBy(xpath = Logoutlocators.Uesrname_Enl)
	WebElement userenlarge;
	@FindBy(xpath = Logoutlocators.Login)
	WebElement login_btn;
	@FindBy(css = "button span span span")
	List<WebElement> loadMeterTabs;

	public AddContractsPages gettincontractDetails() {
		elementToBeClickable(contract_button);
		contract_button.click();
		elementToBeClickable(addonButton);
		addonButton.click();
		return PageFactory.initElements(driver, AddContractsPages.class);
	}

	public AddContractsPages get_LoadMeteroptions() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement meteredGastab = loadMeterTabs.get(0);
		meteredGastab.click();
		return this;
	}

	public void SetcontractDetails() throws InterruptedException {
		contractDetailsform("Growthpoint Properties Australia Limited", "Commercial", "Greenfield", "33124093901",
				"VIC");
	}

	public void SetElectricityDetails() throws InterruptedException {
		setValue_Electricity("WINconnect Licence", "WINconnect Gas", "PSClient", "WINConnect");
	}

	private void setValue_Electricity(String serType, String brandTy, String BusinessMod, String GateMeter) {
		elementToBeClickable(Service).click();
		try {
			selectingValue_Check(serType);
			Thread.sleep(3000);
			elementToBeClickable(brand).click();
			selectingValue_Check(brandTy);
			Thread.sleep(5000);
			System.err.println("code passed");
			elementToBeClickable(businessmod).click();
			selectingValue_Check(BusinessMod);
			Thread.sleep(5000);
			System.err.println("code passed2");
			elementToBeClickable(gateMeter).click();
			selectingValue_Check(GateMeter);
			Thread.sleep(3000);
		    } catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//	public void SetelectricityDetails() throws InterruptedException {
//		UtilitesElec("WINenergy EN Elec Full Service", "WINconnect Gas", "WF",
//				"Growthpoint Properties Australia Limited", "33124093901", "WINenergy Pty Ltd", "71 112 175 710",
//				"GROWTHPOINT PROPERTIES AUSTRALIA LIMITED", "33 124 093 901");
//	}

	public void SetmeteredDetails() throws InterruptedException {
		setValue_MeteredGas("Metered Gas", "WINconnect Electricity", "CC");
	}

	public void SetEVchargeDetails() throws InterruptedException {
		setValue_EVcharging("Client Funded", "Gate Meter(s)", "Customer Care");
	}
    
	public void SethotWaterDetails() throws InterruptedException {
		setValue_HotWater("Bulk + Gas Cooktop + Bayonet", "Self Collect", "Client");
	}
	

	public void SetSolarchargeDetails() throws InterruptedException {
		setValue_SolarPVcharging("Client Funded", "WIN", "WIN Own", "CA/House Meter(s)");
	}

	public void GetLoad_MeterDetails() throws InterruptedException {

		setValue_Internetcharging("Free Modem Sign Up", "LBN Co");
	}

	public void SetvalueAddsDetails() throws InterruptedException {
		setValue_portableWater("Potable Water with Sewage", "Carbon EMT Electricity");
		setValue_FairAir("Fair Air", "Melbourne Airport Potable Water");
		setValue_chilled_HeatedWater("Chilled and Heated Water", "(decommissioned) Westmead Hospital");
	}

	public void SetSite_Details() throws InterruptedException {
		setValue_Sitedetail("109 Burwood Rd", "109", "Burwood", "Road", "Hawthron");
	}

	public void SetInternetDetails() throws InterruptedException {
		setValue_Internetcharging("Free Modem with Set-up", "LBN Co");
	}

	public void SetgasAuthorityDetails() throws InterruptedException {
		setValue_gasAuthority("Multinet Gas", "1", "2", "3", "4", "AMR", "Manual", "AMR", "Manual", "Fortnightly",
				"Bi-Monthly", "Monthly", "Quarterly");
	}
	private void setValue_HotWater(String serviceTy, String businessMod, String BrandT ) {
		elementToBeClickable(hotwaterservice).click();
		try {
			selectingValue_Check(serviceTy);
			Thread.sleep(5000);
			elementToBeClickable(brandhotwater).click();
			selectingValue_Check(BrandT);
			Thread.sleep(5000);
			elementToBeClickable(businessModel).click();
			selectingValue_Check(businessMod);
			System.err.println("code passed");
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
   }
   private void setValue_gasAuthority(String string, String string2, String string3, String string4, String string5,
			String stringVB, String stringCA, String stringResident, String stringCommercial, String stringVBread,
			String stringCAread, String stringResidentread, String stringCommercialread) {
		
		wait.until(ExpectedConditions.elementToBeClickable(gasAuthorityselect));
		WebElement Str = driver.findElement(By.xpath("//*[@id=\"formControl_loadNMeter.gasAuthority\"]"));
		Str.click();
		try {
			selectingValue_Check(string);
			Thread.sleep(7000);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
			WebElement VB = elementToBeClickable(By.xpath("//*[@id='formControl_loadNMeter.loadJSON.meteredGas.vbReadingType']"));
			VB.click();
			Thread.sleep(3000);
			VB.click();
			Thread.sleep(3000);
			selectingValue_Check(stringVB);
			// wait.until(ExpectedConditions.elementToBeClickable(QuantityCA)).click();
			WebElement CA = elementToBeClickable(By.xpath("//*[@id=\"formControl_loadNMeter.loadJSON.meteredGas.caReadingType\"]/div/div/div/div"));
			CA.click();
			Thread.sleep(3000);
			CA.click();
			selectingValue_Check(stringVB);
			Thread.sleep(3000);
			WebElement Reside = elementToBeClickable(By.xpath("//*[@id=\"formControl_loadNMeter.loadJSON.meteredGas.residentialReadingType\"]/div/div/div/div"));
			Reside.click();
			Thread.sleep(3000);
			Reside.click();
			selectingValue_Check(stringResident);
			Thread.sleep(3000);
			WebElement commer = elementToBeClickable(By.xpath("//*[@id=\"formControl_loadNMeter.loadJSON.meteredGas.commercialReadingType\"]/div/div/div/div"));
			commer.click();
			Thread.sleep(3000);
			commer.click();
			selectingValue_Check(stringCommercial);
			Thread.sleep(3000);
			WebElement VB1 = elementToBeClickable(By.xpath("//*[@id=\"formControl_loadNMeter.mGasVolumeReadingSch\"]/div/div/div/div"));
			VB1.click();
			Thread.sleep(3000);
			VB1.click();
			selectingValue_Check(stringVBread);
			Thread.sleep(3000);
			WebElement CA1 = elementToBeClickable(By.xpath("//*[@id=\"formControl_loadNMeter.mGasCaReadingSch\"]/div/div/div/div"));
			CA1.click();
			Thread.sleep(3000);
			CA1.click();
			selectingValue_Check(stringCAread);
			Thread.sleep(3000);
			WebElement Reside1 = elementToBeClickable(By.xpath("//*[@id=\"formControl_loadNMeter.mGasResiReadingSch\"]/div/div/div/div"));
			Reside1.click();
			Thread.sleep(3000);
			Reside1.click();
			selectingValue_Check(stringResidentread);
			Thread.sleep(3000);
			WebElement commer1 = elementToBeClickable(By.xpath("//*[@id=\"formControl_loadNMeter.mGasCommReadingSch\"]/div/div/div/div"));
			commer1.click();
			Thread.sleep(3000);
			commer1.click();
			selectingValue_Check(stringCommercialread);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(7000);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
			// wait.until(ExpectedConditions.elementToBeClickable(volumebound)).click();
			// selectingValue_Check(string2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void setValue_Sitedetail(String street1, String st_no, String st_name, String st_type, String sub_urb)
			throws InterruptedException {
		
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement site = elementToBeClickable(By.xpath("//input[@id='site.siteName']"));
		site.click();
		WebElement Street = driver.findElement(By.xpath("//input[@id=\"site.siteName\"]"));
		Street.sendKeys(street1);
		StreetNumber.sendKeys(st_no);
		StreetName.sendKeys(st_name);
		StreetType.sendKeys(st_type);
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.id("site.siteName"))).perform();
		// Suburb.clear();
		Suburb.sendKeys(sub_urb);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("li#downshift-1-item-0")).click();
		// li#downshift-1-item-0
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);
		nextContract_Deatils.click();
	}
//    public void Utilities_suburb() {
//    
//    	
//    	Suburb.sendKeys(sub_urb);
//		Thread.sleep(5000);
//    	
//    }
	public void selectingValue_Check(String S1) throws InterruptedException {
		Thread.sleep(2000);
		for (WebElement webElement : dropdownlistlocators) {
			if (webElement.getText().equalsIgnoreCase(S1)) {
				webElement.click();
			}
		}
	}

	public void scrollWithOffset(WebElement element, int x, int y) {
		String code = "window.scroll(" + (element.getLocation().x + x) + "," + (element.getLocation().y + y) + ");";
		((JavascriptExecutor) driver).executeScript(code, element, x, y);
	}

	public boolean scroll_Page(WebElement webele1, int scrollpts) {
		try {
			Actions dragger = new Actions(driver);
			int numberOfPixelsTodrag = 25;
			for (int i = 10; i < scrollpts; i = i + numberOfPixelsTodrag) {
				dragger.moveToElement(webele1).clickAndHold().moveByOffset(10, numberOfPixelsTodrag).release(webele1)
						.build().perform();
			}
			Thread.sleep(1000);
			return true;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
	}

	public void page_heading() {
		String title = headingAdd.getText();
		System.out.println(title);
		Assert.assertEquals(title, "Add Contract");
		// Assert.assertTrue(True);
	}
    public void Utilities_heading() {
    		
    	String title1 = waitForExpectedElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div/div[2]/div/div[1]")).getText();
    		System.out.println(title1);
    	switch (title1) {
		case "ELECTRICITY":
			 Assert.assertEquals(title1, "ELECTRICITY");
			 break;
		case "HOT WATER" :
			  Assert.assertEquals(title1, "HOT WATER");
			break;
		case "METERED GAS" :
			  Assert.assertEquals(title1, "METERED GAS");
			break;
		case "VALUE ADDS" :
			  Assert.assertEquals(title1, "VALUE ADDS");
			break;
		case "EV CHARGING" :
			  Assert.assertEquals(title1, "EV CHARGING");
			break;
		case "SOLAR PV" :
			  Assert.assertEquals(title1, "SOLAR PV");
			break;
		case "INTERNET" :
			  Assert.assertEquals(title1, "INTERNET");
			break;
			
		default:
			break;
		}
    }
    
	public void nextpage_win() {
		checkPageUrlContains(getCurrentUrl());
		System.out.println(getCurrentUrl());
		// Assert.assertTrue(true);
	}

	public AddContractsPages contractDetailsform(String Entity, String property, String development, String abn,String location) throws InterruptedException {
		driver = getWebDriver();
		Thread.sleep(5000);
		WebElement con = elementToBeClickable(By.xpath("//*[@id=\"contract.contractEntityEa\"]"));
	    con.click();
		//System.err.println("jklfsd fljwoeiru owieru oiwueroiwuer");
		WebElement entit = driver.findElement(By.xpath("//input[@id='contract.contractEntityEa']"));
		entit.sendKeys(Entity);
		// property Type
		WebElement propertyT = elementToBeClickable(By.cssSelector("#formControl_contract\\.contractJSON\\.propertyType > div > div > div > div"));
		propertyT.click();
		// driver.findElement(By.cssSelector(location)).click()
		selectingValue_Check(property);
		System.out.println("Development Type");
		// Development Type
		Thread.sleep(5000);
		WebElement develop =elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[4]/div[1]/div/div/div[1]/div/div/div/div/div[1]/div[4]/div[1]/div/div/div/div/div"));
		develop.click();
		selectingValue_Check(development);
		// ABN/ACN
		Thread.sleep(5000);
		elementToBeClickable(By.xpath("//input[@id='contract.abnea']"));
		WebElement entsaved = elementToBeClickable(By.xpath("//input[@id='contract.abnea']"));
		System.out.println("the string is " + abn);
		// aBNType.clear();
		entsaved.sendKeys(abn);
		// Location
		propertyState.click();
		selectingValue_Check(location);
		Thread.sleep(5000);
		nextContract_Deatils.click();
		// discount_win.sen
		return PageFactory.initElements(driver, AddContractsPages.class);
	}

	public void Nxt_details() {
		if (nextContract_Deatils.isEnabled()) {
			// Assert.assertTrue(True);
			try {
				Thread.sleep(2000);
				nextContract_Deatils.click();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }

/*	public void UtilitesElec_op(String option) throws InterruptedException {

		Electricity_op.click();
		
	}

	public void Utilites_hot(String option) {

		hotwaterop.click();
	}

	public void Utilites_gas() {

		Metered_op.click();
	}

	public void Utilites_valueAds() {

		valueadds_op.click();
	}

	public void Utilites_EV() {

		EVcharging_op.click();
	}

	public void Utilites_Solar() {

		solarPV_op.click();
	}

	public void Utilites_Internet() {

		internet_op.click();
	} */

	public void UtilitesElec1(String  option ) throws InterruptedException {
		switch (option) {
		 case "Electricity":
			elementToBeClickable(By.xpath("//span[text()=\"Electricity\"]")).click();
			break;
		case "Hot Water":
			elementToBeClickable(By.xpath("//span[text()=\"Hot Water\"]")).click();
			break;
		case "Metered Gas":
			elementToBeClickable(By.xpath("//span[text()=\"Metered Gas\"]")).click();
			break;
		case "Value Ads":
		      WebElement Ads = elementToBeClickable(By.xpath("//span[text()=\"Value Adds\"]"));
		      Ads.click();
			break;
		case "EV charging":
			  WebElement EVplug = elementToBeClickable(By.xpath("//span[text()=\"EV Charging\"]"));
			  EVplug.click();
			break;
		case "Solar PV":
			  elementToBeClickable(By.xpath("//span[text()=\"Solar PV\"]")).click();
			break;
		case "Internet":
			  elementToBeClickable(By.xpath("//span[text()=\"Internet\"]")).click();
			break;
		default:
			break;
		}
	}

	public void heading_option(String string) {
	}

	public void setValue_MeteredGas(String string, String string2, String string3) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement XGme = elementToBeClickable(By.xpath("//*[@id=\"formControl_service.meteredGasProductService\"]/div/div/div/div"));
		XGme.click();
		selectingValue_Check(string);
		WebElement XGme1 =elementToBeClickable(By.xpath("//*[@id=\"formControl_service.meteredGasBrand\"]/div/div/div/div"));
		XGme1.click();
		selectingValue_Check(string2);
		Thread.sleep(5000);
		WebElement XGme2 =elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div/div[2]/div/div[2]/div/div[3]/div/div/div/div/div"));
        XGme2.click();
		selectingValue_Check(string3);
		System.out.println("Metered Gas section is on ");
	}

	public void setValue_EVcharging(String string, String string2, String string3) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("EvCharging section is on 2of2");
	//	WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"formControl_service.serviceJSON.evChargingBusinessModel\"]/div/div/div/div"));
		System.out.println("EvCharging section is on 2of1");
		Thread.sleep(5000);
		// scroll_Page(scrollArea, 100);// js.executeScript("window.scrollTo(0,
		// document.body.scrollHeight)"); //cHROME DRIVER SPEC.
		System.out.println("EvCharging section is on 2");// scrollWithOffset(BusinessmodelEV, 200, 350);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.serviceJSON.evChargingBusinessModel\"]/div/div/div/div")).click();
		selectingValue_Check(string);
		Thread.sleep(4000);
		// For Firfox browser
		elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div")).click();
		selectingValue_Check(string2);
		Thread.sleep(4000);
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.serviceJSON.evChargingOperationalModel\"]/div/div/div/div")).click();
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"formControl_service.serviceJSON.evChargingOperationalModel\"]/div/div/div/div"))).click();
		selectingValue_Check(string3);
		System.out.println("EvCharging section is on ");
	}

	public void setValue_SolarPVcharging(String Model, String maintenance, String ownership, String connection)throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement scrollA1 = BusinessmodelSolar;
		Coordinates cor = ((Locatable) scrollA1).getCoordinates();
		cor.inViewPort();
		// Thread.sleep(1000);
		// scroll_Page(scrollA1, 200);
		System.out.println("SolarCharging section is on ");
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.serviceJSON.solarPVBusinessModel\"]/div/div/div/div")).click();
		selectingValue_Check(Model);
		Thread.sleep(4000);
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.serviceJSON.solarPVOngoingMaintenance\"]/div/div/div/div")).click();
		selectingValue_Check(maintenance);
		Thread.sleep(4000);
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.serviceJSON.solarPVSystemOwnership\"]/div/div/div/div")).click();
		selectingValue_Check(ownership);
		WebElement scrollA2 = connection_var;
		Coordinates cor1 = ((Locatable) scrollA2).getCoordinates();
		cor1.inViewPort();
		Thread.sleep(1000);
		// scroll_Page(scrollA2, 200);
		System.out.println("SolarCharging section is on 2nd scroll ");
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.serviceJSON.solarPVConnectionPoint\"]/div/div/div/div")).click();
		selectingValue_Check(connection);
	}

	private void setValue_Internetcharging(String service, String partner) throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		System.out.println("Internet section is on 2of2");
//		WebElement scrollArea1 = driver.findElement(By.xpath("//*[@id=\"formControl_service.internetProductService\"]/div/div/div/div"));
//		System.out.println("Internet section is on 2of1");
//		scroll_Page(scrollArea1, 100);
		System.out.println("Internet section is on ");
		Thread.sleep(5000);
		elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div/div/div/div ")).click();
		System.out.println("Internet section is on 2");
		selectingValue_Check(service);
		Thread.sleep(5000);
		elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div/div[2]/div/div[2]/div/div[3]/div/div/div/div/div/div")).click();
		selectingValue_Check(partner);
		// WebElement scrollA3 =
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/button"));
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);
		//nextContract_Deatils.click();
	}

	private void setValue_chilled_HeatedWater(String service, String brand) {
		try {
		Thread.sleep(7000);
		tick_Chill_Heat.click();
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.chilledAndHeatedWaterProductService\"]/div/div/div/div")).click();
			selectingValue_Check(service);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		Thread.sleep(7000);
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.chilledHeatedWaterBrand\"]/div/div/div/div")).click();
			selectingValue_Check(brand);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	private void setValue_FairAir(String service, String brand) throws InterruptedException {
		Thread.sleep(7000);
		tick_Air.click();
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.fairAirProductService\"]/div/div/div/div")).click();
		selectingValue_Check(service);
		Thread.sleep(7000);
		System.out.println("is on ");
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.fairAirBrand\"]/div/div/div/div")).click();
		selectingValue_Check(brand);

	}

	private void setValue_portableWater(String service, String brand) throws InterruptedException {
		Thread.sleep(7000);
		System.out.println("portableWater is on ");
		tick_potable.click();
  		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.potableWaterProductService\"]/div/div/div/div")).click();
		selectingValue_Check(service);
		Thread.sleep(7000);
		elementToBeClickable(By.xpath("//*[@id=\"formControl_service.potableWaterBrand\"]/div/div/div/div")).click();
		selectingValue_Check(brand);
	}

	public void setValue_addsSelection() throws InterruptedException {
		System.out.println("Value Adds ");
		tick_Air.click();
		tick_potable.click();
		tick_Chill_Heat.click();
		if (tick_Air.isSelected() && tick_potable.isSelected() && tick_Chill_Heat.isSelected()) {
			System.out.println("checkbox validation on");
			SetvalueAddsDetails();
		}
		nextContract_Deatils.click();
	}

	public void selectValueAdds(String valueAddtobeSeleted) {

		if (valueAddtobeSeleted.contains("Add Potable Water")) {
			tick_Air.click();
		} else if (valueAddtobeSeleted.contains("Add Air")) {
			tick_potable.click();
		} else if (valueAddtobeSeleted.contains("Add chilledAndHeatedWater")) {
			tick_Chill_Heat.click();
		} 
	}

	public void logout_options() {
		//wait.until(ExpectedConditions.elementToBeClickable(	By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li/a/div")));
		//userenlarge.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li/a/div")).click();
		logout_sub.click();
		elementisClickable(login_btn).click();
		System.err.println(driver.getCurrentUrl());
		elementToBeClickable(By.xpath("/html/body/div/div/header/div/ul/li[2]/a/div")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://10.30.40.17:3550/pages/logout");
	}
}

//*[@id="menuitem_service.meteredGasProductService_Metered Gas"]

//*[@id="service.serviceJSON.hasElectricity"]/label/span[2]
// <input aria-invalid="Required" class="MuiInputBase-input-568
// MuiOutlinedInput-input-838" id="contract.abnea" name="contract.abnea"
// type="text" value="">
// <input aria-invalid="Required" class="MuiInputBase-input-568
// MuiOutlinedInput-input-838" id="contract.abnea" name="contract.abnea"
// type="text" value="">
/*
 * Thread.sleep(5000); for (WebElement webElement : dropdownlistlocators) {
 * 
 * if (webElement.getText().equalsIgnoreCase(development)) {
 * 
 * 
 * webElement.click(); } }
 */

//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"formControl_service.serviceJSON.evChargingBusinessModel\"]/div/div/div/div")));
// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// System.out.println("EvCharging section is on 1");
// JavascriptExecutor js = (JavascriptExecutor) driver;
// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"formControl_service.serviceJSON.evChargingBusinessModel\"]/div/div/div/div")));

package com.winConnect.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.winConnect.test.framework.PageObject;
import com.winConnect.test.framework.helpers.WebDriverHelper;


public class AddContractsSubPages extends PageObject {
    
	WebDriver driver = WebDriverHelper.getWebDriver();
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
	@FindBy(tagName = "li")
	List<WebElement> dropdownlistlocators;
	@FindBy(css = "button span span span")
	List<WebElement> loadMeterTabs;
	// get_LoadMeteroptions
	@FindBy(xpath =Contractspagelocators.buttonOnNxt)
	WebElement nextbutton;
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
	@FindBy(xpath =load_Meterlocators.volumeboundValue_win)
	WebElement volumeboundV;
	@FindBy(xpath =load_Meterlocators.NoOfcaValue_win)
	WebElement CAvalue;
	@FindBy (xpath =load_Meterlocators.NoOfresiValue_win)
	WebElement resiValue;
	@FindBy (xpath =load_Meterlocators.NoOfcommValue)
	WebElement commercialValue;
	@FindBy(xpath =load_Meterlocators.privateEV_win)
	WebElement priEVchargers;
	@FindBy (xpath =load_Meterlocators.communalEV_win)
	WebElement communal;
	@FindBy (xpath =load_Meterlocators.EVDB_s_win)
	WebElement Evdb;
	@FindBy(xpath =load_Meterlocators.PVsystemsize_win)
	WebElement systemsize;
	@FindBy(xpath =load_Meterlocators.buildingwithPV_win)
	WebElement buildingPV;
	@FindBy(xpath =load_Meterlocators.Noofcommonarea_win)
	WebElement commonarea;
	@FindBy (xpath= load_Meterlocators.noOfResidential_win)
	WebElement Qtyresidential;
	@FindBy(xpath =PricesFeesAchargeslocators.privateUse_priceplan_win)
	WebElement privatepricePlan;
	@FindBy(xpath =PricesFeesAchargeslocators.commual_priceplan_win)
	WebElement communalpricePlan;
	@FindBy(xpath =PricesFeesAchargeslocators.gas_priceplan_win)
	WebElement gaspricePlan;

	public AddContractsPages get_LoadMeteroptions() {
		// wait.until(ExpectedConditions.elementToBeClickable(Metergas));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement meteredGastab = loadMeterTabs.get(0);
		meteredGastab.click();
       	return PageFactory.initElements(driver, AddContractsPages.class);
	}
	
	public void SetgasAuthorityDetails() throws InterruptedException {
		setValue_gasAuthority("Multinet Gas", "1", "2", "3", "4", "AMR", "Manual", "AMR", "Manual", "Fortnightly",
				"Bi-Monthly", "Monthly", "Quarterly");
	}
	public void selectingValue_Check(String S1) throws InterruptedException {
		Thread.sleep(2000);
		for (WebElement webElement : dropdownlistlocators) {
			if (webElement.getText().equalsIgnoreCase(S1)) {
				webElement.click();
			}
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
			WebElement Value = driver.findElement(By.xpath("//input[@id=\"loadNMeter.loadJSON.meteredGas.vbValue\"]"));
			Value.click(); 
			Value.sendKeys(string2);
			Thread.sleep(3000);
 		    WebElement CAvaluestring =driver.findElement(By.xpath("//input[@id=\"loadNMeter.loadJSON.meteredGas.caValue\"]"));
			CAvaluestring.click();
 		    CAvalue.sendKeys(string3);
			WebElement resiValue = driver.findElement(By.xpath("//input[@id=\"loadNMeter.loadJSON.meteredGas.residentialValue\"]"));
			resiValue.click();
			resiValue.sendKeys(string4);
			WebElement commValue = driver.findElement(By.xpath("//input[@id=\"loadNMeter.loadJSON.meteredGas.commercialValue\"]"));
			commValue.click();
			commercialValue.sendKeys(string5);
			Thread.sleep(3000);
			WebElement VB = driver.findElement(By.xpath("//*[@id='formControl_loadNMeter.loadJSON.meteredGas.vbReadingType']"));
			VB.click();
            Thread.sleep(3000);
            VB.click();
			selectingValue_Check(stringVB);
			Thread.sleep(3000);
			System.out.println("error  located");
		    WebElement CA =driver.findElement(By.xpath("//*[@id='formControl_loadNMeter.loadJSON.meteredGas.caReadingType']"));
			CA.click();
			Thread.sleep(3000);
			//CA.click();
			selectingValue_Check(stringCA);
			Thread.sleep(3000);
			WebElement Reside =driver.findElement(By.xpath("//*[@id='formControl_loadNMeter.loadJSON.meteredGas.residentialReadingTyp�']"));
		    Reside.click();
		    Thread.sleep(3000);
		    Reside.click();
		    selectingValue_Check(stringResident);
		    Thread.sleep(3000);
		    WebElement commer =driver.findElement(By.xpath("//*[@id=\"formControl_loadNMeter.loadJSON.meteredGas.commercialReadingType\"]/div/div/div/div"));
		    commer.click();
		    Thread.sleep(3000);
		    commer.click();
		    selectingValue_Check(stringCommercial);
		    Thread.sleep(3000);
		    WebElement VB1 = driver.findElement(By.xpath("//*[@id=\"formControl_loadNMeter.mGasVolumeReadingSch\"]/div/div/div/div"));
		    VB1.click();
		    Thread.sleep(3000);
		    VB1.click();
		    selectingValue_Check(stringVBread);
		    Thread.sleep(3000);
		    WebElement CA1 =driver.findElement(By.xpath("//*[@id=\"formControl_loadNMeter.mGasCaReadingSch\"]/div/div/div/div"));
		    CA1.click();
		    Thread.sleep(3000);
		    CA1.click();
		    selectingValue_Check(stringCAread);
		    Thread.sleep(3000);
		    WebElement Reside1 =driver.findElement(By.xpath("//*[@id=\"formControl_loadNMeter.mGasResiReadingSch\"]/div/div/div/div"));
		    Reside1.click();
		    Thread.sleep(3000);
		    Reside1.click();
		    selectingValue_Check(stringResidentread);
		    Thread.sleep(3000);
		    WebElement commer1 =driver.findElement(By.xpath("//*[@id=\"formControl_loadNMeter.mGasCommReadingSch\"]/div/div/div/div"));
		    commer1.click();
		    Thread.sleep(3000);
		    commer1.click();
		    selectingValue_Check(stringCommercialread);
		    Thread.sleep(3000);
		    driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);
		    nextbutton.click();
		    Thread.sleep(3000);
		    driver.switchTo().alert().dismiss();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void SetEVchargingDetails() throws InterruptedException {
		setValue_EVcharging("101", "2000","75");
	}
	private void setValue_EVcharging(String priEV, String useEV, String EVDBstring) {
		WebElement meteredGastab1 = loadMeterTabs.get(1);
		meteredGastab1.click();
		priEVchargers.click();
		priEVchargers.sendKeys(priEV);
		communal.click();
		communal.sendKeys(useEV);
		Evdb.click();
		Evdb.sendKeys(EVDBstring);
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	public void SetSolarDetails() throws InterruptedException {
		setValue_Solar("101", "2");
	}
	private void setValue_Solar(String size, String building) {
		WebElement meteredGastab2 = loadMeterTabs.get(2);
		meteredGastab2.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		systemsize.click();
		systemsize.sendKeys(size);
		buildingPV.click();
		buildingPV.sendKeys(building);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void SetInternetDetails() throws InterruptedException {

		setValue_Internet("25", "50");
	}
	private void setValue_Internet(String size, String building) {
		
		WebElement meteredGastab3 = loadMeterTabs.get(3);
		meteredGastab3.click();
		commonarea.click();
		commonarea.sendKeys(size);
		Qtyresidential.click();
		Qtyresidential.sendKeys(building);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		nextbutton.click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_UP);
		nextbutton.click();	
		nextbutton.click();	
		
	}
	public void SetPriceFees_ChargersDetails() throws InterruptedException {

		setValue_PriceeFesscharging("101", "2000","75");
	}
	private void setValue_PriceeFesscharging(String pripricePlan, String CommpricePlan, String gasPlan) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		WebElement communaluse =driver.findElement(By.xpath("//*[@id=\"formControl_feeNCharges.defaultPricePlanEvCommunal\"]/div/div/div/div"));		
        communaluse.click();
        communaluse.click();
        WebElement gasUse =driver.findElement(By.xpath("//*[@id=\"formControl_feeNCharges.defaultPricePlanMGas\"]/div/div/div/div"));
        gasUse.click();
	}
}
	

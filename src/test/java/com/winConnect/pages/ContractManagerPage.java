package com.winConnect.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.winConnect.test.framework.PageObject;
import com.winConnect.test.framework.helpers.WebDriverHelper;

public class ContractManagerPage extends PageObject {
	@FindBy(how = How.XPATH, using = Menupagelocators.Contracts_iconwin)
	WebElement contract_button;
	@FindBy(xpath = Menupagelocators.CompletedContracts_win)
	WebElement completed_menu;
	@FindBy(xpath = Menupagelocators.lostContracts_win)
	WebElement lost_menu;
	@FindBy(xpath = Menupagelocators.pageheading_win)
	WebElement heading;
	@FindBy(xpath =Menupagelocators.pendingCon_win)
	WebElement contractspend;
	@FindBy(className =Menupagelocators.pendingC_win)
	WebElement conpend;
	@FindBy(xpath = Completed_locators.row_selection10)
	WebElement row_10;
	@FindBy(xpath = Completed_locators.row_selection20)
	WebElement row_20;
	@FindBy(xpath = Completed_locators.row_selection25)
	WebElement row_25;
	@FindBy(xpath = Completed_locators.row_selection50)
	WebElement row_50;
	@FindBy(xpath = Completed_locators.row_selection100)
	WebElement row_100;
	@FindBy(xpath = Completed_locators.row_selection)
	WebElement row_Display;
	@FindBy(xpath = Completed_locators.total_pages)
	WebElement no_pages;
	@FindBy(xpath = Completed_locators.nextcompleted_win)
	WebElement button_next;
	
	public void get_contractsoptions() {
		elementisClickable(contract_button);
		contract_button.click();
		System.out.println("The contracts page isa ON2");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
    public void contract_icon() {
    	
    }
	public void nextpage_win() {

		checkPageUrlContains(getCurrentUrl());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getCurrentUrl());
		Assert.assertTrue(true);
	}
	
	public void page_heading() {
		
		String title = heading.getText();
		System.out.println(title);
		Assert.assertEquals(title, "Pending Contracts");
	}
	public void rowdisplay_selection() {
		System.out.println("The contracts page is a displays");
		elementToBeClickable(row_Display);
		row_Display.click();
	}
	public void Calutating_Pages() {
		WebDriver driver = WebDriverHelper.getWebDriver();
		String get_pages = no_pages.getText();
		System.out.println("Total Number of pages in the table is: " + get_pages);
		button_next.click();
		rowdisplay_selection();
	}
		
	public void highlight_bkground() {
	
		boolean tick = false;
		contractspend.click();
		tick = contractspend.isEnabled();
		System.out.println(tick);
	}
	public void default_rowcount() {
		
		List<WebElement> tableDatas = webDriver.findElements(By.cssSelector("div.rt-tr-group"));
		System.out.println("Row count verified " + tableDatas.size());
		if (tableDatas.size() == 20) {
			System.out.println("Row count verified");
		}
		else
			System.out.println("Row count not matched");
		Assert.assertTrue(false);
		//div.rt-td
	    }
	 
	public void column_verify() {
		
		List<WebElement> tableDatas1 = webDriver.findElements(By.cssSelector("div.rt-tr"));
		for (int i=0; i< tableDatas1.size(); i++) {
			System.out.println(tableDatas1.get(i).getText());
		}
	}
}

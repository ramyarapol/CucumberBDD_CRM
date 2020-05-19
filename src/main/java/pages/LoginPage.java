package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;


public class LoginPage {
	
	//public Logger log = Logger.getLogger("RTFFExecution");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		System.out.println("here: 2" + driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15);
	}
	
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement passWord;
	
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Contacts')]")
	WebElement contactsTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Contact')]")
	WebElement newContact;
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Deals')]")
	WebElement dealsTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Deal')]")
	WebElement newDeal;
	
	@FindBy(how = How.XPATH, using = "//input[@id='title']")
	WebElement titleFieldOnDealPage;
	
	@FindBy(how = How.XPATH, using = "//input[@id='amount']")
	WebElement amountFieldOnDealPage;
	
	@FindBy(how = How.XPATH, using = "//input[@id='probability']")
	WebElement probabilityFieldOnDealPage;
	
	@FindBy(how = How.XPATH, using = "//input[@id='commission']")
	WebElement commissionFieldOnDealPage;
	
	//check this
	
	/*
	 * public void userOnloginPage() {
	 * 
	 * 
	 * }
	 */
	 
	
	public void enterUserName(String username) {
		
		 wait.until(ExpectedConditions.visibilityOf(userName));
		 userName.sendKeys(username);
		
	}

	
	public void enterPassword(String password) {
		
		 wait.until(ExpectedConditions.visibilityOf(passWord));
		 passWord.sendKeys(password);
		
	}
	
	public void clickSubmitButton() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginButton);
		
	}
	
	public String getLoginPageTitle() {
		
		String loginPageTitle = driver.getTitle();
		System.out.println("Title of the page is : " + loginPageTitle);
		return loginPageTitle;
	}	
	
	
	public String homePageTitle() {
		String homePageTitle = driver.getTitle();
		System.out.println("Home Page Title is : " + homePageTitle);
		return homePageTitle;
	}
	
	
	public void clickOnContactsTab() {
		  driver.switchTo().frame("mainpanel");
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(contactsTab).build().perform();
		  newContact.click();
		
	}
	
	public void clickOnDealsTab() {
		  driver.switchTo().frame("mainpanel");
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(dealsTab).build().perform();
		  newDeal.click();
		
	}
	
	public WebElement getTitleFieldOnDealPage() {
		
		return titleFieldOnDealPage;
	}
	
	public WebElement getAmountFieldOnDealPage() {
		
		return amountFieldOnDealPage;
	}

	public WebElement getProbabilityFieldOnDealPage() {
	
	return probabilityFieldOnDealPage;
	}
	
	public WebElement getCommissionFieldOnDealPage() {
		
		return commissionFieldOnDealPage;
	}
	
	
	
	
}

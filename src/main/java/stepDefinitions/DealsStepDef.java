package stepDefinitions;

import java.awt.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*; 

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class DealsStepDef {
	
	WebDriver driver;
	LoginPage loginPage;
	
	public void DealStepDef() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\drivers\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
	}
			
	
	  @Given("User is already on Login Page") 
	  public void verifyLoginPage()  {
		  driver.get("https://classic.crmpro.com");
		  driver.manage().window().maximize();
	  }
	 
	  @When("The Title of Login Page is Free CRM")
	  public void the_Title_of_Login_Page_is_Free_CRM() {
		  loginPage.getLoginPageTitle();
		  Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", loginPage.getLoginPageTitle());
		
	  }
	  
	  @Then("User enters username and password")
	  public void user_enters_username_and_password(DataTable credentials) {
		 
		/*
		 * List<List<String>> data = credentials.raw();
		 * 
		 * loginPage.enterUserName(data.get(0).get(0));
		 * loginPage.enterPassword(data.get(0).get(1));
		 */
		
	  }
	  
	  
	  @Then("User clicks on Login button")
	  public void user_clicks_on_Login_button() {
		  
		loginPage.clickSubmitButton();
		  
	  }
	  
	  @Then("User is on Home Page")
	  public void user_is_on_Home_Page() {

		  loginPage.homePageTitle();
		  Assert.assertEquals("CRMPRO", loginPage.homePageTitle());
		  
	  }
	  
	  
	  @Then("User moves to new deals page")
	  public void newDealPage() {
		  loginPage.clickOnDealsTab();
	  }
	  
	  @Then("Then User enters deal details")
	  public void enterDealDetails(DataTable dealData) {
		  
		 /* List<List<String>> dealValue = dealData.raw();
		  
		  loginPage.getTitleFieldOnDealPage(dealValue.get(0).get(0));
		  loginPage.getAmountFieldOnDealPage(dealValue.get(0).get(1));
		  loginPage.getProbabilityFieldOnDealPage(dealValue.get(0).get(2));
		  loginPage.getCommissionFieldOnDealPage(dealValue.get(0).get(3));
	  */

	  }

}

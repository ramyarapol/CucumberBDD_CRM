package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepDef {
	WebDriver driver;
	LoginPage loginPage;
	
	public LoginStepDef() {
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
	  
	  // Reg exp
	  // 1. \"(.*)\"
	  // 2. \"([^\"]*)\"
	  
	  @Then("User enters \"(.*)\" and \"(.*)\"")
	  public void user_enters_username_and_password(String username, String password) {
		  
		  loginPage.enterUserName(username);
		  loginPage.enterPassword(password);
		
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
	  
	  
	  @Then("User moves to new contact page")
	  public void newContactPage() {
		  loginPage.clickOnContactsTab();
	  }
	  
	  @Then("User enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"")
	  public void enterContactDetails(String firstName, String lastName, String position) {
		  driver.findElement(By.id("first_name")).sendKeys(firstName);
		  driver.findElement(By.id("surname")).sendKeys(lastName);
		  driver.findElement(By.id("compa")).sendKeys(lastName);
	  }
	  
	  
	  @And("User closes the browser")
	  public void closeTheBroswer() {
		  driver.quit();
	  }
	
}

package com.vTiger.stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	WebDriver driver;
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.14.0//chromedriver_win32//chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("localhost:100");
	     driver.manage().window().maximize();
	    
	}

	@When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.name("user_name")).sendKeys(arg1);
	    driver.findElement(By.name("user_password")).sendKeys(arg2);
		//throw new PendingException();
	}
	
	@When("^user enters credentials to login$")
	public void user_enters_credentials_to_login(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
		 //Write the code to handle Data Table
		List<List<String>> data = arg1.raw();
		 
		 //This is to get the first data of the set (First Row + First Column)
		 driver.findElement(By.name("user_name")).sendKeys(data.get(0).get(0)); 
		 
		 //This is to get the first data of the set (First Row + Second Column)
		     driver.findElement(By.name("user_password")).sendKeys(data.get(0).get(1));
		 
		     driver.findElement(By.id("login")).click();
	}
	    
	/*
	 * @Then("^user should get error message$") public void
	 * user_should_get_error_message() throws Throwable {
	 * 
	 * if(driver.getCurrentUrl().contains("http://localhost:100/index.php"))
	 * System.out.println("Invalid credentials"); }
	 */
	@When("^clicks on Login button$")
	public void clicks_on_Login_button() throws Throwable 
	{
		driver.findElement(By.name("Login")).click();
		
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable 
	{
	    System.out.println("Home_PAGE");
	}

	@Then("^verify logout link$")
	public void verify_logout_link() throws Throwable 
	{
		driver.findElement(By.linkText("Logout")).click();
	}

	
}

package DynamicXpathExmpl;

import java.awt.Dimension;
import java.awt.Point;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class E2E_Test 
{
	private static WebDriver driver;
	public Dimension d;
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		
	
		System.setProperty("webdriver.chrome.driver", "C://selenium-java-3.14.0//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//To set size/to minimize size of window using selenium see below code
		//driver.manage().window().setPosition(new org.openqa.selenium.Point(0,-1000));
		/*
		 * We can set size by using Java_Dimension as well First create object of
		 * Dimension clss and provide x,y co-ordinates to resize window And then pass it
		 * to the setSize() method of driver window() method as below: Dimension d= new
		 * Dimension(300,600); driver.manage().window().setSize(d);
		 */
		
		/*
		 * Also we can use ChroomeOptions as well before crreating WebDriver instance as
		 * below After System.setProperty("", "");
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("window-size=800, 900");
		 * 
		 * //Then Desired Capabilities for browsesr chrome as below: DesiredCapabilities
		 * cap = DesiredCapabilities.chrome();
		 * cap.setCapability(ChromeOptions.CAPABILITY, options);
		 * 
		 * //Then open with this set size by creating instance of the webDriver interfae
		 * WebDriver driver = new ChromeDriver(cap);
		 */
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shop.demoqa.com");
		driver.navigate().to("http://shop.demoqa.com/?s="+"dress"+"&post_type=product");
		List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
		items.get(0).click();
		
		Thread.sleep(20);
		WebElement color = driver.findElement(By.id("pa_color"));
		//If it takes time or unable to fetch then scroll screen  we use JavascriptExecutor as below
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,650)", "");
		 */
		 
		//js.executeScript("arguements[0].scrollIntoView(true);", color);
	//This will scroll till perticular element Orelse we can use Actions class as well like below
		/*
		 * Actions actions = new Actions(driver); a
		 * actions.moveToElement(color);
		 * actions.perform();
		 */
		
		color.sendKeys("White");
		
		System.out.println("color selected");
		
		WebElement size = driver.findElement(By.id("pa_size"));
		size.sendKeys("Medium");
		
		
		
		  WebElement addToCart =
		  driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
		  addToCart.click();
		  
		  WebElement cart = driver.findElement(By.cssSelector(".cart-button"));
		  cart.click(); WebElement continueToCheckout =
		  driver.findElement(By.cssSelector(".checkout-button.alt"));
		  continueToCheckout.click(); Thread.sleep(5000);
		  
		  WebElement firstName =
		  driver.findElement(By.cssSelector("#billing_first_name"));
		  firstName.sendKeys("Lakshay");
		  
		  WebElement lastName =
		  driver.findElement(By.cssSelector("#billing_last_name"));
		  lastName.sendKeys("Sharma");
		  
		  WebElement emailAddress =
		  driver.findElement(By.cssSelector("#billing_email"));
		  emailAddress.sendKeys("test@gmail.com");
		  
		  WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
		  phone.sendKeys("07438862327");
		  
		  WebElement countryDropDown =
		  driver.findElement(By.id("select2-billing_state-container"));
		  countryDropDown.click(); Thread.sleep(2000); List<WebElement> countryList =
		  driver.findElements(By.id("select2-billing_state-container")); for(WebElement
		  country : countryList) { if(country.getText().equals("India")) {
		  country.click(); Thread.sleep(3000); break; } } WebElement city =
		  driver.findElement(By.cssSelector("#billing_city")); city.sendKeys("Delhi");
//This is change for GIT		  
		  WebElement address =
		  driver.findElement(By.cssSelector("#billing_address_1"));
		  address.sendKeys("Shalimar Bagh");
		  
		  WebElement postcode =
		  driver.findElement(By.cssSelector("#billing_postcode"));
		  postcode.sendKeys("110088");
		  
		  WebElement shipToDifferetAddress =
		  driver.findElement(By.cssSelector("#ship-to-different-address-checkbox"));
		  shipToDifferetAddress.click(); Thread.sleep(3000);
		  
		
		  List<WebElement> paymentMethod =
		  driver.findElements(By.cssSelector("ul.wc_payment_methods li"));
		  paymentMethod.get(0).click(); WebElement acceptTC =
		  driver.findElement(By.cssSelector("#terms.input-checkbox"));
		  acceptTC.click();
		 
		  
		  WebElement placeOrder = driver.findElement(By.cssSelector("#place_order"));
		  placeOrder.submit();
		 
		 
		 driver.quit();
		
	}

}

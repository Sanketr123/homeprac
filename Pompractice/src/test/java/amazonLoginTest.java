import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazonLoginTest {
	
	WebDriver driver;
	
	amazonLogin loginpage;
	
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(15);
		amazonLogin loginpage = new amazonLogin(driver);

	}
	
	@Test()
	public void testLogin() throws InterruptedException {
		

		
		loginpage.enterUsername("sanketraut33");
		Thread.sleep(15);
		loginpage.enterPassword("123456789");
		Thread.sleep(15);
		
		 WebElement usernameInput = driver.findElement(By.name("firstname"));
	        WebElement passwordInput = driver.findElement(By.name("lastname"));
		
		 Assert.assertEquals(usernameInput.getAttribute("value"), "sanketraut33");
	        Assert.assertEquals(passwordInput.getAttribute("value"), "123456789");

	}
	
	@Test()
	public void testcheck() throws InterruptedException{

		

		loginpage.checkclick();
		
			Thread.sleep(15);

	}
	
	
	@Test(dependsOnMethods = "testcheck")
	public void testdate(String date) throws InterruptedException{
		

		loginpage.datepicker("16-10-2020");
		
			Thread.sleep(15);

	}
		
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(15);
		driver.close();
		
	}
	
	
	

}

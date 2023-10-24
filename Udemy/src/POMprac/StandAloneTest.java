package POMprac;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pombase.BaseTest;



public class StandAloneTest extends BaseTest{
	
	
	@Test(dataProvider="getData")
	public void submitorder(String email,String password) throws InterruptedException{
		// TODO Auto-generated method stub

		String productName = "ZARA COAT 3";
		//WebDriver.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		LandingPage landingpage = new LandingPage(driver);
		
		landingpage.Goto();
		
		landingpage.loginapp("anshika@gmail.com", "IamKing@000");
		
		ProductCatalogue productcatalogue = new ProductCatalogue(driver);
		List <WebElement> products = productcatalogue.getProductList();
		productcatalogue.addProductToCart(productName);
			
	
//		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
//		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
//		driver.findElement(By.id("login")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
//			List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		
	WebElement prod =	products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
//		//ng-animating
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		List <WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));		
	Boolean match = 	cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));
	Assert.assertTrue(match);
	driver.findElement(By.cssSelector(".totalRow button")).click();
	
	Actions a = new Actions(driver);
	a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	
	driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
	driver.findElement(By.cssSelector(".action__submit")).click();
	
	String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
	Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	driver.close();
	
	 

}
	
	@Test(dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest()
	{
		//"ZARA COAT 3";
//		ProductCatalogue productCatalogue = landingPage.loginApplication("anshika@gmail.com", "Iamking@000");
//		OrderPage ordersPage = productCatalogue.goToOrdersPage();
//		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
		
}
	
	@DataProvider
	public Object[][] getData(){
		
		return new Object[][] {{"sanketraut33@gmail.com"},{"rautsanket33@gmail.com"}};
	}
	

	
	
}

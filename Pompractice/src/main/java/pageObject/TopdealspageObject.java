package pageObject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.driverclass;

public class TopdealspageObject extends driverclass {

	public TopdealspageObject(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Top Deals']") // oxd-select-dropdown --position-bottom
	WebElement opentopdealspage;

	@FindBy(xpath = "//button[@class='react-date-picker__calendar-button react-date-picker__button']") // oxd-select-dropdown --position-bottom
	WebElement calenderbutton;
	
	
	public void topdealspage() {

		opentopdealspage.click();

	}

	public void SwitchTOChild(WebDriver driver) throws InterruptedException {

		Set<String> windowid = driver.getWindowHandles();

		System.out.println(windowid);
		Thread.sleep(4000);

		Iterator<String> it = windowid.iterator();

		String parentid = it.next();

		String childid = it.next();

		driver.switchTo().window(childid);

		String childTitle = driver.getTitle();
		System.out.println(childTitle);

//		List<WebElement> footer = (driver.findElements(By.xpath("//div[@class='article-relatives'] //a")));
//
//		for (WebElement link : footer) {
//
//			link.sendKeys(Keys.CONTROL, Keys.ENTER);
//
//			Set<String> linkhandel = driver.getWindowHandles();
//
//			Iterator<String> linkhan = linkhandel.iterator();
//
//			while (linkhan.hasNext()) {
//
//				driver.switchTo().window(linkhan.next());
//
//				System.out.println(driver.getTitle());
//				
		

		List <WebElement>values=driver.findElements(By.xpath("//td[3]"));
		int sum =0;
		
		for(int i=0;i<values.size();i++) {
			
			System.out.println((values.get(i).getText()));
		
		}

				

			}
	
	public void clickoncalen() {
		
		calenderbutton.click();
		
	}


//verifyfooter link

//		Thread.sleep(6000);
//		driver.switchTo().window(parentid);

	}


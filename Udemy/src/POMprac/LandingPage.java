package POMprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	

	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	//pagefactory design
	
	@FindBy(id="userEmail")
	WebElement Useremail;
	

	@FindBy(id="userPassword")
	WebElement Password;
	

	@FindBy(id="login")
	WebElement submit;
	
	public void Goto() {
		
		driver.get("https://rahulshettyacademy.com/client");
		
	}
	
	
	public void loginapp(String email,String password) {
		
		Useremail.sendKeys(email);
		Password.sendKeys(password);
		submit.click();
	}
	
}

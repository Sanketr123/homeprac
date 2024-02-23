package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.driverclass;

public class HomePageObject extends driverclass{
	

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--text']")  //  oxd-select-dropdown --position-bottom
	WebElement addattachment;
	

	public HomePageObject(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void EnterNationality() throws InterruptedException {

		

	}
	

}

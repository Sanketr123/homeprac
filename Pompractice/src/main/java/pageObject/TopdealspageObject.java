package pageObject;

import java.util.List;

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

	public void topdealspage() {
		
		opentopdealspage.click();

	}

}

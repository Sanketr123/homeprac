package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.driverclass;

public class HomePageObject extends driverclass{
	
	public HomePageObject(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath = "//h4[@class='product-name']")  //  oxd-select-dropdown --position-bottom
	List<WebElement> listofvegetables;
	
	@FindBy(xpath = "//input[@class='search-keyword']")  //  oxd-select-dropdown --position-bottom
	WebElement searchbutton;
	
	@FindBy(xpath = "//a[@class='increment']")  //  oxd-select-dropdown --position-bottom
	WebElement addcucumber;
	
	@FindBy(xpath = "//button[text()='ADD TO CART']")  //  oxd-select-dropdown --position-bottom
	WebElement addtocart;
	
	@FindBy(xpath = "//a[@class='cart-icon' ]")  //  oxd-select-dropdown --position-bottom
	WebElement carticon;
	
	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")  //  oxd-select-dropdown --position-bottom
	WebElement checkout;

	
	public void listofveggie() throws InterruptedException {

		List<String> vegetableNames = new ArrayList<>();
		
		for (WebElement vegetableElement : listofvegetables) {
            vegetableNames.add(vegetableElement.getText());
            
        }
		 for (String vegetableName : vegetableNames) {
	            System.out.println(vegetableName);
	        }
	}
	
	public void search() throws InterruptedException {
		searchbutton.sendKeys("Cucumber");
	
	}
	
	public void addcucumber() throws InterruptedException {
		
		for(int i=1;i<4;i++) {
		addcucumber.click();
		
		addtocart.click();
		
		carticon.click();
		
		checkout.click();
		}
	
	}


}

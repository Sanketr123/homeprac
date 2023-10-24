package POMprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomabstractcomponent.AbstractComponent;

public class ProductCatalogue extends AbstractComponent{
	

	WebDriver driver;
	

	public ProductCatalogue(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	

	@FindBy(css=".mb-3")
	List<WebElement> products;
	

	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	//By productsBy = By.cssSelector(".mb=3");
	
	
	public List<WebElement> getProductList(){
		waitforelement(By.cssSelector(".mb=3"));
			return products;
		}
	
	public WebElement getProductByName(String productName) {
		
		WebElement prod =	products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
		
		
	}
	
	public void addProductToCart(String productName) throws InterruptedException {
		
		WebElement prod = getProductByName(productName);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		waitforelement(By.cssSelector("#toast-container"));
		waitforelementtoDisappear(spinner);
	}
	
	
		
	}
	

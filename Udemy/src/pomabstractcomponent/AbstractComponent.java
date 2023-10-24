package pomabstractcomponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	
	
	
	WebDriver driver;
	
	
	public AbstractComponent(WebDriver driver) {
		
		this.driver=driver;
		
	}

	public void waitforelement(By findby) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
		
		
	}
	
public void waitforelementtoDisappear(WebElement ele) throws InterruptedException {
		
	Thread.sleep(1000);
	
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.invisibilityOf(ele));
		
		
	}
	
	

}

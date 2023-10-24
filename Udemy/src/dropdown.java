import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getTitle());
		
		
		
			
		}
			
		//Assert.assertTrue(System.out.println(), "India");
			
	}

}


































//
//driver.findElement(By.id("autosuggest")).sendKeys("Ind");
//
//List<WebElement> options =driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/a"));
//
//for(WebElement option:options) {
//	
//	if(option.getText().equalsIgnoreCase("India")) {  //
//	
//		option.click();
//	break;
//	
//	}
	
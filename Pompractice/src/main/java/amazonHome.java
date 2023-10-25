import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amazonHome {
	
	WebDriver driver;
	
public amazonHome(WebDriver driver) {
		
		this.driver=driver;
		
	}

public void Profession() {
	
	driver.findElement(By.id("profession-1")).click();
	
}

public void Automation() {
	
	  driver.findElement(By.id("tool-2")).click();
	
}



}

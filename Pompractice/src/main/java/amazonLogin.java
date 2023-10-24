import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amazonLogin {
	
	WebDriver driver;
	
	public amazonLogin(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	 public void enterUsername(String username) {
	        driver.findElement(By.name("firstname")).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(By.name("lastname")).sendKeys(password) ;
	    }
	    
	   
	    public void checkclick() {
	    	
	    	driver.findElement(By.id("exp-4")).click();
	    	
	    }
	    
	    public void datepicker(String date) {
	    	
	    	// Enter Date
	        driver.findElement(By.id("datepicker")).click();
	        driver.findElement(By.id("datepicker")).sendKeys(date);
	    	
	    }

	    
}

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class amazonHomeTest {
	
	WebDriver driver;
	amazonHome amazonHome = new amazonHome(driver);
	
	
	@Test()
	public void Profession() throws InterruptedException{

		

		amazonHome.Profession();
		
		
			Thread.sleep(15);

	}
	
	
	@Test()
	public void Automation () throws InterruptedException{

	   //amazonHome amazonHome = new amazonHome(driver);

		amazonHome.Automation();
		
		
			Thread.sleep(15);

	}
	
	

}

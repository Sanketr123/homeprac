package pombase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POMprac.LandingPage;

public class BaseTest {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop = new Properties();
		
		String BrowserName = prop.getProperty("browser");
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\pomresources\\GlobalData.properties");
				
		prop.load(fis);
		
			if(BrowserName.equalsIgnoreCase("Chrome")) {
		        //WebDriver driver = new ChromeDriver();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();	
		
				return driver;
	}
			else if(BrowserName.equalsIgnoreCase("firefox")){
				
				
			}
			else {
				
	
				
			}
			return driver;
			
			
}
	
	@BeforeMethod 
	public void launchApplication() throws IOException {
		
		 driver = initializeDriver();
		 LandingPage landingpage = new LandingPage(driver);
			
			landingpage.Goto();
			
		
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.close();
	}
	
	
	public String getScreenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+""+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+""+".png";
	}
	
	
}

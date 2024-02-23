package endtoendtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePageObject;
import pageObjects.Loginpage_object;
import testBase.driverclass;

public class endtoendTC extends driverclass{
	
	  
		@Test()           //priority = 1, groups = "group1"
		public static void vegetables() throws InterruptedException {
				
			
			HomePageObject homepage =new HomePageObject(driver);
			
		
			
			String title=driver.getTitle();
			System.out.println(title);
			
			 Assert.assertTrue(title.contains("OrangeHRM"), "Title does not contain expected text");
			 
			 

		}

}

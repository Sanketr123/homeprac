package endtoendtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePageObject;
import pageObject.TopdealspageObject;
import pageObjects.Loginpage_object;
import testBase.driverclass;

public class endtoendTC extends driverclass{
	
	  
		@Test (priority = 1)       //priority = 1, groups = "group1"
		public static void vegetables() throws InterruptedException {
				
			
			HomePageObject homepage =new HomePageObject(driver);
			
		
			homepage.listofveggie();
			
			homepage.search();
			
			homepage.addcucumber();
			 

		}
		
		@Test(priority = 2)
		
		public static void topDeals() throws InterruptedException {
			
			TopdealspageObject topdeals = new TopdealspageObject(driver);
			
			topdeals.topdealspage();
			
			topdeals.SwitchTOChild(driver);
			
			topdeals.clickoncalen();
			
			Thread.sleep(3000);

}
		
}

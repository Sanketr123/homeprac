import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Intro {

	public static void main(String[] args) throws InterruptedException {

			
		//System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		String password = getpassword(driver);
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("contact@rahulshetty.com");
		
		driver.findElement(By.name("inputPassword")).sendKeys(password);
////		
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click(); //tagname,attribute,value"
////
////
//		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	.
////		
////		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in");
//		
		}
	
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Sanket");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("Sanket@gmail.com");

		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("123456789");
		
		Thread.sleep(5);
		driver.findElement(By.className("reset-pwd-btn")).click();

		Thread.sleep(5);

		String passwordText=driver.findElement(By.tagName("p")).getText();

		String[] passwordArray = passwordText.split(" ' ");
		String password = passwordArray[1].split(" ' ")[0];
		return password;
		
	}
		
}

















//int [][][] arr = {{{1,2},{3,4}},
//		{{5,6},{7,8}}};
//
//
//for (int i = 0;i< 2;i++) {
//	for (int j = 0;j<2;j++) {
//		for (int k=0;k<2;k++)
//		System.out.print(arr[i][j][k]+" ");
//	}
//		System.out.println();
//
//}
// System.out.println();





//for(int i=0;i<4;i++) {
//	 for(int j=4;j<=i;j--) {
//
//		 System.out.print("*");
//	 }
//	 System.out.println();
//	 
// }
// 
//
//
//
//for(int i=0;i<4;i++) {
//	 for(int j=0;j<=i;j++) {
//
//		 System.out.print("*");
//	 }
//	 System.out.println();
//	 
// }
//
//
//
//
//
//
//for(int i =1;i<=4;i++){
//        for(int j=1;j<=i;j++){
//          System.out.print(" ");
//        }
//        for(int z=4;z>=i;z--){
//          System.out.print("*");
//        }
//        System.out.println();
//      }
//      
//      for(int i =1;i<=4;i++){
//	        for(int j=4;j>=i;j--){
//	          System.out.print(" ");
//	        }
//	        for(int z=1;z<=i;z++){
//	          System.out.print("*");
//	        }
//	        System.out.println();
//      
//  }
//
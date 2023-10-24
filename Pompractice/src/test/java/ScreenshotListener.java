import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener{
	
	 private WebDriver driver;
	 
	 
	 public String getScreenshot(String testName) throws IOException {
		    TakesScreenshot ts = (TakesScreenshot) driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(System.currentTimeMillis()));
		    String screenshotName = testName + "_" + timestamp + ".png";
		    File file = new File(System.getProperty("user.dir"), screenshotName); // Fix this line
		    FileUtils.copyFile(source, file);
		    return file.getAbsolutePath();
		}

	 
//	 public String getScreenshot() throws IOException {
//			
//			TakesScreenshot ts = (TakesScreenshot)driver;
//			File source = ts.getScreenshotAs(OutputType.FILE);
//			File file = new File(System.getProperty("user.dir")+""+".png");
//			FileUtils.copyFile(source, file);
//			return System.getProperty("user.dir")+""+".png";
//		}
//		
//	 
	 
//	 
//	 private void captureScreenshot(String testName) {
//	        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(25/1/2023));
//	        //String screenshotName = testName + "_" + timestamp + ".png";
//	        File destinationFile = new File("C:\\Users\\Sanket Raut\\OneDrive\\Pictures\\Screenshots\\image.png");
//
//	        try {
//	            FileUtils.copyFile(screenshotFile, destinationFile);
//	            System.out.println("Screenshot saved: " + destinationFile.getAbsolutePath());
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	        
//	        
//	    }
	 
	 
	 @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test failed: " + result.getName());
	        System.out.println("Test failed: " + result.getMethod());
	       // getScreenshot(result.getName());
	 }
	 
	 

}

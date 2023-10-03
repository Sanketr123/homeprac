import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		Thread.sleep(1000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);

		driver.switchTo().alert().accept();

	}

}

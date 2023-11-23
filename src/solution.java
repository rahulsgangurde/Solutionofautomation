import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class solution {

	
		public static void main(String[] args) throws InterruptedException {
			
			String input = "[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"}, " +
		               "{\"name\": \"George\", \"age\" : 42, \"gender\": \"male\"}, " +
		               "{\"name\": \"Sara\", \"age\" : 42, \"gender\": \"female\"}, " +
		               "{\"name\": \"Conor\", \"age\" : 40, \"gender\": \"male\"}, " +
		               "{\"name\": \"Jennifer\", \"age\" : 42, \"gender\": \"female\"}]";
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chrome driver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
			driver.findElement(By.cssSelector("div[class ='centered'] details")).click();
			driver.findElement(By.id("jsondata")).clear();
			
			driver.findElement(By.id("jsondata")).sendKeys(input);
			Thread.sleep(2000);
			driver.findElement(By.id("refreshtable")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"jsondata\"]")).getAttribute("value");

			
				
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"jsondata\"]")).getAttribute("value"), input);
		

	}

}



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=br");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click();//erro
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();	
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}

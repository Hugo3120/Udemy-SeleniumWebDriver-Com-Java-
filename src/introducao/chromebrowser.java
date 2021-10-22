package introducao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");// url in the browser (url no navegador)
		//driver.findElement(By.className("inputtext")).sendKeys("Hello World");
		//driver.findElement(By.id("email")).sendKeys("hugoleo3129@gmail.com");											
		//driver.findElement(By.name("pass")).sendKeys("1234567");
		//driver.findElement(By.linkText("Esqueceu a senha?")).click();
		//driver.get("http://google.com"); // hit url on the browser
		driver.findElement(By.cssSelector("#email")).sendKeys("hugoleo3129");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("121212");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
		
	}

}

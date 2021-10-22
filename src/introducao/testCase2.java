package introducao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		


				// Create Drive Object for FireFox Browser
				// we will strictly implement methods of WebDriver
				 
				/*Class name= chromeDriver,

						 x driver= new x();*/
				// invoke .exe file first
				System.setProperty("webdriver.gecko.driver","C:\\Workspace\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("http://google.com");
				System.out.println(driver.getTitle());
			
				
				

			}

		}


	



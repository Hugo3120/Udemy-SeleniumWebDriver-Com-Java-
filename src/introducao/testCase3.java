package introducao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {

	public static void main(String[] args) {
		
		//selenium code-

				// Create Drive Object for Internet Explorer Browser
				// we will strictly implement methods of WebDriver
				 
				/*Class name= chromeDriver,

						 x driver= new x();*/
				// invoke .exe file first
				System.setProperty("webdriver.ie.driver","C:\\Workspace\\IEDriverServer.exe");
				WebDriver driver= new InternetExplorerDriver();
				driver.get("http://google.com");
				System.out.println(driver.getTitle());
			
				
				

			}

		}


	



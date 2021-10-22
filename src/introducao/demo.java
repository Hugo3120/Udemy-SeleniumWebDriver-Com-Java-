package introducao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {


		// Create Drive Object for Chrome Browser
		// we will strictly implement methods of WebDriver
		 
		/*Class name= chromeDriver,

				 x driver= new x();*/
		// invoke .exe file first
		System.setProperty("webdriver.chrome.driver","C:\\Workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		//driver.get("http://google.com"); // hit url on the browser
										// acesse url no navegador

		//System.out.println(driver.getTitle());//validated if your page title is corret
											//validado se o t�tulo da sua p�gina est� correto
		
		//System.out.println(driver.getCurrentUrl());// validated if you are landed on corrent url
											//validado se voc� for direcionado para o url correto

		
		//System.out.println(driver.getPageSource()); // print page source
												   // fonte da p�gina de impress�o
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();// It closes current browser (Fecha o navegador atual)
		//driver.quit(); // It closes all the browser opened by selenium script
					  // Ele fecha todos os navegadores abertos pelo script selenium
	}
}

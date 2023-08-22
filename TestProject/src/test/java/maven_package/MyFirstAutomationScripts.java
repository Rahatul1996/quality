package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyFirstAutomationScripts {
	
	@Test
	public void myfirsttest() { 
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get = ("https://nexttechitc.com/"); 
				driver.manage().window().maximize();
				driver.findElement(By.linkText(("Courses").click();
				Thread.sleep(5000); 
				driver.close();
				
				List n = new Arraylist():
				

		
		
		
		
	}

}

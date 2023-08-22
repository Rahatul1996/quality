package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Mouse_Hover {
	
	@Test
	public void hover() {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	}
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver = new ChromeDriver();
	driver.get("https://www.dell.com/en-us"); 
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	DRIVER.MANAGE().TIMEOUTS().implicitlWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	Actions ac= new Actions(driver);
	Thread.sleep(5000);
	ac.movetoElement(driver.findElement(By.linkText("Support Services")).click(); 
	
	
	driver.close();


	}
	
			

			
			
}

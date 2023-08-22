package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumPractice2 {
	WebDriver driver; 
	@Test
	public void nexttech() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://demoblaze.com/"); 
				driver.manage().window().maximize();
				driver.findElement(By.id("signin2")).click();
				Thread.sleep(3000); 
				driver.findElement(By.id("sign-username")).sendKeys("qualitytake"); 
				Thread.sleep(3000); 
				driver.findElement(By.id("sign-username")).sendKeys("qualitytake"); 
				driver.findElement(By.id("sign-password")).sendKeys("qul12345"); 
				driver.findElement(By.xpath("//button[text()='sign up'}")).click();//
				Thread.sleep(5000); 
				driver.quit();
				
	}
}














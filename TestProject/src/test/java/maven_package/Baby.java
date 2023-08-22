package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Baby {

	@Test
	public void verifyBabyPage() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/"); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select s1 = new Select(tom);
		
		Thread.sleep(5000);
		driver.close();
		
		WebElement baby = driver.findElement(By.id("gh-cat"));
		Select s1 = new Select(baby);
		s1.selectByVisibleText("Baby");
		
		driver.findElement(By.id("gh-btn")).click();
		
		boolean babypage = driver.findElement(By.xpath("//span[text()='Baby Essentials']")).isDisplayed();
	    Assert.assertTrue(babypage);
		
		Thread.sleep(3000);
		driver.close(); 
	
	
	
	
	
	
}

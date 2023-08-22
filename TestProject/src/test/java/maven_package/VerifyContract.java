package maven_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class VerifyContract {

	@Test
	public void top() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nexttechitc.com/"); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		boolean a = driver.findElement(By.xpath("//h1[@class='emialcardText']")).isDisplayed();
		Assert.assertTrue(b);
		
		System.out.println("Phone number display");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h1[text()='+1 (682) 283 3319')).isDisplayed();
		Assert.assertTrue(b);
		driver.close(); 

}
	
	

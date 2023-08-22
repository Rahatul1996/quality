package maven_package;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Contrac_demo {
	
	@Test
	public void VerifyMessageSend() {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	}
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver = new ChromeDriver();
	driver.get("https://nexttechitc.com"); 
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	DRIVER.MANAGE().TIMEOUTS().implicitlWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20)); 
	Wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("contact"))));
	
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/ul/li[6]/a"))));
	Thread.Sleep(3000);
	driver.findElement(By.id("floating_email")).sendKeys ("John Tom");
	Thread.Sleep(3000);
	driver.findElement(By.name("email")).sendkeys("jahanmohammad.a@gmail.com");
	Thread.Sleep(3000);
	driver.findElement(By.id("floating_phone")).sendKeys("4699372416");
	Thread.Sleep(3000);
	driver.findElement(By.name("address")).sendKeys("26 USA Ave");
	Thread.Sleep(3000);
	driver.findElement(By.xpath("//button{text()='Send Message'")).click();
	Thread.Sleep(3000);
	driver.switchTo().alert().accept(); 
	driver.close();
	
	}






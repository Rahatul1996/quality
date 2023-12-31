package maven_package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Window_Handle {

	@Test
	public void windowhandle() { 
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bankofamerica.com/"); 
	driver.manage().window().maximize();

	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[4]/a/span[3]")).click)();"
	driver.findElement(By.id("findAHome")).click();
	driver.findElement(By.name("home_37")).click();
	
	Set<String> handle = driver.getWindowHandles();//This is coming from java
	Iterator<String> ite = handle.iterator();//This is coming from java
	String firstwindow = ite.next();
	String secondwindow = ite.next(); 
	
	driver.switchTo().window(secondwindow);
	Thread.sleep(5000);
	System.out.println("I am in second window");
	
	driver.switchTo().window(firstwindow);
	Thread.sleep(5000);

	driver.quit();
	
	}
	
	}

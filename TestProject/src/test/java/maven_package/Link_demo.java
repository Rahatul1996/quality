package maven_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Link_demo {

	@Test
	public void links() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.ebay.com"); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		List<WebElement>listoflink = driver.findElements(By.tagName("a"));
		int a = listoflink.size();
		System.out.println(a);
		
		
		for(int i = 0; i<listoflink.size(); i ++) {
			System.out.println(listoflink.get(i).getAttribute("href"));
			
		
		}
		
		driver.close();
	
}

}

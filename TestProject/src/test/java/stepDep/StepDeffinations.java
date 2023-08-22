package stepDep;

import org.openqa.selenium.By;

public class StepDeffinations {

	@Given("^Open application$")
	public void open_application() throws Throwable {
		
	}
	@Then("^Click signup link$")
	public void click_signup_link() throws Throwable {
		driver.findElement(By.id("signin2")).click();
	}
	@Then("^Enter Username$")
	public void enter_Username() throws Throwable {
		driver.findElement(By.id("sign-username")).sendkeys("irvingTX");
	}
	@Then("^Enter Password$")
	public void enter_Username() throws Throwable {
		driver.findElement(By.id("sign-password")).sendkeys("Dallas12345");

	}
	@Then("^click signup button$")
	public void click_signup_button() throws throwable {
		driver.findElement(By.Xpath("//button{text()='sign up']")).click();
		
		driver.close();
	}
}

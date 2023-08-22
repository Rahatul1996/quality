package QUALITY_PAGE_LOCATORS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QUALITY_UTILITY.Quality_Base;

public class Quality_HomePageLocator extends Quality_Base {

	
	public Quality_HomePageLocator() {
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	@FindBy(id = "um-si-label"}
	public WebElement SignInLink; 
}
@FindBy(xpath = "//a{text()=' Sign In '}'}")
public WebElement CreateAccount; 
@FindBy(id = "um-si-label")
public WebElement SignInLink; 
@FindBy(id = "um-si-label")
public WebElement SignInLink; 
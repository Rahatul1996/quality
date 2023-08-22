package QUALITY_PAGE_LOCATORS;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QUALITY_UTILITY.Quality_Base;

 
public class Quality_SigninPageLocator extends Quality_Base{ 
	
	
	public Quality_SigninPageLocator() {
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	@FindBy(name = "SignInModel.EmailAddress")
	public WebElement Username; 
	
}
@FindBy(id = "SignInModel.EmailAddress")
public WebElement Password; 
	
}
@FindBy(id =  = "btnSignIn")
public WebElement SignInButton2; 
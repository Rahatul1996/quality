package QUALITY_PAGE_ACTIONS;

import org.openqa.selenium.interactions.Actions;

import QUALITY_PAGE_LOCATORS.Quality_HomePageLocator;
import QUALITY_UTILITY.Quality_Base;


public class Quality_HomePageActions extends Quality_Base {
	
	Quality_HomePageLocator quality_HomePageLocator= new Quality_HomePageLocator();
	
	public void MousehoverSigninLink() {
		Actions ac = new Actions(driver); 
		ac.moveToElement(quality_HomePageLocator.SignInLink).build().perform();
		
	}
	public void Clicksigninbutton() {
		quality_HomePageLocator.Clicksigninbutton.click();
	}

	
}

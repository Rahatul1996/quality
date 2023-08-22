package QUALITY_PAGE_ACTIONS;

import QUALITY_PAGE_LOCATORS.Quality_SigninPageLocator;
import QUALITY_UTILITY.Quality_Base;

public class Quality_SigninPageActions extends Quality_Base{
	Quality_SigninPageLocator quality_SigninPageLocator= new Quality_SigninPageLocator();

	
	public void Enteremailpasswordclicksigninbutton2() {
		quality_SigninPageLocator.Username.sendKeys("thomas@test.com");
		quality_SigninPageLocator.Password.sendKeys("Thomas12345");
		quality_SigninPageLocator.SigninButton2.click();

		
	}

	
}

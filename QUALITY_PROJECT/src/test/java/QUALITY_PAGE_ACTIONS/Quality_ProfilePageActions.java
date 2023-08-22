package QUALITY_PAGE_ACTIONS;

import org.testng.Assert;

import QUALITY_UTILITY.Quality_Base;

public class Quality_ProfilePageActions extends Quality_Base{
	Quality_ProfilePageActions quality_ProfilePageActions = new Quality_ProfilePageActions();
	
	
	
	
	public void Verifyusercansigninsuccessfully() {
		
		boolean verifyprofile= quality_ProfilePageLocator.ProfileVerification.isDisplayed():
			Assert.assertTrue(verifyprofile);
	}


}

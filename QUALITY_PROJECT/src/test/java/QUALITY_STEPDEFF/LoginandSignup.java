package QUALITY_STEPDEFF;

import QUALITY_PAGE_ACTIONS.Quality_CreateAccountPageActions;
import QUALITY_PAGE_ACTIONS.Quality_HomePageActions;
import QUALITY_UTILITY.Quality_Base;
import cucumber.api.java.en.Given;

public class LoginandSignup extends Quality_Base {
Quality_HomePageActions quality_HomePageActions = new Quality_HomePageActions(): 
	Quality_SigninPageActions quality_SigninPageActions = new SigninPageActions();
	@Given("^Open   \"([^\"]*)\" Application$")
public void open_Application(String URL) throws Throwable {
	QualityLuanchingURL(URL);
}

@Then("^Mousehover Signin link$")
public void mousehover_Signin_link() throws Throwable {
quality_HomePageActions.MousehoverSigninLink();
}

@Then("^Click Signin button$")
public void click_signin_button() throws Throwable { 

	
}


Scenario: Verify user can signin           # C:/Users/alamr/eclipse-workspace/QUALITY_PROJECT/src/test/resources/QUALITY_FEATURES/LoginandSignup.feature:8
  Given Open "<URL>" Application
  Then Mousehover Signin Link
  Then Click Signin Button
  Then Enter email password
  Then click signin button2
  Then Verify User can signin successfully

1 Scenarios (1 undefined)
6 Steps (6 undefined)
0m0.000s


You can implement missing steps with the snippets below:

@Given("^Open \"([^\"]*)\" Application$")
public void open_Application(String arg1) throws Throwable {
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException();
}

@Then("^Mousehover Signin Link$")
public void mousehover_Signin_Link() throws Throwable {
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException();
}

@Then("^Click Signin Button$")
public void click_Signin_Button() throws Throwable {
  // Write code here that turns the phrase above into concrete actions
  throw new PendingException();
}

@Then("^Enter email password click signin button2$")
public void enter_email_password_click_Signin_button2() throws Throwable {
  
}


@Then("^Verify User can signin successfully$")
public void verify_User_can_signin_successfully() throws Throwable {
 
}


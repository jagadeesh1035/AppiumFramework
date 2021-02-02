package tests;

import org.testng.annotations.Test;

import pages.SignUpScreen;
import utils.supportlibraries.BaseTest;

public class SignUpTest extends BaseTest {

	SignUpScreen signUp;

	@Test(enabled= false, description="Perform Business SignUp action")
	public void BusinessSignUptestCase() {
		signUp = new SignUpScreen(scriptHelper);
		signUp.BusinessSignUp("9730766246", "2");
		// SignIn.StepsForSignIn("9730766246");
	}

	@Test(description="Perform Personal SignUp action")
	public void PersonalSignUptestCase() {
		signUp = new SignUpScreen(scriptHelper);
		signUp.PersonalSignUp("9730766246", "2");
	}
	
	

}

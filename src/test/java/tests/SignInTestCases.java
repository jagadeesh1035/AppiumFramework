package tests;

import org.testng.annotations.Test;

import pages.SignInScreen;
import utils.supportlibraries.BaseTest;

public class SignInTestCases extends BaseTest {
	SignInScreen signIn;

	@Test(description = "Perform Business Sign In Functionality")
	public void BusinessSignIntestCase() {
		signIn = new SignInScreen(scriptHelper);
		signIn.BusinessSignIn();
	}
	
	@Test(description = "Perform Business Sign In Functionality")
	public void BusinessSignIntestCaseNegative() {
		signIn = new SignInScreen(scriptHelper);
		signIn.BusinessSignIn();
	}

	@Test(description = "Perform Personal SignIn Functionality")
	public void PersonalSignIntestCase() {
		signIn = new SignInScreen(scriptHelper);
		signIn.PersonalSignIn("9730766246");
	}

}

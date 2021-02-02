package pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileBy;
import utils.supportlibraries.BasePage;
import utils.supportlibraries.ScriptHelper;
import utils.supportlibraries.Util;

public class SignInScreen extends BasePage {
	public SignInScreen(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	By signIn = MobileBy.AccessibilityId("login_link_accessibilityLabel");

	By fieldUserID = MobileBy.xpath("//android.widget.EditText[@content-desc=\"undefined_accessibilityLabel\"]");

	By btnContinue = MobileBy.xpath(
			"//android.widget.Button[@content-desc=\"undefined_accessibilityLabel\"]/android.view.ViewGroup/android.widget.TextView");

	By errorMsgForIncorrectUserID = MobileBy.AccessibilityId("undefined_error_accessibilityLabel");

	By btnSignUP = MobileBy.xpath("//android.view.View[@text=\"Sign Up\"]");

	By signInPersonalTab = MobileBy.AccessibilityId("undefined_buttonRenders_Personal_accessibilityLabel");

	By fieldEnterPassowrd = MobileBy.xpath(
			"//android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText[@text=\"Enter your password\"]");

	public void StepsForSignIn() {

		waitUntilElementIsVisible(fieldUserID);
		inputText(fieldUserID, dataTable.getData("SignIn", "userId"), "Enter 'UserId' value");
		waitUntilElementIsVisible(btnContinue);
		click(btnContinue, "Click 'Continue' button");

		/*
		 * setUp.wait.until(ExpectedConditions.visibilityOf(fieldUserID));
		 * fieldUserID.sendKeys(UserID);
		 * setUp.wait.until(ExpectedConditions.visibilityOf(btnContinue));
		 * btnContinue.click();
		 */
	}

	public void BusinessSignIn() {
		waitUntilElementIsVisible(signIn);
		click(signIn, "Click on 'SignIn' b utton");
		StepsForSignIn();
		sleep(3000);

//		setUp.wait.until(ExpectedConditions.visibilityOf(SignIn));
//		SignIn.click();

	}

	public void PersonalSignIn(String UserID) {
		waitUntilElementIsVisible(signIn);
		click(signIn, "Click on 'SignIn' button");
		waitUntilElementIsVisible(signInPersonalTab);
		updateLogStatus(Status.PASS, "Able to see Personal Tab", Util.getScreenShot(driver));
		click(signInPersonalTab, "Click on 'Personal' tab");
		StepsForSignIn();
		sleep(3000);
		/*
		 * setUp.wait.until(ExpectedConditions.visibilityOf(SignIn)); SignIn.click();
		 * SignInPersonalTab.click();
		 */

	}

}

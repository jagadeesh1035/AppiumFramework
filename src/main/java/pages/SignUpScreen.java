package pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import utils.supportlibraries.BasePage;
import utils.supportlibraries.ScriptHelper;

public class SignUpScreen extends BasePage {
	
	public SignUpScreen(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	By btnSignUP = MobileBy.AccessibilityId("register_link_accessibilityLabel");
	
	By clickonPersonalTab = MobileBy.AccessibilityId("undefined_buttonRenders_Personal_accessibilityLabel");
	
	By fieldMobNumOrEmail = MobileBy.AccessibilityId("Sign_Up_Mobile_Number_Or_Email_Id_accessibilityLabel");
	
	By checkboxRecieveMsgWhatsApp = MobileBy.AccessibilityId("Sign_Up_Receive_Important_Over_WhatsAppReceive_important_information_and_updates_from_Bharat_Petroleum_over_WhatsApp_accessibilityLabel");
	
	By whatsAppNumEditIcon = MobileBy.AccessibilityId("Sign_Up_commMobile_accessibilityLabel");
	
	By fieldEditWhatsAppNum = MobileBy.AccessibilityId("Sign_Up_whatsApp_Number_accessibilityLabel");
	
	By checkboxAcceptTermofService = MobileBy.AccessibilityId("Sign_Up_isAcceptTermofServiceCheckBox_accessibilityLabel");
	
	By btnContinue = MobileBy.AccessibilityId("Sign_Up_Continue_accessibilityLabel");
	
	By btnSignIn = MobileBy.AccessibilityId("Sign_Up_Already_Have_Account");
	
	By errorMsgForInvalidMobOrEmail = MobileBy.AccessibilityId("Sign_Up_Mobile_Number_Or_Email_Id_error_accessibilityLabel");
	
	By errorMsgForInvalidWhatsAppNum = MobileBy.AccessibilityId("Sign_Up_whatsApp_Number_error_accessibilityLabel");
	
	By btnContinueToRegistartion = MobileBy.AccessibilityId("undefined_Congratulations_Popup_Title_CONTINUE_TO_REGISTRATION_accessibilityLabel");
	
	
	OTPscreen otp = new OTPscreen(scriptHelper);
	
	//Common steps used for signUp process
	public void stepsForSignUP(String mobNumber,String OTP)
	{
		waitUntilElementIsVisible(fieldMobNumOrEmail);
		inputText(fieldMobNumOrEmail, mobNumber, "Enter Mobile Number");
		click(checkboxAcceptTermofService, "Click on Accept Terms of Service checkbox");
		click(btnContinue, "Click on Continue button");
		otp.enterOTP(OTP);
	}
	
	//Below function is for Smartfleet(Business) signUP
	public void BusinessSignUp(String mobNumber,String OTP)
	{
		waitUntilElementIsVisible(btnSignUP);
		click(btnSignUP);
		stepsForSignUP(mobNumber,OTP);
		waitUntilElementIsVisible(btnContinueToRegistartion);
		click(btnContinueToRegistartion, "Click on Continue To Registration button");
	}
	
	//Below function is for Smartdriver(personal) signUP
	public void PersonalSignUp(String mobNumber,String OTP)
	{
		waitUntilElementIsVisible(btnSignUP);
		click(btnSignUP, "Click on Sign Up Button");
		waitUntilElementIsVisible(clickonPersonalTab);
		click(clickonPersonalTab, "Click on PersonalTab Button");
		click(fieldMobNumOrEmail, "Click on MobNumOrEmail Button");
		stepsForSignUP(mobNumber,OTP);	
			
	}

}

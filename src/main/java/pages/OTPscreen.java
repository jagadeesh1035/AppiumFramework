package pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import utils.supportlibraries.BasePage;
import utils.supportlibraries.ScriptHelper;

public class OTPscreen extends BasePage {

	public OTPscreen(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	By otpField1 = MobileBy.AccessibilityId("undefined_Otp_from_0_0_accessibilityLabel");

	By otpField2 = MobileBy.AccessibilityId("undefined_Otp_from_0_1_accessibilityLabel");

	By otpField3 = MobileBy.AccessibilityId("undefined_Otp_from_0_2_accessibilityLabel");

	By otpField4 = MobileBy.AccessibilityId("undefined_Otp_from_0_3_accessibilityLabel");

	By otpField5 = MobileBy.AccessibilityId("undefined_Otp_from_0_4_accessibilityLabel");

	By otpField6 = MobileBy.AccessibilityId("undefined_Otp_from_0_5_accessibilityLabel");

	By clickOnScreenToHideKeypad = MobileBy.AccessibilityId("undefined_Otp_from_Didnt_Receive_OTP_accessibilityLabel");
	By errorMsgForIncorrectOTP = MobileBy.AccessibilityId("undefined_Otp_from_OTPForm_VERIFY_accessibilityLabel");
	By btnOTPverify = MobileBy.AccessibilityId("undefined_Otp_from_OTPForm_VERIFY_accessibilityLabel");

	public void enterOTP(String OTP) {
		waitUntilElementIsVisible(otpField1);
		inputText(otpField1, OTP);
		inputText(otpField2, OTP);
		inputText(otpField3, OTP);
		inputText(otpField4, OTP);
		inputText(otpField5, OTP);
		inputText(otpField6, OTP);
		click(clickOnScreenToHideKeypad, "Hide keypad");
		click(btnOTPverify, "Click on OTP verify");
	}

}

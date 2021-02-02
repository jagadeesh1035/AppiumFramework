package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.supportlibraries.BasePage;
import utils.supportlibraries.ScriptHelper;

public class SmardriveRegistrationScreen extends BasePage {

	public SmardriveRegistrationScreen(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	@AndroidFindBy(accessibility = "SmartDriveEnrolmentForm_Name_Label_accessibilityLabel")
	MobileElement fieldName;

	@AndroidFindBy(accessibility = "SmartDriveEnrolmentForm_Mobile_Number_Label_accessibilityLabel")
	MobileElement fieldMobNum;

	@AndroidFindBy(accessibility = "SmartDriveEnrolmentForm_Pincode_Label_accessibilityLabe")
	MobileElement fieldPinCode;

	@AndroidFindBy(accessibility = "SmartDriveEnrolmentForm_City_Label_accessibilityLabel")
	MobileElement fieldDistrict;

	@AndroidFindBy(accessibility = "SmartDriveEnrolmentForm_State_Label_accessibilityLabel")
	MobileElement fieldCity;

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"undefined_MaleMale_accessibilityLabel\"]/android.widget.TextView")
	MobileElement radioBtnGenderMale;

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"undefined_FemaleFemale_accessibilityLabel\"]/android.widget.TextView")
	MobileElement radioBtnGenderFemale;

	@AndroidFindBy(accessibility = "undefined_OtherOther_accessibilityLabel")
	MobileElement radioBtnGenderOther;

	@AndroidFindBy(accessibility = "SmartDriveEnrolmentForm_isAcceptTermAndConditionCheckBox_accessibilityLabel")
	MobileElement checkboxAcceptTermsAndConditions;

	@AndroidFindBy(accessibility = "SmartDriveEnrolmentForm_SUBMIT_accessibilityLabel")
	MobileElement btnSubmit;
}

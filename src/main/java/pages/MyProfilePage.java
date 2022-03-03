package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalKeys;
import utilities.GlobalVariables;

public class MyProfilePage extends TestBase {

	protected MyProfilePage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_my_account')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My Profile']")
	private MobileElement txtMyProfile;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_sign_out')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SIGN OUT']")
	private MobileElement btnSignOut;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='YES']")
	private MobileElement btnSignOutPopUpYES;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='NO']")
	private MobileElement btnSignOutPopUpNO;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/cv_update_password')]")
	@iOSXCUITFindBy(accessibility = "Update Password")
	private MobileElement btnUpdatePassword;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/cv_email_address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Email Address']")
	private MobileElement btnEmailAddress;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/cv_personal_information')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Profile Details']")
	private MobileElement btnProfileDetails;
	

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/section_become_member')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Become a Treat Member,')]")
	private MobileElement btnbecomeATreatMember;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'MEMBER')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='MEMBER']")
	private MobileElement labelMember;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/cv_subscription_details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Membership Details']")
	private MobileElement btnMembershipDetails;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Treat Membership')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Treat Membership']")
	private MobileElement txtSectionTreatMembership;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/cv_billing_details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Billing History']")
	private MobileElement btnBillingHistory;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/cv_payment_methods')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Payment Methods']")
	private MobileElement btnPaymentMethods;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/cv_my_children')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='My Children']")
	private MobileElement btnMyChildren;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_become_member_desc')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Become a Treat Member,')]")
	private MobileElement eleBenefitTextBecomeATreatMember;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_add_pic')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='userImagePlaceholder']")
	private MobileElement imgProfileInMyProfile;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_account_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='userImagePlaceholder']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtUserNameInMyProfile;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_account_email')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='userImagePlaceholder']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement txtUserEmailAddressInMyProfile;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_account_phone')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='userImagePlaceholder']//following-sibling::XCUIElementTypeStaticText[3]")
	private MobileElement txtUserPhoneNumberInMyProfile;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='userImagePlaceholder']//following-sibling::XCUIElementTypeStaticText[3]")
	private MobileElement IOS_txtUserEmailAddressInMyProfile;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='userImagePlaceholder']//following-sibling::XCUIElementTypeStaticText[4]")
	private MobileElement IOS_txtUserPhoneNumberInMyProfile;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/cv_manage_data')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Manage Your Data']")
	private MobileElement btnManageYourData;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_request_to_delete')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Request to Delete']")
	private MobileElement btnRequestToDelete;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='YES']")
	private MobileElement btnRequestToDelete_Yes;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='NO']")
	private MobileElement btnRequestToDelete_No;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/cv_appointment_history')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Appointment History']")
	private MobileElement btnAppointmentHistory;


	public PaymentMethodsPage clickOnPaymentMethodsButton() {
		
		try {
			SwipeUp();
			
			clickOn(btnPaymentMethods, "Payment Methods  Button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		
		return new PaymentMethodsPage(driver,data);
	}
	
	
	

	public MembershipPlansPage clickOnBecomeATreatMemberButton() {

		try {
			clickOn(btnbecomeATreatMember, "Become A Treat member button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MembershipPlansPage(driver, data);
	}

	public MembershipDetailsPage clickOnMembershipDetailsButton() {
		try {
			clickOn(btnMembershipDetails, "Membership Details Button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MembershipDetailsPage(driver, data);

	}
	
	public MyChildrenPage clickOnMyChildrenButton() {
		try {
			
			
			
			clickOn(btnMyChildren, " My Children Button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MyChildrenPage(driver, data);

	}
	
	
	public void clickOnManageYourData() {
		try {
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				scrollToViewElementWithText("Manage Your Data");
				
			}else {
			SwipeUp();
			}
			clickOn(btnManageYourData, "Manage Your Data");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		

	}
	
	
	
	public LandingPage ClickOnRequestToDelete() {
		
		try {
			waitForElement(btnRequestToDelete);
			
			clickOn(btnRequestToDelete, "Request To Delete  button");
			
			waitForElement(btnRequestToDelete_Yes);
			
			clickOn(btnRequestToDelete_Yes, "Request To delete Yes ");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		return new LandingPage(driver, data);
		
	}
	
	public BillingHistoryPage clickOnBillingHistoryButton() {
		try {
			
			SwipeUp();
			
			clickOn(btnBillingHistory, " Billing History Button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new BillingHistoryPage(driver, data);

	}

	public void ValidateMemberLabelInMyprofilePage() {

		try {
			waitForElement(labelMember);

			if (isElementPresent(labelMember)) {

				passed("User successfully Validated Member Label in My Profile Page");
			} else {
				failed(driver, "User Failed to Validate Member Label in My Profile Page");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public LandingPage clickOnSignOutButton() {

		try {
			clickOn(btnSignOut, "Sign out Button");
			
			waitForElement(btnSignOutPopUpYES);
			
			if(isElementPresent(btnSignOutPopUpYES)) {
				clickOn(btnSignOutPopUpYES, "SignOut YES Button");
			}
			

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new LandingPage(driver, data);
	}

	public UpdatePasswordPage clickOnUpdatePasswordButton() {

		try {

			waitForElement(btnUpdatePassword);

			clickOn(btnUpdatePassword, " Update Password Button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new UpdatePasswordPage(driver, data);

	}
	
	public AppNavPage NavigateToAppNavPage() {
		
		return new AppNavPage(driver, data);
	}

	public EmailAddressPage clickOnEmailAddressButton() {

		try {
			waitForElement(btnEmailAddress);

			clickOn(btnEmailAddress, " Email Address Button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new EmailAddressPage(driver, data);

	}

	public ProfileDetailsPage clickOnProfileDetailsButton() {

		try {
			waitForElement(btnProfileDetails);

			clickOn(btnProfileDetails, " Profile Details Button");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new ProfileDetailsPage(driver, data);

	}
	
	
	public void validateUserDetailsInMyProfile() {
		
		try {
			waitForElement(imgProfileInMyProfile);
			
			if(isElementPresent(imgProfileInMyProfile)) {
				
				passed("Successfully validated Profile Image In My Profile");
				
			}
			else {
				
				failed(driver,"Failed To Validate Profile Image In My Profile");
			}
			
			
			waitForElement(txtUserNameInMyProfile);

			if (txtUserNameInMyProfile.getText().replaceAll("\\s+", "").equals(GlobalVariables.FirstName + GlobalVariables.LastName)) {

				passed("User Successfully Validated the User Name In  My profile Page As"
						+ txtUserNameInMyProfile.getText());
			} else {
				failed(driver, "Failed To Validate the User Name In   My profile  Page ");
			}
			
			waitForElement(txtUserEmailAddressInMyProfile);

			if (txtUserEmailAddressInMyProfile.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in My Profile Page  As"
						+ txtUserEmailAddressInMyProfile.getText());
			} else {
				failed(driver, "Failed To Validate the Email in My Profile  Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + txtUserEmailAddressInMyProfile.getText());
			}
			

			String UIPhoneNumber = txtUserPhoneNumberInMyProfile.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in My Profile  Page As"
						+ PhoneNumberInPatientDetails);

			} else {
				failed(driver, "Failed To Validate the Phone Number in My Profile  Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}
		
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
			
	}
	
	
public void validateUserDetailsInMyProfileForMemberIniOS() 	{	
		try {
			waitForElement(imgProfileInMyProfile);
			
			if(isElementPresent(imgProfileInMyProfile)) {
				
				passed("Successfully validated Profile Image In My Profile");
				
			}
			else {
				
				failed(driver,"Failed To Validate Profile Image In My Profile");
			}
			
			
			waitForElement(txtUserNameInMyProfile);

			if (txtUserNameInMyProfile.getText().replaceAll("\\s+", "").equals(GlobalVariables.FirstName + GlobalVariables.LastName)) {

				passed("User Successfully Validated the User Name In  My profile Page As"
						+ txtUserNameInMyProfile.getText());
			} else {
				failed(driver, "Failed To Validate the User Name In   My profile  Page ");
			}
			
			waitForElement(txtUserEmailAddressInMyProfile);

			if (IOS_txtUserEmailAddressInMyProfile.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in My Profile Page  As"
						+ txtUserEmailAddressInMyProfile.getText());
			} else {
				failed(driver, "Failed To Validate the Email in My Profile  Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + IOS_txtUserEmailAddressInMyProfile.getText());
			}
			

			String UIPhoneNumber = IOS_txtUserPhoneNumberInMyProfile.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in My Profile  Page As"
						+ PhoneNumberInPatientDetails);

			} else {
				failed(driver, "Failed To Validate the Phone Number in My Profile  Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}
		
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
			
	}
	
	
	
	


	
	
	public void validateDetailsInMyProfileForMember() {
		try {
			
			ValidateMemberLabelInMyprofilePage();
			
			waitForElement(txtSectionTreatMembership);

			if (isElementPresent(txtSectionTreatMembership)) {

				passed("Successfully validated Treat Membership Section  In My profile For  Member User");

			} else {
				failed(driver, "Failed To ValidateTreat Membership Section In My profile For  Member User");
			}

			
			waitForElement(btnMembershipDetails);
			
			if(isElementPresent(btnMembershipDetails)) {
				
				passed("Successfully validated  Membership Details    In My profile For  Member User");

			} else {
				failed(driver, "Failed To Validate Membership Details In My profile For  Member User");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	
	

	
	
	

	
	public void ValidateDetailsInMyProfileForNonMemberUser() {

		try {
			waitForElement(btnbecomeATreatMember);

			if (isElementPresent(btnbecomeATreatMember)) {

				passed("Successfully validated Become A Treat Member Button In My profile For Non Member User");

			} else {
				failed(driver, "Failed To Validate Become A Treat Member Button In My profile For Non Member User");
			}

			waitForElement(eleBenefitTextBecomeATreatMember);

			String UIBecomeTreatMemberBenefitText;

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				UIBecomeTreatMemberBenefitText = eleBenefitTextBecomeATreatMember.getText().trim();

			}

			else {

				String iOS_UIBecomeTreatMemberBenefitText = eleBenefitTextBecomeATreatMember.getText().trim();

				String[] ArriOS_UIBecomeTreatMemberBenefitText = iOS_UIBecomeTreatMemberBenefitText.split(",");

				UIBecomeTreatMemberBenefitText = ArriOS_UIBecomeTreatMemberBenefitText[1].trim();

			}

			if (UIBecomeTreatMemberBenefitText.replaceAll("\\s+", "")
					.equals(UIBecomeTreatMemberBenefitText.replaceAll("\\s+", ""))) {
				passed("Successfully Validated the Membership Benefit Text inside Become Treat member Section In My Profile");
			} else {
				failed(driver,
						"Failed To Validate the Membership Benefit Text inside Become Treat member Section In My Profile ");
			}
			
			
			
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	
	
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_personal_info_header')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Personal Information']")
	private MobileElement eleSection1Name;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_personal_info_header')]//following::android.widget.TextView[contains(@resource-id,'id/tv_account_item')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Personal Information']//following-sibling::XCUIElementTypeButton")
	private List<MobileElement> lstItemsInSection1;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_payments_header')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payments']")
	private MobileElement eleSection2Name;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_payments_header')]//following::android.widget.TextView[contains(@resource-id,'id/tv_account_item')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Payments']//following-sibling::XCUIElementTypeButton")
	private List<MobileElement> lstItemsInSection2;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_preferences_header')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Preferences']")
	private MobileElement eleSection3Name; 
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_preferences_header')]//following::android.widget.TextView[contains(@resource-id,'id/tv_account_item')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Preferences']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleItemsInSection3;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_privacy_header')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Privacy and Sharing']")
	private MobileElement eleSection4Name; 
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_privacy_header')]//following::android.widget.TextView[contains(@resource-id,'id/tv_account_item')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Privacy and Sharing']//following-sibling::XCUIElementTypeStaticText")
	private List<MobileElement> lstItemsInSection4;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Contact Treat Support')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Contact Treat Support']")
	private MobileElement eleSection5Field; 
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,':id/peoplekit_autocomplete_chip_group')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Mail.ccBccMultiField']")
	private MobileElement eleTreatSupportMail; 
	
	
	
			

	public void ValidateAllTheSectionFieldsInMyProfile() {

		try {
			waitForElement(eleSection1Name);
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			HalfSwipeUp();
			}

			if (eleSection1Name.getText().trim().replaceAll("\\s+", "")
					.equals(Constants.Section1NameInMyProfile.replaceAll("\\s+", ""))) {

				passed("Successfully validated First Section name In My Profile  As" + eleSection1Name.getText());
			} else {
				failed(driver, "Failed To validate First Section name In My Profile  Expected "
						+ Constants.Section1NameInMyProfile + "But Actual is" + eleSection1Name.getText());
			}

			for (int i = 0; i <= Constants.Section1FieldsInMyProfile.length - 1; i++) {
				
				
				

				if (lstItemsInSection1.get(i).getText().trim().replaceAll("\\s+", "")
						.equals(Constants.Section1FieldsInMyProfile[i].replaceAll("\\s+", ""))) {

					passed("Successfully validated First Section " + (i + 1) + "Field  In My Profile  As "
							+ lstItemsInSection1.get(i).getText());
				} else {
					failed(driver,
							"Failed To validate First Section " + (i + 1) + "Field  In My Profile   Expected "
									+ Constants.Section1FieldsInMyProfile[i] + "But Actual is"
									+ lstItemsInSection1.get(i).getText());
				}

			}

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				SwipeUp();

			    SwipeUp(); 
				
				

			}else{
				IOS_SwipeUP();
			}
			

			waitForElement(eleSection2Name);

			if (eleSection2Name.getText().trim().replaceAll("\\s+", "")
					.equals(Constants.Section2NameInMyProfile.replaceAll("\\s+", ""))) {

				passed("Successfully validated Second Section name In My Profile  As" + eleSection2Name.getText());
			} else {
				failed(driver, "Failed To validate Second Section name In My Profile  Expected "
						+ Constants.Section2NameInMyProfile + "But Actual is" + eleSection1Name.getText());
			}

			for (int i = 0; i <=Constants.Section2FieldsInMyProfile.length - 1; i++) {

				if (lstItemsInSection2.get(i).getText().trim().replaceAll("\\s+", "")
						.equals(Constants.Section2FieldsInMyProfile[i].replaceAll("\\s+", ""))) {

					passed("Successfully validated Second Section " + (i + 1) + "Field  In My Profile  As "
							+ lstItemsInSection2.get(i).getText());
				} else {
					failed(driver,
							"Failed To validate Second Section " + (i + 1) + "Field  In My Profile   Expected "
									+ Constants.Section2FieldsInMyProfile[i] + "But Actual is"
									+ lstItemsInSection2.get(i).getText());
				}

			}

			waitForElement(eleSection3Name);

			if (eleSection3Name.getText().trim().replaceAll("\\s+", "")
					.equals(Constants.Section3NameInMyProfile.replaceAll("\\s+", ""))) {

				passed("Successfully validated 3rd Section name In My Profile  As" + eleSection3Name.getText());
			} else {
				failed(driver, "Failed To validate 3rd Section name In My Profile  Expected "
						+ Constants.Section3NameInMyProfile + "But Actual is" + eleSection3Name.getText());
			}

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (eleItemsInSection3.getText().trim().replaceAll("\\s+", "")
						.equals(Constants.Android_Section3FieldInMyProfile.replaceAll("\\s+", ""))) {

					passed("Successfully validated 3rd Section Field  In My Profile  As "
							+ eleItemsInSection3.getText());
				} else {
					failed(driver,
							"Failed To validate 3rd Section Field  In My Profile   Expected "
									+ Constants.Android_Section3FieldInMyProfile + "But Actual is"
									+ eleItemsInSection3.getText());
				}

			} else {
				if (eleItemsInSection3.getText().trim().replaceAll("\\s+", "")
						.equals(Constants.iOS_Section3FieldInMyProfile.replaceAll("\\s+", ""))) {

					passed("Successfully validated 3rd Section Field  In My Profile  As "
							+ eleItemsInSection3.getText());
				} else {
					failed(driver, "Failed To validate 3rd Section Field  In My Profile   Expected "
							+ Constants.iOS_Section3FieldInMyProfile + "But Actual is" + eleItemsInSection3.getText());
				}

			}
			
			

			waitForElement(eleSection4Name);

			if (eleSection4Name.getText().trim().replaceAll("\\s+", "")
					.equals(Constants.Section4NameInMyProfile.replaceAll("\\s+", ""))) {

				passed("Successfully validated 4th Section name In My Profile  As" + eleSection4Name.getText());
			} else {
				failed(driver, "Failed To validate 4th Section name In My Profile  Expected "
						+ Constants.Section4NameInMyProfile + "But Actual is" + eleSection4Name.getText());
			}
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
			
			for (int i = 0; i <=Constants.Section4FieldsInMyProfile.length- 1; i++) {

				if (lstItemsInSection4.get(i).getText().trim().replaceAll("\\s+", "")
						.equals(Constants.Section4FieldsInMyProfile[i].replaceAll("\\s+", ""))) {

					passed("Successfully validated 4th Section " + (i + 1) + "Field  In My Profile  As "
							+ lstItemsInSection4.get(i).getText());
				} else {
					failed(driver,
							"Failed To validate 4th Section " + (i + 1) + "Field  In My Profile   Expected "
									+ Constants.Section4FieldsInMyProfile[i] + "But Actual is"
									+ lstItemsInSection4.get(i).getText());
				}

			}
			}
			else {
				for (int i = 0; i <=Constants.iOS_Section4FieldsInMyProfile.length- 1; i++) {

					if (lstItemsInSection4.get(i).getText().trim().replaceAll("\\s+", "")
							.equals(Constants.iOS_Section4FieldsInMyProfile[i].replaceAll("\\s+", ""))) {

						passed("Successfully validated 4th Section " + (i + 1) + "Field  In My Profile  As "
								+ lstItemsInSection4.get(i).getText());
					} else {
						failed(driver,
								"Failed To validate 4th Section " + (i + 1) + "Field  In My Profile   Expected "
										+ Constants.iOS_Section4FieldsInMyProfile[i] + "But Actual is"
										+ lstItemsInSection4.get(i).getText());
					}

				}
			}

			waitForElement(eleSection5Field);

			if (eleSection5Field.getText().trim().replaceAll("\\s+", "")
					.equals(Constants.Section5FieldInMyProfile.replaceAll("\\s+", ""))) {

				passed("Successfully validated 5th Section Field In My Profile  As" + eleSection5Field.getText());
			} else {
				failed(driver, "Failed To validate 5th Section Field In My Profile  Expected "
						+ Constants.Section5FieldInMyProfile + "But Actual is" + eleSection5Field.getText());
			}

			SwipeDown();
			
			SwipeDown();
			
		} catch (Exception e) {
			
			failed(driver, "Exception caught " + e.getMessage());
		}


	}
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='treat']/android.widget.Image//following::android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='URL']")
	private MobileElement eleInPrivacyAndSharing;
	
	@AndroidFindBy(accessibility ="Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement NavBack;
	
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Mail.cancelSendButton']")
	private MobileElement btnCancel;
	
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Delete Draft']")
	private MobileElement btnDeleteDraft;
		
	
	
	public void ValidateNavigationToPrivacyAndSharingSectionScreensInMyProfile() {

		try {
			
if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
				SwipeUp();

				SwipeUp();

			}else{
				IOS_SwipeUP();
			}
	
			waitForElement(lstItemsInSection4.get(0));

			if (isElementPresent(lstItemsInSection4.get(0))) {

				clickOn(lstItemsInSection4.get(0), "Privacy and Sharing button");
			}

			waitForElement(eleInPrivacyAndSharing);

			if (isElementPresent(eleInPrivacyAndSharing)) {

				passed("Successfully Validated the Navigation To Privacy Policy Page");

			} else {
				failed(driver, "Failed To validate Navigation To Privacy Policy Page");
			}
			
			waitForElement(NavBack);

			if (isElementPresent(NavBack)) {

				clickOn(NavBack, "click On Back button");
			}

			waitForElement(lstItemsInSection4.get(1));

			if (isElementPresent(lstItemsInSection4.get(1))) {

				clickOn(lstItemsInSection4.get(1), "Terms Of Service button");
			}

			waitForElement(eleInPrivacyAndSharing);

			if (isElementPresent(eleInPrivacyAndSharing)) {

				passed("Successfully Validated the Navigation To Terms Of Use Page");

			} else {
				failed(driver, "Failed To validate Navigation To Terms Of Use Page");
			}
			
			waitForElement(NavBack);

			if (isElementPresent(NavBack)) {

				clickOn(NavBack, "click On Back button");
			}
			
			

		} catch (Exception e) {
		
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateNavigationToContactTreatSupportInMyProfile() {
		
		try {
			waitForElement(eleSection5Field);
			
			if (isElementPresent(eleSection5Field)) {

				clickOn(eleSection5Field, "Contact Treat Support");
			}

			waitForElement(eleTreatSupportMail);
			
			if(isElementPresent(eleTreatSupportMail)) {
				
				passed("Successfully Navigated To Treat Contact Support Compose Mail Page");
			}
			else {
				failed(driver,"Failed To Navigate To Treat Contact Support Compose Mail Page");
			}
			
			takeScreenshot(driver);
			
			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
				
			driver.navigate().back();
			driver.navigate().back();
			
			SwipeDown();
			
			SwipeDown();
			
			}else {
				waitForElement(btnCancel);
				
				if(isElementPresent(btnCancel)) {
					clickOn(btnCancel, "Cancel button");
				}
				
				waitForElement(btnDeleteDraft);
				
				if(isElementPresent(btnDeleteDraft)) {
					clickOn(btnDeleteDraft, "DeleteDraft button");
				}
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
	}
	
	
	
	
	
	
	
		
		
	
		
	
		
		
	
		
		
		
		
		
		
		
		
	
	

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(txtMyProfile);

			if (isElementPresent(txtMyProfile)) {

				passed("User Successfully Navigated To My profilePage");
			} else {
				failed(driver, "User Failed To navigate To the My profile Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}
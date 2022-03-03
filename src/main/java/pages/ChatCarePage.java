package pages;

import java.util.List;

import org.openqa.selenium.By;
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

public class ChatCarePage extends TestBase {

	protected ChatCarePage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_become_a_treat_member')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become a Treat Member']")
	private MobileElement btnBecomeTreatMember;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_become_a_treat_member')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become a Treat Member']//preceding-sibling::XCUIElementTypeStaticText")
	private MobileElement eleChatCareText;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/title_care_on_chat')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Chat Care']")
	private MobileElement eleChatcareTitle;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_main_icon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='careOnChatImage']")
	private MobileElement imgChatCareLogo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/description_care_on_chat')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Chat Care']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleChatcareDescriptionForMemberUSer;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/description_benefit_unavailable')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Become a Treat Member']//preceding-sibling::XCUIElementTypeStaticText")
	private MobileElement eleChatCareDescriptionForNonMember;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'id/text_input_end_icon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']")
	private MobileElement btnDropdownInChatCare;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,':id/button_proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
	private MobileElement btnProceed;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,':id/tv_cancel')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	private MobileElement btnCancel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement elePickerWheel;

	@AndroidFindBy(xpath = "//android.widget.Spinner[contains(@resource-id,'id/auto_complete_text_view')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Select an option')]")
	private MobileElement txtSelectConsultationFor;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_who_is_this_for')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Chat Care']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement eleConsulationQuestion;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/button_begin_consultation')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Begin Consultation']")
	private MobileElement btnBeginConsultation;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Patient Details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Patient Details']")
	private MobileElement elePatientDetails;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Name')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Patient Name')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Date of Birth')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Date of Birth')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientDOB;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Gender Identity')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Gender Identity')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientGenderIdentity;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Phone')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Phone')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientPhoneNumber;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Email')]//following-sibling:: XCUIElementTypeStaticText[1]")
	private MobileElement elePatientEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/welcome')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Welcome, Treat Member!')]")
	private MobileElement ele98point6WelcomeText;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/tour_skip')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SkipButton']")
	private MobileElement btnSkip;

	@AndroidFindBy(accessibility = "Exit 98point6")
	@iOSXCUITFindBy(accessibility = "Exit 98point6")
	private MobileElement ele98point6Exit;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Leave')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Leave']")
	private MobileElement btn98point6Exit_LEAVE;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Stay')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Stay']")
	private MobileElement btn98point6Exit_STAY;

	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement btnNavigateBack;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/login_phone_number')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='PhoneNumberField']")
	private MobileElement ele98point6PhoneNumberTextField;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/login_next_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SubmitButton']")
	private MobileElement ele98point6SubmitButton;

	public void ValidateChatCarePermissionsForNonMemberUser() {

		try {
			waitForElement(btnBecomeTreatMember);
			if (isElementPresent(btnBecomeTreatMember)) {
				passed("Successfully Validate the Become Atreat Member button  For Non Member User In ChatCare page PopUp");
			} else {
				failed(driver,
						"Failed To Validate the Become Atreat Member button  For Non Member User In ChatCare page PopUp");
			}

			waitForElement(eleChatCareDescriptionForNonMember);

			if (eleChatCareDescriptionForNonMember.getText().replaceAll("\\s+", "")
					.equals(Constants.nonSubChatCareIntro.replaceAll("\\s+", ""))) {

				passed("Successfully Validate the Chat Care Description For Non Member User In ChatCare page Popup");
			} else {
				failed(driver,
						"Failed To Validate the Chat Care Description For Non Member User In ChatCare page Popup");
			}

			waitForElement(btnCancel);
			if (isElementPresent(btnCancel)) {
				passed("Successfully Validate the Cancel button  For Non Member User  In ChatCare page Popup");
			} else {
				failed(driver, "Failed To Validate the Cancel button For Non Member User  In ChatCare page Popup");
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void clickOnCancelButtonInChatCare() {

		try {
			waitForElement(btnCancel);
			if (isElementPresent(btnCancel)) {
				passed("Successfully Validate the Cancel button  For Non Member User  In ChatCare page Popup");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}

	public void validateCancelButtonFunctionalityInChatCare() {

		try {
			if (!isElementPresent(btnBecomeTreatMember)) {
				passed("User successfully validated the cancel button Functionality In Chat care");
				takeScreenshot(driver);
			} else {
				failed(driver, "User Failed To Validate the cancel button Functionality In Chat care ");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public MembershipPlansPage clickOnBecomeATreatMemberButton() {

		try {
			waitForElement(btnBecomeTreatMember);

			clickOn(btnBecomeTreatMember, "Become A Treat Member In Chat Care");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new MembershipPlansPage(driver, data);
	}

	//

	public void ValidateChatCarePermissionsForMemberUser() {

		try {
			ValidateChatCareDetailsForMemberUser();

			SelectConsultationForSelf();

			ValidateChatCareLaunchForSelf();

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidateChatCarePermissionForDependent() {
		
		ValidateChatCareDetailsForMemberUser();
		
	    SelectConsultationForDependent();
		
	    ValidateChatCareLaunchForDependent();
	}

	
	
	public void ValidateChatCareDetailsForMemberUser() {

		try {
			waitForElement(imgChatCareLogo);

			if (isElementPresent(imgChatCareLogo)) {
				passed("Successfully Validate the Chat Care Logo  for Member User In ChatCare page.");
			} else {
				failed(driver, "Failed To Validate the Chat Care Logo  for  For  Member User In ChatCare page.");
			}

			waitForElement(eleChatcareTitle);

			if (isElementPresent(eleChatcareTitle)) {
				passed("Successfully Validate the Chat Care Title  for Member User In ChatCare page.");
			} else {
				failed(driver, "Failed To Validate the Chat Care Title  for  For  Member User In ChatCare page.");
			}

			waitForElement(eleConsulationQuestion);

			if (eleConsulationQuestion.getText().replaceAll("\\s+", "")
					.equals(Constants.chatCareConsultationQuestion.replaceAll("\\s+", ""))) {

				passed("Successfully Validate the Chat Care Consultation Question For  Member User In ChatCare page ");
			} else {
				failed(driver, "Failed To Validate the Chat Consultation Question For  Member User In ChatCare page ");
			}

			waitForElement(btnDropdownInChatCare);
			if (isElementPresent(btnDropdownInChatCare)) {
				passed("Successfully Validate the Select consulatation Dropdown  For Member User In ChatCare page");
			} else {
				failed(driver, "Failed To Validate the Select consulatation Dropdown  Member User In ChatCare page");
			}
			waitForElement(btnProceed);
			if (isElementPresent(btnProceed)) {
				passed("Successfully Validate the Proceed button  For Member User In ChatCare page");
			} else {
				failed(driver, "Failed To Validate the Proceed button For  Member User In ChatCare page");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void SelectConsultationForSelf() {

		try {
			waitForElement(btnDropdownInChatCare);

			clickOn(btnDropdownInChatCare, "Chat Care dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtSelectConsultationFor);

				enterText(txtSelectConsultationFor, "Select Consultation For Textbox",
						GlobalVariables.FirstName + " " + GlobalVariables.LastName);

				clickOn(btnDropdownInChatCare, "Chat Care dropdown");
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(GlobalVariables.FirstName + " " + GlobalVariables.LastName + " " + "(Self)");

				waitForElement(btnDone);

				clickOn(btnDone, "Done Button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public ChatCare_PatientDetails SelectChildToAddInChatCare() {
		try {
			waitForElement(btnDropdownInChatCare);

			clickOn(btnDropdownInChatCare, "Chat Care dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtSelectConsultationFor);
				
				TapByCoordinates(btnProceed.getLocation().getX()+300, btnProceed.getLocation().getY()+100,"Proceed button");
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(Constants.Child);

				waitForElement(btnDone);

				clickOn(btnDone, "Done Button");
			}
			
			waitForElement(btnProceed);
			
			clickOn(btnProceed, "Proceed Button");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		return new ChatCare_PatientDetails(driver,data);
		
		
	}
	
	public void SelectConsultationForDependent() {
		try {
			waitForElement(btnDropdownInChatCare);

			clickOn(btnDropdownInChatCare, "Chat Care dropdown");

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				waitForElement(txtSelectConsultationFor);
				
				
				TapByCoordinates(btnProceed.getLocation().getX()+300, btnProceed.getLocation().getY()+100,"Proceed button");
				//enterText(txtSelectConsultationFor, "Select Consultation For Textbox",
				//	GlobalVariables.ChildName);

				//clickOn(btnDropdownInChatCare, "Chat Care dropdown");
			} else {
				waitForElement(elePickerWheel);

				elePickerWheel.sendKeys(GlobalVariables.ChildName);

				waitForElement(btnDone);

				clickOn(btnDone, "Done Button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		
	}

	public void ValidatePatientDetailsForSelf() {

		try {
			waitForElement(elePatientName);

			if (elePatientName.getText().replaceAll("\\s+", "")
					.equals(GlobalVariables.FirstName + GlobalVariables.LastName)) {
				passed("Successfully Validated the  Name in Patient Details As" + elePatientName.getText());
			} else {
				failed(driver,
						"Failed To Validate the Name In Patient Details Page Expected As "
								+ (GlobalVariables.FirstName + GlobalVariables.LastName) + ",But Actual is"
								+ elePatientName.getText());
			}

			if (elePatientDOB.getText().equals(GlobalVariables.DOB)) {
				passed("Successfully Validated the  Date of Birth in Patient Details As" + elePatientDOB.getText());
			} else {
				failed(driver, "Failed To Validate the Date of Birth In Patient Details Page Expected As "
						+ (GlobalVariables.DOB) + ",But Actual is" + elePatientDOB.getText());
			}

			if (elePatientGenderIdentity.getText().equals(GlobalVariables.GenderIdentity)) {
				passed("Successfully Validated the  Gender Identity in Patient Details As"
						+ elePatientGenderIdentity.getText());
			} else {
				failed(driver, "Failed To Validate the Gender Identity In Patient Details Page Expected As "
						+ (GlobalVariables.GenderIdentity) + ",But Actual is" + elePatientGenderIdentity.getText());
			}

			String UIPhoneNumber = elePatientPhoneNumber.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in Patient Details As" + PhoneNumberInPatientDetails);

			} else {
				failed(driver, "Failed To Validate the Phone Number Identity In Patient Details Page Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}
			
		

			if (elePatientEmail.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in Patient Details As" + elePatientEmail.getText());
			} else {
				failed(driver, "Failed To Validate the Gender Identity In Patient Details Page Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + elePatientEmail.getText());
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	public void ValidatePatientDetailsForDependent() {
	
		try {
			waitForElement(elePatientName);

			if (elePatientName.getText().replaceAll("\\s+", "")
					.equals(GlobalVariables.ChildName.replaceAll("\\s+", ""))) {
				passed("Successfully Validated the Dependent  Name in Patient Details As" + elePatientName.getText());
			} else {
				failed(driver,
						"Failed To Validate the Dependent Name In Patient Details Page Expected As "
								+ (GlobalVariables.ChildName) + ",But Actual is"
								+ elePatientName.getText());
			}

			if (elePatientDOB.getText().equals(GlobalVariables.DOB)) {
				passed("Successfully Validated the Dependent  Date of Birth in Patient Details As" + elePatientDOB.getText());
			} else {
				failed(driver, "Failed To Validate the Dependent Date of Birth In Patient Details Page Expected As "
						+ (GlobalVariables.DOB) + ",But Actual is" + elePatientDOB.getText());
			}

			if (elePatientGenderIdentity.getText().equals(GlobalVariables.ChildGender)) {
				passed("Successfully Validated the Dependent  Gender Identity in Patient Details As"
						+ elePatientGenderIdentity.getText());
			} else {
				failed(driver, "Failed To Validate the Dependent Gender Identity In Patient Details Page Expected As "
						+ (GlobalVariables.ChildGender) + ",But Actual is" + elePatientGenderIdentity.getText());
			}

			String UIPhoneNumber = elePatientPhoneNumber.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in Patient Details As" + PhoneNumberInPatientDetails);

			} else {
				failed(driver, "Failed To Validate the Phone Number Identity In Patient Details Page Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}
			


			if (elePatientEmail.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in Patient Details As" + elePatientEmail.getText());
			} else {
				failed(driver, "Failed To Validate the Gender Identity In Patient Details Page Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + elePatientEmail.getText());
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
	}

	public AppNavPage NavigateToAppNavPage() {

		try {
			passed("Navigate To AppNav Page");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		return new AppNavPage(driver, data);
	}

	public AppNavPage NavigateBackToApplicationFrom98point6SDK() {
		try {
			waitForElement(ele98point6Exit);

			if (isElementPresent(ele98point6Exit)) {

				clickOn(ele98point6Exit, "98point6SDK Exit");
			}

			waitForElement(btn98point6Exit_LEAVE);

			if (isElementPresent(btn98point6Exit_LEAVE)) {

				clickOn(btn98point6Exit_LEAVE, "98point6SDK Exit Leave button");
			}

			waitForElement(btnNavigateBack);

			if (isElementPresent(btnNavigateBack)) {

				clickOn(btnNavigateBack, "Navigate Back In Patient details");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);

	}

	public void ValidateChatCareLaunchForSelf() {
		try {
			waitForElement(btnProceed);

			clickOn(btnProceed, "Proceed Button");

			waitForElement(btnProceed);
			if (isElementPresent(btnProceed)) {
				clickOn(btnProceed, "Proceed Button");

			}
			waitForElement(elePatientDetails);

			if (isElementPresent(elePatientDetails)) {

				passed("User Successfully Navigated To Patient Details Page");
				takeScreenshot(driver);
			} else {
				failed(driver, "User Failed To Navigate To Patient Details Page");
			}

			ValidatePatientDetailsForSelf();

			waitForElement(btnBeginConsultation);

			clickOn(btnBeginConsultation, "Begin Consultation button");

			waitForElement(ele98point6WelcomeText);

			if (isElementPresent(ele98point6WelcomeText)) {

				takeScreenshot(driver);

				passed("Successfully Validated The 98Point6 Launch Welcome Page In Chat Care");
			}

			waitForElement(btnSkip);
			if (isElementPresent(btnSkip)) {

				clickOn(btnSkip, "Skip Button");
			}

			waitForElement(ele98point6SubmitButton);

			if (isElementPresent(ele98point6SubmitButton) || isElementPresent(ele98point6PhoneNumberTextField)) {

				takeScreenshot(driver);

				passed("Successfully Validated The 98Point6 Launch In Chat Care");
			} else {
				failed(driver, "Failed To Validate The 98Point6 Launch  In Chat Care.");
			}

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}
	
	
	public void ValidateChatCareLaunchForDependent() {


		try {
			waitForElement(btnProceed);

			clickOn(btnProceed, "Proceed Button");

			waitForElement(btnProceed);
			if (isElementPresent(btnProceed)) {
				clickOn(btnProceed, "Proceed Button");

			}
			waitForElement(elePatientDetails);

			if (isElementPresent(elePatientDetails)) {

				passed("User Successfully Navigated To Patient Details Page");
				takeScreenshot(driver);
			} else {
				failed(driver, "User Failed To Navigate To Patient Details Page");
			}

			ValidatePatientDetailsForDependent();

			waitForElement(btnBeginConsultation);

			clickOn(btnBeginConsultation, "Begin Consultation button");

			waitForElement(ele98point6WelcomeText);

			if (isElementPresent(ele98point6WelcomeText)) {

				takeScreenshot(driver);

				passed("Successfully Validated The 98Point6 Launch Welcome Page In Chat Care");
			}

			waitForElement(btnSkip);
			if (isElementPresent(btnSkip)) {

				clickOn(btnSkip, "Skip Button");
			}

			waitForElement(ele98point6SubmitButton);

			if (isElementPresent(ele98point6SubmitButton) || isElementPresent(ele98point6PhoneNumberTextField)) {

				takeScreenshot(driver);

				passed("Successfully Validated The 98Point6 Launch In Chat Care");
			} else {
				failed(driver, "Failed To Validate The 98Point6 Launch  In Chat Care.");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
	}

	public AppNavPage clickOnCancelButton() {

		try {
			waitForElement(btnCancel);

			clickOn(btnCancel, "Cancel Button In Chat Care");
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new AppNavPage(driver, data);
	}

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(imgChatCareLogo);

			waitForElement(btnBecomeTreatMember);

			if (isElementPresent(btnBecomeTreatMember) || isElementPresent(imgChatCareLogo)) {

				passed("User Successfully Navigated To Chat Care   Page");
			} else {
				failed(driver, "User Failed To navigate To Chat Care  Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}

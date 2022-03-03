package pages;

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

public class HealthWalletPage extends TestBase {

	protected HealthWalletPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Health Wallet')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Health Wallet']")
	private MobileElement lblHealthWallet;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_login')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Login']")
	private MobileElement btnLogInInHealthWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_description_2')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Login']")
	private MobileElement eleNeedLoginTextInHealthWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'MEMBER')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='MEMBER']")
	private MobileElement labelMember;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/user_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[6]")
	private MobileElement txtUserNameInHealthWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_membership_ends_label')] ")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[11]")
	private MobileElement txtMembershipEndsInHealthWallet;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/membership_period')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[14]")
	private MobileElement txtMembershipPeriodInHealthWallet;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/user_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatIconSmall']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtUserNameInHealthWalletForNonMember;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_membership_ends_label')] ")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatIconSmall']//following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement txtMembershipEndsInHealthWalletForNonMember;


	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/card_upload_record')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Upload a Record')]")
	private MobileElement btnUploadARecord;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/medical_records')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Health Records')]")
	private MobileElement btnHealthRecords;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/card_health_portal')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Health Portal')]")
	private MobileElement btnHealthPortal;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'OK')]")
	private MobileElement btnHealthPortal_YES;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/dialog_negative')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'CANCEL')]")
	private MobileElement btnHealthPortal_NO;

	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'id/dialog_positive')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'OK')]")
	private MobileElement eleInHealthPortal;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'id/consent_forms')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Consent Forms')]")
	private MobileElement btnConsentForms;

	// CapitalRX

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView5')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']")
	private MobileElement eleCapRxTreatLogo;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imageView6')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='capitalRxLogo']")
	private MobileElement eleCapRxLogo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/textView4')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[4]")
	private MobileElement eleCapRxDesc;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_helpline')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']//following-sibling::XCUIElementTypeStaticText[12]")
	private MobileElement eleCapRxHelpLineNum;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_title')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleCapRxCardField1;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_subtitle')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[2]")
	private MobileElement eleCapRxCardField1Value;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_title')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[5]")
	private MobileElement eleCapRxCardField2;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_subtitle')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[7]")
	private MobileElement eleCapRxCardField2Value;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_title')])[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[8]")
	private MobileElement eleCapRxCardField3;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_subtitle')])[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[10]")
	private MobileElement eleCapRxCardField3Value;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_title')])[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[14]")
	private MobileElement eleCapRxCardField4;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'id/tv_subtitle')])[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='treatLogo']/following-sibling::XCUIElementTypeStaticText[15]")
	private MobileElement eleCapRxCardField4Value;
	
	
	

	public void ValidateHealthWalletDetailsForGuestUser() {

		try {
			waitForElement(eleNeedLoginTextInHealthWallet);

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				if (eleNeedLoginTextInHealthWallet.getText().trim().equals(Constants.LogInNeededText)) {

					passed("Sucessfully validated the Text in Health Wallet For Guest User As"
							+ eleNeedLoginTextInHealthWallet.getText());

				} else {
					failed(driver, "Failed To Validate The Text in Health Wallet For Guest User");
				}

			}

			waitForElement(eleNeedLoginTextInHealthWallet);

			if (isElementPresent(eleNeedLoginTextInHealthWallet) && isElementPresent(btnLogInInHealthWallet)) {

				passed("Successfully validated Guest User not able use the Health Wallet to Upload Records");

			}

			else {

				failed(driver, "Failed To Validate the Guest User unable to use the Health Wallet to Upload Records");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public SignInPage clickOnLogInButtonInHealthWallet() {

		try {
			waitForElement(btnLogInInHealthWallet);

			if (isElementPresent(btnLogInInHealthWallet)) {
				clickOn(btnLogInInHealthWallet, "LogInButton In Health Wallet");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new SignInPage(driver, data);

	}

	public void ValidateHealthWalletDetailsforNonMemberUser() {

		try {
			waitForElement(txtUserNameInHealthWalletForNonMember);

			if (txtUserNameInHealthWalletForNonMember.getText().trim()
					.equals(GlobalVariables.FirstName + " " + GlobalVariables.LastName)) {

				passed("User Successfully Validated the User Name In   Health Wallet Page As"
						+ txtUserNameInHealthWalletForNonMember.getText());

			} else {

				failed(driver,
						"Failed To Validate the User Name In  Health Wallet Page Expected As"
								+ GlobalVariables.FirstName + " " + GlobalVariables.LastName + "But Actual is"
								+ txtUserNameInHealthWalletForNonMember.getText());
			}

			waitForElement(txtMembershipEndsInHealthWalletForNonMember);

			if (txtMembershipEndsInHealthWalletForNonMember.getText().trim().equals(Constants.NoMembershipText)) {

				passed("User Successfully Validated  Membership  Text for Non Member UserIn  Health Wallet Page As"
						+ txtMembershipEndsInHealthWalletForNonMember.getText());

			} else {
				failed(driver,
						"Failed To Validate The Membership  Text  Non Member User In  Health Wallet Page Expected As "
								+ Constants.NoMembershipText + ", but Actual is"
								+ txtMembershipEndsInHealthWalletForNonMember.getText());
			}

			waitForElement(btnUploadARecord);

			if (isElementPresent(btnUploadARecord)) {

				passed("User successfully Validated Upload a Record button for Non Member user in Health Wallet");

			} else {
				failed(driver, "User Failed To Validate Upload a Record button for Non Member user in Health Wallet ");
			}

			waitForElement(btnHealthRecords);

			if (isElementPresent(btnHealthRecords)) {

				passed("User successfully Validated Health Records button for Non Member user in Health Wallet");

			} else {
				failed(driver, "User Failed To Validate Health Records button for Non Member user in Health Wallet ");
			}

			waitForElement(btnHealthPortal);

			if (isElementPresent(btnHealthPortal)) {

				passed("User successfully Validated Health Portal button for Non Member user in Health Wallet");

			} else {
				failed(driver, "User Failed To Validate Health Portal for Non Member user in Health Wallet ");
			}

			waitForElement(btnConsentForms);

			if (isElementPresent(btnConsentForms)) {

				passed("User successfully Validated Consent Forms button for Non Member user in Health Wallet");

			} else {
				failed(driver, "User Failed To Validate Consent Forms button for Non Member user in Health Wallet ");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	
	public void ValidateCapitalRXCardDetailsForAMemeber() {
		
		
		try {
			waitForElement(eleCapRxLogo);
			
			if(isElementPresent(eleCapRxLogo)) {
				
				passed("Successfully Validated CapitalRxCard is displayed By Default For Member User In Treat");
				passed("Successfully validated CapitalRxCard Logo is Displayed On The CapitalRx Card In Health Wallet");
				takeScreenshot(driver);
			}
			else {
				failed(driver,"Failed To Validate  Display of CapitalRxCard By Default For Member User In Treat");
				
				failed(driver,"Failed To Validate CapitalRxCard Logo is Display On The CapitalRx Card In Health Wallet ");
			}
			
     waitForElement(eleCapRxTreatLogo);
			
			if(isElementPresent(eleCapRxTreatLogo)) {
				
				passed("Successfully validated the CapRxTreatLogo On The CapRx Card In Health Wallet Page");
			}
			else {
				failed(driver,"Failed To Validate  CapRxTreatLogo On The CapRx Card In Health Wallet Page ");
			}
			
			
			waitForElement(eleCapRxDesc);
			
			if (eleCapRxDesc.getText().trim().replaceAll("\\s+", "").equals(Constants.CapRxDesc.replaceAll("\\s+", ""))) {

				passed("Successfully Validated The CapRx Card Description As"+eleCapRxDesc.getText());
				

			} else {
				failed(driver,"Failed To validate The CapRx Card Description,Expected "+Constants.CapRxDesc+"But Actual As"+eleCapRxDesc.getText());
			}
			
waitForElement(eleCapRxHelpLineNum);
			
			if (eleCapRxHelpLineNum.getText().trim().equals(Constants.CapRxHelpLineNo)) {

passed("Successfully Validated The CapRx Card Help Line Number As"+eleCapRxHelpLineNum.getText());
				

			} else {
				failed(driver,"Failed To validate The CapRx Card Help Line Number,Expected "+Constants.CapRxHelpLineNo+"But Actual As"+eleCapRxHelpLineNum.getText());
			}
			
			
			
			
			
			
			waitForElement(eleCapRxCardField1);

			if (eleCapRxCardField1.getText().trim().equals(Constants.CapRxCardField1Name)) {

				passed("Successfully Validated The CapRx Card Field 1 As" + eleCapRxCardField1.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card  Field 1,Expected " + Constants.CapRxCardField1Name
						+ "But Actual As" + eleCapRxCardField1.getText());
			}

			waitForElement(eleCapRxCardField1Value);

			if (eleCapRxCardField1Value.getText().trim().equals(Constants.CapRxCardField1Value)) {

				passed("Successfully Validated The CapRx Card Field 1 Value  As" + eleCapRxCardField1.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card Field 1 Value ,Expected " + Constants.CapRxCardField1Name
						+ "But Actual As" + eleCapRxCardField1.getText());
			}
			
			
			
			waitForElement(eleCapRxCardField2);

			if (eleCapRxCardField2.getText().trim().equals(Constants.CapRxCardField2Name)) {

				passed("Successfully Validated The CapRx Card Field 2 As" + eleCapRxCardField2.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card  Field 2,Expected " + Constants.CapRxCardField2Name
						+ "But Actual As" + eleCapRxCardField2.getText());
			}

			waitForElement(eleCapRxCardField2Value);

			if (eleCapRxCardField2Value.getText().trim().equals(Constants.CapRxCardField2Value)) {

				passed("Successfully Validated The CapRx Card Field 2 Value  As" + eleCapRxCardField2.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card Field 2 Value ,Expected " + Constants.CapRxCardField2Name
						+ "But Actual As" + eleCapRxCardField2.getText());
			}
			

			waitForElement(eleCapRxCardField3);

			if (eleCapRxCardField3.getText().trim().equals(Constants.CapRxCardField3Name)) {

				passed("Successfully Validated The CapRx Card Field 3 As" + eleCapRxCardField3.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card  Field 3,Expected " + Constants.CapRxCardField3Name
						+ "But Actual As" + eleCapRxCardField3.getText());
			}

			waitForElement(eleCapRxCardField3Value);

			if (eleCapRxCardField3Value.getText().trim().equals(Constants.CapRxCardField3Value)) {

				passed("Successfully Validated The CapRx Card Field 3 Value  As" + eleCapRxCardField3.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card Field 3 Value ,Expected " + Constants.CapRxCardField3Name
						+ "But Actual As" + eleCapRxCardField3.getText());
			}
			
			
			waitForElement(eleCapRxCardField4);

			if (eleCapRxCardField4.getText().trim().equals(Constants.CapRxCardField4Name)) {

				passed("Successfully Validated The CapRx Card Field 4 As" + eleCapRxCardField4.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card  Field 4,Expected " + Constants.CapRxCardField4Name
						+ "But Actual As" + eleCapRxCardField4.getText());
			}

			waitForElement(eleCapRxCardField4Value);

			if (eleCapRxCardField4Value.getText().trim().contains(Constants.CapRxCardField4Value)) {

				passed("Successfully Validated The CapRx Card Field 4 Value  As" + eleCapRxCardField4.getText());

			} else {
				failed(driver, "Failed To validate The CapRx Card Field 4 Value ,Expected " + Constants.CapRxCardField4Name
						+ "But Actual As" + eleCapRxCardField4.getText());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void SwipeToViewMembershipCardInHealthWallet() {
		try {
			scrollByDimension(0.9, 0.2, 0.3, 0.3);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
	}
	
	
	
	
	
	public void ValidateHealthWalletDetailsForMemberUser() {

		try {
			
			SwipeToViewMembershipCardInHealthWallet();
			
			waitForElement(labelMember);

			if (isElementPresent(labelMember)) {
				passed("User Successfully Validated  The Teat Logo In  Health Wallet Page");

			} else {
				failed(driver, "Failed To Validate The Treat Logo In  Health Wallet Page");
			}

			waitForElement(txtUserNameInHealthWallet);

			if (txtUserNameInHealthWallet.getText()
					.equals(GlobalVariables.FirstName + " " + GlobalVariables.LastName)) {

				passed("User Successfully Validated the User Name In   Health Wallet Page As"
						+ txtUserNameInHealthWallet.getText());

			} else {

				failed(driver, "Failed To Validate the User Name In  Health Wallet Page ");
			}

			waitForElement(txtMembershipPeriodInHealthWallet);

			GlobalVariables.SelectMembershipPlanType="3 month";
			
			if (txtMembershipPeriodInHealthWallet.getText()
					.equals(getSubscriptionDate(GlobalVariables.SelectMembershipPlanType))) {

				passed("User Successfully Validated The Membership Period In    Health Wallet Page  As"
						+ txtMembershipPeriodInHealthWallet.getText());

			} else {

				failed(driver, "User Failed To Validate the Membership Period In  Health Wallet  Page");

			}

			waitForElement(txtMembershipEndsInHealthWallet);

		if (txtMembershipEndsInHealthWallet.getText().trim().equals(Constants.MembershipRenewsText)) {

				passed("User Successfully Validated  Membership Ends Text In  Health Wallet Page As"
						+ txtMembershipEndsInHealthWallet.getText());

			} else {
				failed(driver, "Failed To Validate The Membership Ends Text In  Health Wallet Page ");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public HealthWallet_UploadARecordPage clickOnUploadARecordButton() {
		try {
			waitForElement(btnUploadARecord);

			if (isElementPresent(btnUploadARecord)) {

				clickOn(btnUploadARecord, "Upload A Record button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());

		}

		return new HealthWallet_UploadARecordPage(driver, data);
	}

	public HealthWallet_HealthRecordsPage clickOnHealthRecordsButton() {
		try {
			waitForElement(btnHealthRecords);

			if (isElementPresent(btnHealthRecords)) {

				clickOn(btnHealthRecords, "Health records button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());

		}

		return new HealthWallet_HealthRecordsPage(driver, data);
	}

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(lblHealthWallet);

			if (isElementPresent(lblHealthWallet)) {

				passed("User Successfully Navigated To Health Wallet Page");
			} else {
				failed(driver, "User Failed To navigate To Health Wallet Page");
			}
			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}

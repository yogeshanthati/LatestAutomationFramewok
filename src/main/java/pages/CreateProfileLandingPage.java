package pages;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Data;
import utilities.GlobalKeys;
import utilities.GlobalVariables;

public class CreateProfileLandingPage extends TestBase {

	protected CreateProfileLandingPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/title_become_treat_member')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Create a Profile']")
	private MobileElement eleCreateProfile;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_email')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private MobileElement txtEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edit_password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
	private MobileElement txtPassword;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[2]")
	private MobileElement txtShowPassword;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_continue')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
	private MobileElement btnContinue;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter an Email Address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter an Email Address']")
	private MobileElement errEmptyEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a Password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a Password']")
	private MobileElement errEmptyPassword;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'The email entered is invalid. Please try again.')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='The email entered is invalid. Please try again.']")
	private MobileElement errInvalidEmailAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Please enter a valid Password')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a valid Password']")
	private MobileElement errInvalidPassword;

	@AndroidFindBy(accessibility = "Show password")
	@iOSXCUITFindBy(accessibility = "showPassword")
	private MobileElement btnShowPwd;

	@AndroidFindBy(accessibility = "Show password")
	@iOSXCUITFindBy(accessibility = "hidePassword")
	private MobileElement btnHidePwd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Your password must be at least 8 characters long')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText [contains(@name,'Your password must be at least 8 characters long')]")
	private MobileElement lblPassworddRegex;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Not Now']")
	@AndroidFindBy(id = "android:id/button2")
	private MobileElement btnNotNow;

	public void clickOnNotNowButton() {

		try {
			waitForElement(btnNotNow);

			if (isElementPresent(btnNotNow)) {

				clickOn(btnNotNow, "Not Now button");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught As " + e.getMessage());
		}

	}

	public void EnterEmailAddressAndPasswordInCreateProfile() {

		try {

			GlobalVariables.CreateUserName = data.get("EmailAddress") + generateRandomNumber(4) + "@yopmail.com";

			GlobalVariables.CreateUserPwd = data.get("Password");

			enterText(txtEmailAddress, "Email Address In Create Profile Landing  Page", GlobalVariables.CreateUserName);

			enterText(txtPassword, "Password In Create Profile Landing Page", GlobalVariables.CreateUserPwd);

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public CreateProfilePage clickOnContinueButton() {

		try {
			clickOn(btnContinue, "Continue button In Create Profile Landing Page");

			clickOnNotNowButton();

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new CreateProfilePage(driver, data);
	}

	public void ValidatePasswordRegexAndMaskingInCreateProfileLandingPage() {

		try {
			waitForElement(txtPassword);

			enterText(txtPassword, "Password In CreateProfile Landing Page", data.get("Password"));

			if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				String Passwpord = txtPassword.getAttribute("password");

				boolean bolPasswpord = Boolean.parseBoolean(Passwpord);

				if (bolPasswpord) {

					passed("User successfully validated  masking of the Password text field In Create Profile Landing  Page");

					takeScreenshot(driver);

				} else {
					failed(driver,
							"Failed To Validate masking of the Password text field  In Create Profile Landing  Page");
				}

				clickOn(btnShowPwd, "Show password icon");

				String ShowPasswpord = txtPassword.getAttribute("password");

				boolean bolShowPasswpord = Boolean.parseBoolean(ShowPasswpord);

				if (!bolShowPasswpord) {

					passed("User successfully validated the Show password icon Functionality  In Create Profile Landing  Page ");

					takeScreenshot(driver);

				} else {
					failed(driver,
							"Failed To Validate the Show password icon Functionality  In Create Profile Landing  Page");
				}

				clickOn(btnHidePwd, "Hide password icon");

			} else {

				String PasswpordTag = txtPassword.getAttribute("type");

				if (PasswpordTag.equals("XCUIElementTypeSecureTextField")) {

					passed("User successfully validated  masking of the Password text field In Create Profile Landing  Page");

					takeScreenshot(driver);

				} else {
					failed(driver,
							"Failed To Validate masking of the Password text field  In Create Profile Landing  Page");
				}

				clickOn(btnShowPwd, "Show password icon");

				String ShowPasswpordTag = txtShowPassword.getAttribute("type");

				if (ShowPasswpordTag.equals("XCUIElementTypeTextField")) {

					passed("User successfully validated the Show password icon Functionality  In Create Profile Landing  Page ");

					takeScreenshot(driver);

				} else {
					failed(driver,
							"Failed To Validate the Show password icon Functionality  In Create Profile Landing  Page");
				}

				clickOn(btnHidePwd, "Hide password icon");

			}

			enterText(txtPassword, "Password In Create Profile  Page", data.get("InValidPassword"));

			waitForElement(lblPassworddRegex);

			if (isElementPresent(lblPassworddRegex)) {

				passed("User successfully validated the  password regex description for Invalid password  In Create Profile Landing  Page ");

				takeScreenshot(driver);

			} else {
				failed(driver,
						"Failed To  validate the  password regex description for Invalid password  In Create Profile Landing  Page");
			}

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUserLogInWithEmptyEmailAddressAndPassword() {

		try {

			clearText(txtEmailAddress);

			clearText(txtPassword);

			clickOn(btnContinue, "Continue button In Create Profile Landing Page");

			waitForElement(errEmptyEmailAddress);

			if (isElementPresent(errEmptyEmailAddress)) {

				passed("User successfully verfied the Empty email address error message.");
			} else {
				failed(driver, "Failed to verify  Empty email address error message ");
			}

			waitForElement(errEmptyPassword);

			if (isElementPresent(errEmptyPassword)) {

				passed("User successfully verfied the Empty Password error message.");
			} else {
				failed(driver, "Failed to verify  Empty Password error message ");
			}

			takeScreenshot(driver);
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUserLogInWithInvalidEmailAddressAndValidPassword() {

		try {
			enterText(txtEmailAddress, "Email Address In Create Profile  Page", data.get("InValidEmailAddress"));

			enterText(txtPassword, "Password In Create Profile  Page", data.get("Password"));

			clickOn(btnContinue, "Continue button In Create Profile Page");

			waitForElement(errInvalidEmailAddress);

			if (isElementPresent(errInvalidEmailAddress)) {

				passed("User successfully verfied the InValid email address error message In Create Profile Landing  Page");
			} else {
				failed(driver,
						"Failed to verify  InValid email address error message  In Create Profile Landing  Page");
			}
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	public void ValidateUserLogInWithValidEmailAddressAndInvalidPassword() {

		try {
			enterText(txtEmailAddress, "Email Address In Create Profile  Page", data.get("EmailAddress"));

			enterText(txtPassword, "Password In Create Profile  Page", data.get("InValidPassword"));

			clickOn(btnContinue, "Continue button In Create ProfileLogIn Page");

			waitForElement(errInvalidPassword);

			if (isElementPresent(errInvalidPassword)) {

				passed("User successfully verfied the Invalid Password error message In Create Profile Landing  Page");
			} else {
				failed(driver, "Failed to verify  Invalid Password error message In Create Profile Landing  Page ");
			}

			takeScreenshot(driver);
		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	}

	public void ValidateUserLogInWithInvalidEmailAddressAndInvalidPassword() {

		try {
			enterText(txtEmailAddress, "Email Address In Create Profile  Page", data.get("InValidEmailAddress"));

			enterText(txtPassword, "Password In Create Profile  Page", data.get("InValidPassword"));

			clickOn(btnContinue, "Continue button In Create Profile Page");

			waitForElement(errInvalidEmailAddress);

			if (isElementPresent(errInvalidEmailAddress)) {

				passed("User successfully verfied the InValid email address error message  In Create Profile Landing  Page");
			} else {
				failed(driver,
						"Failed to verify  InValid email address error message  In Create Profile Landing  Page ");
			}

			waitForElement(errInvalidPassword);

			if (isElementPresent(errInvalidPassword)) {

				passed("User successfully verfied the Invalid Password error message  In Create Profile Landing  Page");
			} else {
				failed(driver, "Failed to verify  Invalid Password error message  In Create Profile Landing  Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());

		}

	}

	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(eleCreateProfile);

			if (isElementPresent(eleCreateProfile)) {

				passed("User Successfully Navigated To   Create Profile Landing  Page");
			} else {
				failed(driver, "User Failed To navigate To the Create Profile Landing  Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}

package pages;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Data;

public class WelcomePage extends TestBase {

	protected WelcomePage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
		
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Welcome']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Welcome']")
	private MobileElement eleWelcomeString;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Welcome']//following-sibling::android.widget.TextView")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Welcome']//following-sibling::XCUIElementTypeStaticText")
	private MobileElement eleWelcomePageDesc;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Welcome']//following-sibling::android.widget.TextView")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Welcome']//following-sibling::XCUIElementTypeStaticText")
	private MobileElement btnArrowRight;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Welcome']//following-sibling::android.widget.TextView")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Welcome']//following-sibling::XCUIElementTypeStaticText")
	private MobileElement btnArrowLeft;
	
	
	//XCUIElementTypeButton[@name="arrowRight"]
	//android.widget.ImageView[contains(@resource-id,'id/bt_forward')]
	
	//XCUIElementTypeButton[@name="arrowLeft"]
	//android.widget.ImageView[contains(@resource-id,'id/bt_back')]
	
	//XCUIElementTypeImage[@name="treatIconSmall"]
	//android.widget.ImageView[contains(@resource-id,'id/imageVie')]
	
	//XCUIElementTypeImage[@name='treatIconSmall']//following::XCUIElementTypeOther/XCUIElementTypeStaticText[1]--heading[2]--Desc
	
	//android.widget.ImageView[contains(@resource-id,'id/imageView')]//following-sibling::android.widget.TextView[1]
	
	//android.widget.ImageView[contains(@resource-id,'id/imageView')]//following-sibling::android.widget.TextView[2]
	
	
	//XCUIElementTypeButton[@name="Create Profile"]
	//android.widget.Button[@resource-id='id/button_create_account']
	
	
	//XCUIElementTypeImage[@name="treatLogoOnboarding"]
	//android.widget.ImageView[@resource-id='id/imageView']

	
	//XCUIElementTypeImage[@name="treatIconSmall"]
	//android.widget.ImageView[@resource-id='id/imageView2']
	
	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(eleWelcomeString);
			
			waitForElement(eleWelcomeString);

			if (isElementPresent(eleWelcomeString)) {

				passed("User Successfully Navigated To Welcome    Page");
			} else {
				failed(driver, "User Failed To navigate To Welcome  Page");

			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
	}

}

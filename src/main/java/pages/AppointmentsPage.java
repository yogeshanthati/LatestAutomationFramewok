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
import utilities.GlobalVariables;

public class AppointmentsPage extends TestBase {

	protected AppointmentsPage(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);

	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Appointments')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointments']")
	private MobileElement lblAppointments_GuestUser;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Treat Wellness Centers')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Treat Wellness Centers']")
	private MobileElement lblAppointments;
	
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Review your appointment details']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleReviewAppointment_ServiceName;



	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_login')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Login']")
	private MobileElement btnLogin_GuestUser;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_sign_up')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CREATE ACCOUNT']")
	private MobileElement btnCreateAccount_GuestUser;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Treat Wellness Centers')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Treat Wellness Centers']")
	private MobileElement lbltreatWellnessCenters;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Health Services')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Health Services')]")
	private MobileElement btnHealthServices;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Wellness Services')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Wellness Services')]")
	private MobileElement btnWellnessServices;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_select_location')]//following::android.widget.TextView[contains(@resource-id,'id/tv_location')][2]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Select a wellness center location']//following::XCUIElementTypeScrollView//XCUIElementTypeButton[2]")
	private MobileElement eleSelectWellnessCenterLocation;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_upcoming_appointments')]//following::android.widget.Spinner")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Upcoming Appointments']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement txtUpComingAppointntsFor;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_upcoming_appointments')]//following::android.widget.ImageButton")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Upcoming Appointments']//following-sibling::XCUIElementTypeImage[@name='dropDown']")
	private MobileElement btnDrpdownUpComingAppointntsFor;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	private MobileElement btnDone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
	private MobileElement elePickerWheel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Health']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Health']")
	private MobileElement btnHealthUpcomingAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Booking cancelled')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Booking Cancelled']")
	private MobileElement msgSuccessBookingCancel;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Wellness']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Wellness']")
	private MobileElement btnWellnessUpcomingAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_no_appointments')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Health']//following::XCUIElementTypeStaticText[1]")
	private MobileElement eleNoAppointments;
		
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Upcoming Appointments')]//following::android.widget.ImageView[contains(@resource-id,'id/iv_proceed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Upcoming Appointments']//following::XCUIElementTypeImage[@name='disclosureIndicator']")
	private List<MobileElement>btnProceedArrow_UpComingAppointnts;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Upcoming Appointments']//following::XCUIElementTypeImage[@name='disclosureIndicator']//preceding-sibling::XCUIElementTypeStaticText[2]")
	private List<MobileElement> eleUpcomingAppointments_ServiceName;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id,'id/tv_location')]")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='Upcoming Appointments']//following::XCUIElementTypeImage[@name='disclosureIndicator']//preceding-sibling::XCUIElementTypeStaticText[1]")
	private List<MobileElement> eleUpcomingAppointments_ServiceAddress;
	
	
	
	

	public void ValidateFieldsInAppointmentsPageForGuestUser() {

		try {
			waitForElement(lblAppointments_GuestUser);

			if (isElementPresent(lblAppointments_GuestUser)) {
				passed("User successfully Validated the Appointments Label  In Appointments Page for  Guest User LogIn");
			} else {
				failed(driver,
						"User Failed To validate the Appointments Label In Appointments Page for  Guest User LogIn ");
			}

			waitForElement(btnLogin_GuestUser);

			if (isElementPresent(btnLogin_GuestUser)) {
				passed(" successfully Validated the  LogIn Button In Appointments Page for  Guest User LogIn");
			} else {

				failed(driver,
						" Failed To validate the LogIn Button Label In Appointments Page for  Guest User LogIn ");
			}

			waitForElement(btnCreateAccount_GuestUser);

			if (isElementPresent(btnCreateAccount_GuestUser)) {
				passed(" successfully Validated the Create Account button  In Appointments Page for  Guest User LogIn");
			} else {
				failed(driver,
						" Failed To validate the Create Account button In Appointments Page for  Guest User LogIn ");
			}

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	
	
	public void ValidateCreateAppointmentsForGuestUser() {

		try {
			if (isElementPresent(btnCreateAccount_GuestUser) && isElementPresent(btnLogin_GuestUser)) {

				passed("Sucessfully Validated  Appointments Cannot  be created for Guest User.");

			} else {
				failed(driver, "User Failed To Validate Appointments Cannot  be created for Guest User. ");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
	}
	

	public SignInPage clickOnLogInButton() {

		try {
			waitForElement(btnLogin_GuestUser);

			clickOn(btnLogin_GuestUser, "Log In Button in AppointMentsPage");

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		return new SignInPage(driver, data);
	}

	public CreateProfilePage clickOnCreateAccountButton() {

		try {
			waitForElement(btnCreateAccount_GuestUser);

			clickOn(btnCreateAccount_GuestUser, "Create Account button In Appointments");

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

		return new CreateProfilePage(driver, data);

	}

	
	
	
public  void  clickOnHealthServicesButton() {
	
	try {
		waitForElement(btnHealthServices);

		clickOn(btnHealthServices, "Health Services button In Appointments");

	} catch (Exception e) {

		failed(driver, "Exception caught " + e.getMessage());
	}

	
	
}

public  void  clickOnWellnessServicesButton() {
	
	try {
		waitForElement(btnWellnessServices);

		clickOn(btnWellnessServices, "Wellness Services button In Appointments");

	} catch (Exception e) {

		failed(driver, "Exception caught " + e.getMessage());
	}

	
	
}
	
	
public Appointments_HealthServicesPage SelectWellnessCenterLocationForHealthServices() {

	try {
		waitForElement(eleSelectWellnessCenterLocation);

		if (isElementPresent(eleSelectWellnessCenterLocation)){
			
			takeScreenshot(driver);

			GlobalVariables.SelectWellnessCenterLocation = eleSelectWellnessCenterLocation.getText();

			clickOn(eleSelectWellnessCenterLocation, "Wellness Center Location");
		}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}

	return new Appointments_HealthServicesPage(driver, data);
}
	
	
public Appointments_WellnessServicesPage SelectWellnessCenterLocationForWellnessServices() {

	try {
		waitForElement(eleSelectWellnessCenterLocation);

		if (isElementPresent(eleSelectWellnessCenterLocation)){

			GlobalVariables.SelectWellnessCenterLocation = eleSelectWellnessCenterLocation.getText();

			clickOn(eleSelectWellnessCenterLocation, "Wellness Center Location");
		}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}

	return new Appointments_WellnessServicesPage(driver, data);
}
	



public void clickOnUpcomingHealthServiceButton() {
	
	try {
		waitForElement(btnHealthUpcomingAppointments);
		
		if(isElementPresent(btnHealthUpcomingAppointments)) {
			
			clickOn(btnHealthUpcomingAppointments, "Upcoming Appointments Health Button");
		}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}
	
}

public void clickOnUpcomingWellnessServiceButton() {
	
	try {
		waitForElement(btnWellnessUpcomingAppointments);
		
		if(isElementPresent(btnWellnessUpcomingAppointments)) {
			
			clickOn(btnWellnessUpcomingAppointments, "Upcoming Appointments Wellness Button");
		}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}
	
}
	
	public void ValidateLatestUpcomingAppointments() {
		
		try {
			
			takeScreenshot(driver);
			
			Thread.sleep(8000);
			
			waitForElement(eleUpcomingAppointments_ServiceName.get(0));

			if (eleUpcomingAppointments_ServiceName.get(0).getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service  Name in Upcoming Appointments As "
						+ eleUpcomingAppointments_ServiceName.get(0).getText());
			} else {
				failed(driver,
						"Failed To Validate the Service Name in Upcoming Appointments Expected As"
								+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
								+ eleUpcomingAppointments_ServiceName.get(0).getText().replaceAll("\\s+", ""));
			}
			
			waitForElement(eleUpcomingAppointments_ServiceAddress.get(0));

			if (eleUpcomingAppointments_ServiceAddress.get(0).getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service Address in Upcoming Appointments  As "
						+ eleUpcomingAppointments_ServiceAddress.get(0).getText());
			} else {
				failed(driver,
						"Failed To Validate the Service Address in Upcoming Appointments  Expected As"
								+GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
								+ eleUpcomingAppointments_ServiceAddress.get(0).getText().replaceAll("\\s+", ""));
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
	}
	
	public Appointments_BookingDetailsPage clickOnProceedArrowbuttonForLatestUpComingAppointments() {
		
		try {
			
			Thread.sleep(8000);
			waitForElement(btnProceedArrow_UpComingAppointnts.get(0));

			clickOn(btnProceedArrow_UpComingAppointnts.get(0), "Upcoming Appointments");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		
		
		return new Appointments_BookingDetailsPage(driver, data);
	}
	
	
	
	public void ValidateSecondUpComingAppointmentForWellness() {

		
		try {
     takeScreenshot(driver);
			
			Thread.sleep(8000);
		
			waitForElement(eleUpcomingAppointments_ServiceName.get(1));

			if (eleUpcomingAppointments_ServiceName.get(1).getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service  Name in Upcoming Appointments As "
						+ eleUpcomingAppointments_ServiceName.get(1).getText());
			} else {
				failed(driver,
						"Failed To Validate the Service Name in Upcoming Appointments Expected As"
								+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
								+ eleUpcomingAppointments_ServiceName.get(1).getText().replaceAll("\\s+", ""));
			}
			
			waitForElement(eleUpcomingAppointments_ServiceAddress.get(1));

			if (eleUpcomingAppointments_ServiceAddress.get(1).getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service Address in Upcoming Appointments  As "
						+ eleUpcomingAppointments_ServiceAddress.get(1).getText());
			} else {
				failed(driver,
						"Failed To Validate the Service Address in Upcoming Appointments  Expected As"
								+GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
								+ eleUpcomingAppointments_ServiceAddress.get(1).getText().replaceAll("\\s+", ""));
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
	
	}
	
	
	
	
public void ValidateSecondUpcomingAppointmentForHealth() {
		
		try {
			waitForElement(btnHealthUpcomingAppointments);
			
			if(isElementPresent(btnHealthUpcomingAppointments)) {
				
				clickOn(btnHealthUpcomingAppointments, "Upcoming Appointments Health Button");
				
				takeScreenshot(driver);
			}
			
			
			waitForElement(eleUpcomingAppointments_ServiceName.get(1));

			if (eleUpcomingAppointments_ServiceName.get(1).getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service  Name in Upcoming Appointments As "
						+ eleUpcomingAppointments_ServiceName.get(1).getText());
			} else {
				failed(driver,
						"Failed To Validate the Service Name in Upcoming Appointments Expected As"
								+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
								+ eleUpcomingAppointments_ServiceName.get(1).getText().replaceAll("\\s+", ""));
			}
			
			waitForElement(eleUpcomingAppointments_ServiceAddress.get(1));

			if (eleUpcomingAppointments_ServiceAddress.get(1).getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service Address in Upcoming Appointments  As "
						+ eleUpcomingAppointments_ServiceAddress.get(1).getText());
			} else {
				failed(driver,
						"Failed To Validate the Service Address in Upcoming Appointments  Expected As"
								+GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
								+ eleUpcomingAppointments_ServiceAddress.get(1).getText().replaceAll("\\s+", ""));
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}
		
		
		
	}
	

public void ValidateThirdUpcomingAppointmentForHealth() {

	
	try {
		waitForElement(btnHealthUpcomingAppointments);
		
		if(isElementPresent(btnHealthUpcomingAppointments)) {
			
			clickOn(btnHealthUpcomingAppointments, "Upcoming Appointments Health Button");
			
			takeScreenshot(driver);
		}
		
		waitForElement(eleUpcomingAppointments_ServiceName.get(2));

		if (eleUpcomingAppointments_ServiceName.get(2).getText().trim().replaceAll("\\s+", "")
				.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
			passed("Successsfully validated the Service  Name in Upcoming Appointments As "
					+ eleUpcomingAppointments_ServiceName.get(2).getText());
		} else {
			failed(driver,
					"Failed To Validate the Service Name in Upcoming Appointments Expected As"
							+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
							+ eleUpcomingAppointments_ServiceName.get(2).getText().replaceAll("\\s+", ""));
		}
		
		waitForElement(eleUpcomingAppointments_ServiceAddress.get(2));

		if (eleUpcomingAppointments_ServiceAddress.get(2).getText().replaceAll("\\s+", "")
				.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
			passed("Successsfully validated the Service Address in Upcoming Appointments  As "
					+ eleUpcomingAppointments_ServiceAddress.get(2).getText());
		} else {
			failed(driver,
					"Failed To Validate the Service Address in Upcoming Appointments  Expected As"
							+GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
							+ eleUpcomingAppointments_ServiceAddress.get(2).getText().replaceAll("\\s+", ""));
		}
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}
	
	
	

}
	public Appointments_BookingDetailsPage clickOnProceedArrowbuttonForSecondUpComingAppointments() {
		
		try {
			waitForElement(btnProceedArrow_UpComingAppointnts.get(1));

			clickOn(btnProceedArrow_UpComingAppointnts.get(1), "Upcoming");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		
		
		return new Appointments_BookingDetailsPage(driver, data);
	}
	
public Appointments_BookingDetailsPage clickOnProceedArrowbuttonForThirdUpComingAppointments() {
		
		try {
			waitForElement(btnProceedArrow_UpComingAppointnts.get(2));

			clickOn(btnProceedArrow_UpComingAppointnts.get(2), "Upcoming");
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		
		
		return new Appointments_BookingDetailsPage(driver, data);
	}
	
	public AppNavPage NavigateToAppNavPage() {
		
		return new AppNavPage(driver, data);
	}


	public void ValidateCancelHealthAppointmentInUpcomingAppointmentsPage() {
		
		try {
			
			waitForElement(msgSuccessBookingCancel);
			
			if(isElementPresent(msgSuccessBookingCancel)) {
				
				passed("User Successfully Validated Booking Cancelled Success Message");
			}
			
			  waitForElement(eleNoAppointments);
				
				if(isElementPresent(eleNoAppointments)) {
					
					passed(" Successfully Validated No Appointments Message As-->"+eleNoAppointments.getText());
				}
				else {
					failed(driver,"Failed To Validate No Appointments Message");
				}
				
			
			waitForElement(btnHealthUpcomingAppointments);
			
			clickOn(btnHealthUpcomingAppointments, "Health Upcoming Appointments");

			if (!(eleUpcomingAppointments_ServiceName.size() >= 1)) {

				passed("Successfully Validated the No Appointments in Under Upcoming Appointments");

			}

			else {

				failed(driver, "Failed To Validate the No Appointments in Under Upcoming Appointments ");

			}
			
			
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
public void ValidateCancelWellnessAppointmentInUpcomingAppointmentsPage() {
		
		try {
			
			waitForElement(msgSuccessBookingCancel);
			
			if(isElementPresent(msgSuccessBookingCancel)) {
				
				passed("User Successfully Validated Booking Cancelled Success Message");
			}
			

	waitForElement(eleNoAppointments);
			
			
			if(isElementPresent(eleNoAppointments)) {
				
				if(eleNoAppointments.getText().trim().replaceAll("\\s+", "").equals(Constants.NoAppointmentText.replaceAll("\\s+", ""))) {
					
					passed("Sucessfully validated the The No Upcoming Appointments Text  As"+eleNoAppointments.getText());
				}
				else {
					
					failed(driver," failed To Validate Upcoming Appointments Text  ,Expected As"+Constants.NoAppointmentText.replaceAll("\\s+", "")+"But Actual is "+eleNoAppointments.getText().replaceAll("\\s+", ""));
				}
				
			}
			
			
			waitForElement(btnWellnessUpcomingAppointments);
			
			clickOn(btnWellnessUpcomingAppointments, "Wellness Upcoming Appointments");

			if (!(eleUpcomingAppointments_ServiceName.size() >= 1)) {

				passed("Successfully Validated the No Appointments in Under Upcoming Appointments");

			}

			else {

				failed(driver, "Failed To Validate the No Appointments in Under Upcoming Appointments ");

			}
			
			
			
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void VerifyNavigationToValidPage() {

		try {
			waitForElement(lblAppointments_GuestUser);
			
			if (isElementPresent(lblAppointments_GuestUser)||isElementPresent(lblAppointments)) {

				passed(" Successfully Navigated To Appointments Page");
			} else {
				failed(driver, " Failed To navigate To Appointments Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	}

}

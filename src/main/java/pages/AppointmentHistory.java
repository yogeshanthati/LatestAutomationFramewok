package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utilities.Data;
import utilities.GlobalKeys;
import utilities.GlobalVariables;

public class AppointmentHistory extends TestBase{

	protected AppointmentHistory(AppiumDriver<WebElement> driver2, Data data) {
		super(driver2, data);
		// TODO Auto-generated constructor stub
	
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Appointment History')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Details']")
	private MobileElement lblAppointmentHistory;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Health Appointments')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Health Appointments']")
	private MobileElement btnHealthAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Wellness Appointments')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wellness Appointments']")
	private MobileElement btnWellnessAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.Spinner")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']//preceding-sibling::XCUIElementTypeStaticText")
	private MobileElement txtAppointmentFor;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Show drop-down menu']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='dropDown']")
	private MobileElement dropdownAppointmentFor;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'All')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='All']")
	private MobileElement btnAll_AppointmentHistory;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Upcoming')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Upcoming']")
	private MobileElement btnUpcoming_AppointmentHistory;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Completed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Completed']")
	private MobileElement btnCompleted_AppointmentHistory;
   
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Canceled')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Canceled']")
	private MobileElement btnCanceled_AppointmentHistory;


	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Past')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Past']")
	private MobileElement btnPast_AppointmentHistory;
	
	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='arrowLeft']")
	private MobileElement NavBackButton;


	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_appointment_status')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[3]")
	private List<MobileElement> txtAppointmentStatus_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_service_name')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[2]")
	private List<MobileElement> txtAppointmentName_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_location_name')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[1]")
	private List<MobileElement> txtAppointmentLocation_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_year')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[4]")
	private List<MobileElement> txtAppointmentYear_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_day_month')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='disclosureIndicator'])//preceding-sibling:: XCUIElementTypeStaticText[5]")
	private List<MobileElement> txtAppointmentDayMonth_AppointmentHistoryAppointments;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_forward')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='disclosureIndicator']")
	private List<MobileElement> btnForward_AppointmentHistory;
	
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/iv_service_icon')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage)[1]")
	private MobileElement eleAppointmentDetails_ServiceIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_test_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Details']//following::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_ServiceName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_address')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Details']//following::XCUIElementTypeStaticText[2]")
	private MobileElement eleAppointmentDetails_ServiceAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Patient Name')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Name')]//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_PatientName;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Appointment Schedule')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Schedule']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_AppointmentSchedule;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Phone')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Phone']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_Phone;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_Email;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Appointment Status')]//following-sibling::android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Appointment Status']//following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement eleAppointmentDetails_AppointmentStatus;
	
	
	
	
	public void ValidateDefaultSelectOptionForSelfInAppointmentHistoryAppointments() {
	
		try {
			waitForElement(txtAppointmentFor);

			takeScreenshot(driver);

			if (txtAppointmentFor.getText().trim().replaceAll("\\s+", "")
					.equals((GlobalVariables.FirstName + GlobalVariables.LastName + "(Self)").replaceAll("\\s+", ""))) {

				passed("User successfully validated Appointments Dropdown Default Select Option In Appointment History As"
						+ txtAppointmentFor.getText());
			} else {
				failed(driver,
						"User Failed To Validate Appointments Dropdown Default Select Option  In Appointment History As Expected As"
								+ (GlobalVariables.FirstName + GlobalVariables.LastName + "(Self)").replaceAll("\\s+",
										"")
								+ "But Actual is" + txtAppointmentFor.getText().trim().replaceAll("\\s+", ""));
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}		
		
	}
	
	public void ValidateAppointmentHistoryDetailsInAllAppointments() {
		waitForElement(btnAll_AppointmentHistory);
		
		clickOn(btnAll_AppointmentHistory, "All button In Appointment History");
		
		
		
	}
	
	
public void ValidateAppointmentHistoryDetailsInUpcomingAppointments() {
		
		
	}
	
	

public void ValidateAppointmentHistoryDetailsInCanceledAppointments() {
	
	
}
public void SwipeToViewCanceledAppointmentButtonInAndroid() {
	try {
		scrollByDimension(0.9, 0.2, 0.2, 0.2);
	} catch (Exception e) {
		failed(driver, "Exception caught " + e.getMessage());
	}
}
	public void ValidateAppointmentHistoryDetails() {
		
		try {
			switch (GlobalVariables.AppointmentStatus) {
			
			
			case "ACTIVE":

			

				break;

			case "CANCELED":

			

				break;

			case "Test Report":

			

				break;

			case "Vaccination":
				if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {

				//	SwipeToViewVaccinationButtonInAndroid();
				}
				

				break;

			default:

				info("Invalid option Record Type selected");
			}
		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

		
		scrollByDimension(0.9, 0.2, 0.2, 0.2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ValidateAppointmentDetailsInAppointmentHistory() {
		
		try {

			waitForElement(eleAppointmentDetails_ServiceIcon);

			if (isElementPresent(eleAppointmentDetails_ServiceIcon)) {

				passed("Sucessfully Validated the Service icon in Appointment Details");

			} else {

				failed(driver, " failed to Validate the Service icon in Appointment Details");
			}

			waitForElement(eleAppointmentDetails_ServiceName);

			if (eleAppointmentDetails_ServiceName.getText().trim().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectServiceName.trim().replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service  Name in Appointment Details As "
						+ eleAppointmentDetails_ServiceName.getText());
			} else {
				failed(driver,
						"Failed To Validate the Service Name in Appointment Details Expected As"
								+ GlobalVariables.SelectServiceName.replaceAll("\\s+", "") + "but Actual is"
								+ eleAppointmentDetails_ServiceName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleAppointmentDetails_ServiceAddress);

			if (eleAppointmentDetails_ServiceAddress.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", ""))) {
				passed("Successsfully validated the Service Address in Appointment Details As "
						+ eleAppointmentDetails_ServiceAddress.getText());
			} else {
				failed(driver,
						"Failed To Validate the Service Address in Appointment Details Expected As"
								+ GlobalVariables.SelectWellnessCenterLocation.replaceAll("\\s+", "") + "but Actual is"
								+ eleAppointmentDetails_ServiceAddress.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleAppointmentDetails_PatientName);

			if (eleAppointmentDetails_PatientName.getText().replaceAll("\\s+", "")
					.equalsIgnoreCase(GlobalVariables.FirstName + GlobalVariables.LastName)) {
				passed("Successsfully validated the Patient Name in Appointment Details As "
						+ eleAppointmentDetails_PatientName.getText());
			} else {
				failed(driver,
						"Failed To Validate the Patient Name in Appointment Details Expected As" + GlobalVariables.FirstName
								+ GlobalVariables.LastName + "but Actual is"
								+ eleAppointmentDetails_PatientName.getText().replaceAll("\\s+", ""));
			}

			waitForElement(eleAppointmentDetails_AppointmentSchedule);

			String AppointmentSchedule = eleAppointmentDetails_AppointmentSchedule.getText().trim();

			String[] arrAppointmentSchedule = AppointmentSchedule.split(",");

			String Apoointment_Time = arrAppointmentSchedule[0];

			String Apoointment_Date = arrAppointmentSchedule[1];

			if (Apoointment_Time.equals(GlobalVariables.SelectTimeSlotForAppointment)) {

				passed("Successfully Validated the  Appointment schedule time in Appointment Details As"
						+ Apoointment_Time);
			} else {
				failed(driver, "Failed To Validate the Appointment schedule time In Appointment Details Expected As "
						+ (GlobalVariables.SelectTimeSlotForAppointment) + ",But Actual is" + Apoointment_Time);
			}

			if (Apoointment_Date.replaceAll("\\s+", "")
					.equals(GlobalVariables.SelectTravelDate.replaceAll("\\s+", ""))) {

				passed("Successfully Validated the  Appointment schedule Date in Appointment Details As"
						+ Apoointment_Date);
			} else {
				failed(driver, "Failed To Validate the  Appointment schedule Date In Appointment Details Expected As "
						+ (GlobalVariables.SelectTravelDate) + ",But Actual is" + Apoointment_Date);
			}

			waitForElement(eleAppointmentDetails_Phone);

			String UIPhoneNumber = eleAppointmentDetails_Phone.getText();

			String arrsUIPhoneNumber = UIPhoneNumber.substring(2, UIPhoneNumber.length());

			String PhoneNumberInPatientDetails = arrsUIPhoneNumber.replaceAll("[^\\d]", "");

			if (PhoneNumberInPatientDetails.equals(GlobalVariables.PhoneNumber)) {
				passed("Successfully Validated the  Phone Number in Appointment Details As" + PhoneNumberInPatientDetails);

			} else {
				failed(driver, "Failed To Validate the Phone Number Identity In Appointment Details Expected As "
						+ (GlobalVariables.PhoneNumber) + ",But Actual is" + PhoneNumberInPatientDetails);

			}

			waitForElement(eleAppointmentDetails_Email);

			if (eleAppointmentDetails_Email.getText().equals(GlobalVariables.CreateUserName)) {
				passed("Successfully Validated the Email in Appointment Details As" + eleAppointmentDetails_Email.getText());
			} else {
				failed(driver, "Failed To Validate the Gender Identity in Appointment Details Expected As "
						+ (GlobalVariables.CreateUserName) + ",But Actual is" + eleAppointmentDetails_Email.getText());
			}

		} catch (Exception e) {

			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void VerifyNavigationToValidPage() {
		try {
			waitForElement(lblAppointmentHistory);
			
			if (isElementPresent(lblAppointmentHistory)) {

				passed("User Successfully Navigated To Appointment History  Page");
			} else {
				failed(driver, "User Failed To navigate To Appointment History  Page");
			}

			takeScreenshot(driver);

		} catch (Exception e) {
			failed(driver, "Exception caught " + e.getMessage());
		}

	
		
	}

	
	
	
}

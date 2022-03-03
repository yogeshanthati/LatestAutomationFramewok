package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Appointments_BookingDetailsPage;
import pages.Appointments_HealthServicesPage;
import pages.Appointments_SelectAppointmentForPage;
import pages.Appointments_WellnessServicesPage;
import pages.ChatCare_PatientDetails;
import pages.HealthService_AddChildDetailsPage;
import pages.MembershipDetailsPage;
import pages.MyChildrenPage;
import utilities.Common;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalKeys;

public class MyChildrenPageTests extends Common {

	public static int count = 1;

	private TestBase TestBase;

	private pages.LandingPage TreatLandingPage;

	private pages.SignInPage SignInPage;

	private pages.MyProfilePage MyProfilePage;

	private pages.AppNavPage AppNavPage;

	private pages.CreateProfilePage CreateProfilePage;

	private pages.MembershipPlansPage MembershipPlansPage;

	private pages.ChatCarePage ChatCarePage;

	private pages.BuyMembershipPage BuyMembershipPage;

	private pages.MembershipCongratulationsPage MembershipCongratulationsPage;

	private MembershipDetailsPage MembershipDetailsPage;

	private pages.ProfileDetailsPage ProfileDetailsPage;
	
	private ChatCare_PatientDetails ChatCare_PatientDetails;
	
	private MyChildrenPage MyChildrenPage;
	
	private Appointments_HealthServicesPage Appointments_HealthServicesPage;
	private Appointments_BookingDetailsPage Appointments_BookingDetailsPage;
	private Appointments_WellnessServicesPage Appointments_WellnessServicesPage;
	
	private HealthService_AddChildDetailsPage HealthService_AddChildDetailsPage;
	
	private Appointments_SelectAppointmentForPage Appointments_SelectAppointmentForPage;
	private pages.AppointmentsPage AppointmentsPage;



	public Data data;
	public ArrayList<String> datasets;

	@BeforeMethod
	public void testStart(Method method) {
		String name = method.getName();
		data = new Data("TestData");
		datasets = data.getDataSets(name);
	}

	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC042_ValidateDetailsInMyChildrenForTheDependentCreatedFromChatCare(String deviceName, String platformName,
			String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

			SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
			
			CreateProfilePage = SignInPage.clickOnCreateAccountButton();

			CreateProfilePage.CreateAProfileInTreat();

			AppNavPage = CreateProfilePage.clickOnSkipForNow();

			ChatCarePage = AppNavPage.clickOnChatCareButton();

			ChatCarePage.ValidateChatCarePermissionsForNonMemberUser();

			MembershipPlansPage = ChatCarePage.clickOnBecomeATreatMemberButton();

			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();

			MembershipPlansPage.SelectPlanInMembershipPlans();

			BuyMembershipPage = MembershipPlansPage.clickOnProceedButtonInChatCare();

			BuyMembershipPage.SelectCardToBuyMembership();

			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();

			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MyProfilePage.ValidateMemberLabelInMyprofilePage();

			ChatCarePage = AppNavPage.clickOnChatCareButton();
			
			ChatCare_PatientDetails=ChatCarePage.SelectChildToAddInChatCare();
			
			ChatCare_PatientDetails.AddChildInChatCarePatientDetailsPage();
						
			AppNavPage=ChatCare_PatientDetails.clickOnChatCareTextPopUpOkButton();
							
			MyProfilePage = AppNavPage.clickOnMyAccountButton();
			
			MyChildrenPage=MyProfilePage.clickOnMyChildrenButton();
			
			MyChildrenPage.ValidateChildNameInMyChildrenPage();
			
			MyChildrenPage.clickOnChildrenLinkInMyChildren();
			
			MyChildrenPage.ValidateChildDetailsInMyChildren();
			
			MyChildrenPage.ValidateUpdatedDetailsInMyChildrenPage();
			
			MyChildrenPage.ValidateFieldsInMyChildren();
			
			MyProfilePage=MyChildrenPage.clickOnBackInMyChildrenDetails();
			
			TreatLandingPage = MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}
	}
	

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC043_ValidateDetailsInMyChildrenForTheDependentCreatedFromHealthServices(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);	
			
	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        
	        CreateProfilePage = SignInPage.clickOnCreateAccountButton();
		
		    CreateProfilePage.CreateAProfileInTreat();
		   
		    AppNavPage =CreateProfilePage.clickOnSkipForNow();

			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			MembershipPlansPage=Appointments_HealthServicesPage.ValidateMembershipFromHealthServicesAppointments();

			MembershipPlansPage.ValidateDetailsInMembershipPlansPage();

			MembershipPlansPage.SwipeDownTillSelectMembershipPlan();
			
			MembershipPlansPage.SelectPlanInMembershipPlans();
			
			BuyMembershipPage=MembershipPlansPage.clickOnProceedButtonInChatCare();
			
			BuyMembershipPage.SelectCardToBuyMembership();
			
			MembershipCongratulationsPage=BuyMembershipPage.clickOnMakePaymentButton();
			
			Appointments_SelectAppointmentForPage=MembershipCongratulationsPage.clickOnDonebuttonForAddChildFromHealth();
	        
			HealthService_AddChildDetailsPage=Appointments_SelectAppointmentForPage.SelectChildToCreate();
			
			Appointments_HealthServicesPage=HealthService_AddChildDetailsPage.AddChildInHealthServiceAppointmentPage();
			
			AppointmentsPage=Appointments_HealthServicesPage.ClickOnCloseAppointmentAtSelectAppointmentFor();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
            MyProfilePage = AppNavPage.clickOnMyAccountButton();
			
			MyChildrenPage=MyProfilePage.clickOnMyChildrenButton();
			
            MyChildrenPage.ValidateChildNameInMyChildrenPage();
			
			MyChildrenPage.clickOnChildrenLinkInMyChildren();
			
			MyChildrenPage.ValidateChildDetailsInMyChildren();
			
			MyChildrenPage.ValidateUpdatedDetailsInMyChildrenPage();
			
			MyChildrenPage.ValidateFieldsInMyChildren();
			
			MyProfilePage=MyChildrenPage.clickOnBackInMyChildrenDetails();
			
			TreatLandingPage = MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();


			datasetEnd();
		}

	}
	
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

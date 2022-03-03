package tests;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.*;
import utilities.Common;
import utilities.Constants;
import utilities.Data;
import utilities.GlobalKeys;

public class AppointmentsPageTests extends Common {
	
	public static int count = 1;
	private TestBase TestBase;
	private pages.LandingPage TreatLandingPage;
	private pages.SignInPage SignInPage;
	private pages.MyProfilePage MyProfilePage;
	private pages.DiscoverPage DiscoverPage;
	private pages.AppNavPage AppNavPage;
	private pages.MembershipDetailsPage MembershipDetailsPage;
	private pages.CreateProfilePage CreateProfilePage;
	private pages.AppointmentsPage AppointmentsPage;
	private MembershipPlansPage MembershipPlansPage;
	private MembershipCongratulationsPage MembershipCongratulationsPage;
	private BuyMembershipPage BuyMembershipPage;
	private Appointments_HealthServicesPage Appointments_HealthServicesPage;
	private Appointments_BookingDetailsPage Appointments_BookingDetailsPage;
	private Appointments_WellnessServicesPage Appointments_WellnessServicesPage;
	
	private HealthService_AddChildDetailsPage HealthService_AddChildDetailsPage;
	
	private Appointments_SelectAppointmentForPage Appointments_SelectAppointmentForPage;
	
	private ChatCare_PatientDetails ChatCare_PatientDetails;
	
	private pages.ChatCarePage ChatCarePage;
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
	public void MOB_TC028_ValidateTheAppointmentsFunctionalityForGuestUserInTreatApp(String deviceName,
			String platformName, String platFormVersion) {
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

			AppNavPage = TreatLandingPage.clicOnContinueAsGuest();

			AppointmentsPage = AppNavPage.clickOnBookingsButton();

			AppointmentsPage.ValidateFieldsInAppointmentsPageForGuestUser();

			SignInPage = AppointmentsPage.clickOnLogInButton();

			AppointmentsPage = SignInPage.ClickOnNavigateBackToAppointments();

			CreateProfilePage = AppointmentsPage.clickOnCreateAccountButton();

			AppointmentsPage = CreateProfilePage.ClickOnNavigateBackToAppointments();

			AppointmentsPage.ValidateCreateAppointmentsForGuestUser();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC029_ValidateCreatingAHealthServicesAppointmentForNonMemberUser(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        
	        CreateProfilePage = SignInPage.clickOnCreateAccountButton();
   
		    CreateProfilePage.CreateAProfileInTreat();
			
			AppNavPage=CreateProfilePage.clickOnSkipForNow(); 
	        
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Self);
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
		
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceSecondAppointment(Constants.Self);
			
	        Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
        	AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.ValidateSecondUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForSecondUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceThirdAppointment(Constants.Self);
			
	        Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
        	AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.ValidateThirdUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForThirdUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}


	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC030_ValidateCreatingAHealthServicesAppointmentForAMember(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);	
			
	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        

	        	            
			CreateProfilePage = SignInPage.clickOnCreateAccountButton();
		
		    CreateProfilePage.CreateAProfileInTreat();
			
			MembershipPlansPage=CreateProfilePage.clickOnBecomeATreatMemberButton(); 
		       
			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();
			
			MembershipPlansPage.SelectPlanInMembershipPlans();
			
			BuyMembershipPage=MembershipPlansPage.clickOnProceedButton();
			
			BuyMembershipPage.SelectCardToBuyMembership();
			
			MembershipCongratulationsPage=BuyMembershipPage.clickOnMakePaymentButton();
			
			AppNavPage=MembershipCongratulationsPage.clickOnDonebutton();
	        
		   MyProfilePage=AppNavPage.clickOnMyAccountButton();
				
		   MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
				
		   MembershipDetailsPage.ValidateMembershipBenfitsforMemberSelf();
				
		   MyProfilePage=MembershipDetailsPage.clickOnBackButton();
			
		    AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Self);
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.ValidateMembershipAppointmentBenfitText();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
			
			MembershipDetailsPage.ValidateAvailedMembershipBenfitCountForSelf();
			
			MyProfilePage=MembershipDetailsPage.clickOnBackButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceSecondAppointment(Constants.Self);
			
             Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.ValidateMembershipAppointmentBenfitText();
			
            Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.ValidateSecondUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForSecondUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
            MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
			
			MembershipDetailsPage.ValidateAvailedMembershipBenfitCountForSelf();	
			
            MyProfilePage=MembershipDetailsPage.clickOnBackButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceThirdAppointment(Constants.Self);
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
								
	        Appointments_HealthServicesPage.clickOnConfirmBookingButton();
				
	        Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
				
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.ValidateThirdUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForThirdUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			 MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
				
			MembershipDetailsPage.ValidateAvailedMembershipBenfitCountForSelf();
			
			 MyProfilePage=MembershipDetailsPage.clickOnBackButton();
				
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC031_ValidateRescheduleAndCancelOfAHealthServiceAppointmentForAnUser(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);
			
		    SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
		     
	       	CreateProfilePage = SignInPage.clickOnCreateAccountButton();
		
	    	CreateProfilePage.CreateAProfileInTreat();
			
			AppNavPage=CreateProfilePage.clickOnSkipForNow(); 
		        
//		    SignInPage.EnterUserNameAndPassword();
//		        
//	        AppNavPage =SignInPage.clickOnSignInButton();
		  
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Self);
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
		
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			Appointments_BookingDetailsPage.RescheduleAppointmentInBookingDetails();
			
			AppointmentsPage=Appointments_BookingDetailsPage.clickOnDoneInBookingUpdated();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();
			
			AppointmentsPage.ValidateCancelHealthAppointmentInUpcomingAppointmentsPage();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MembershipPlansPage = MyProfilePage.clickOnBecomeATreatMemberButton();

			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();

			MembershipPlansPage.SelectPlanInMembershipPlans();

			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();

			BuyMembershipPage.SelectCardToBuyMembership();

			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();

			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();
            
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
             
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Self);
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			

if (GlobalKeys.configData.get("PlatFormName").equalsIgnoreCase("Android")) {
	
	Appointments_HealthServicesPage.ValidateMembershipAppointmentBenfitText();


}
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
		
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			Appointments_BookingDetailsPage.RescheduleAppointmentInBookingDetails();
			
			AppointmentsPage=Appointments_BookingDetailsPage.clickOnDoneInBookingUpdated();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();
						
			AppointmentsPage.ValidateCancelHealthAppointmentInUpcomingAppointmentsPage();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
		
			MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
				
			MembershipDetailsPage.ValidateAvailedMembershipBenfitCountForSelf();
			
			MyProfilePage=MembershipDetailsPage.clickOnBackButton();
				
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
				
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC032_ValidateTheFieldsInHealthServiceAppointmentsFlow(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        
	        SignInPage.EnterUserNameAndPassword();
	        
	        AppNavPage=SignInPage.clickOnSignInButton();
	        		   	       
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectTravellingDateErrorMessageInHealthServices();
			
			Appointments_HealthServicesPage.SelectTravellingDateAsCurrentDate();
			
			Appointments_HealthServicesPage.clickOnProceedButton();
			
			Appointments_HealthServicesPage.ValidateSelectHealthServiceErrorMessageInHealthServices();
			
			Appointments_HealthServicesPage.clickOnBackButtonInHealthServices();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceThirdAppointment(Constants.Self);

			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
		
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAddAppointmentsToTheCalender();
			
			Appointments_BookingDetailsPage.ValidateSelectReasonForCancelErrorMessageForHealthServices();
			
			Appointments_BookingDetailsPage.clickOnNavBackButtonInCancelBooking();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();
			
            AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC033_ValidateCreatingAWellnessServicesAppointmentForAMemberAndNonMemberUser(String deviceName,
			String platformName, String platFormVersion) {

		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

		   SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
		
			CreateProfilePage = SignInPage.clickOnCreateAccountButton();

			CreateProfilePage.CreateAProfileInTreat();   

			AppNavPage = CreateProfilePage.clickOnSkipForNow(); 
		   
//		   SignInPage.EnterUserNameAndPassword();
			
//	       AppNavPage=SignInPage.clickOnSignInButton();
			
			AppointmentsPage = AppNavPage.clickOnBookingsButton();

			AppointmentsPage.clickOnWellnessServicesButton();

			Appointments_WellnessServicesPage = AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();

			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentNonMemberForSelf();

			Appointments_WellnessServicesPage.ValidateReviewYourAppointmentDetails();

			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();

			Appointments_WellnessServicesPage.ValidateBookingConfirmedDetails();

			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingWellnessServiceButton();

			AppointmentsPage.ValidateLatestUpcomingAppointments();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();

			AppNavPage = Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MembershipPlansPage = MyProfilePage.clickOnBecomeATreatMemberButton();

			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();

			MembershipPlansPage.SelectPlanInMembershipPlans();

			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();

			BuyMembershipPage.SelectCardToBuyMembership();

			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();

			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();

			AppointmentsPage = AppNavPage.clickOnBookingsButton();

			AppointmentsPage.clickOnWellnessServicesButton();

			Appointments_WellnessServicesPage = AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();

			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();


			Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentMemberForSelf();


			Appointments_WellnessServicesPage.ValidateReviewYourAppointmentDetails();

			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();

			Appointments_WellnessServicesPage.ValidateBookingConfirmedDetails();

			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingWellnessServiceButton();

			AppointmentsPage.ValidateSecondUpComingAppointmentForWellness();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForSecondUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();

			AppNavPage = Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();

			MyProfilePage = AppNavPage.clickOnMyAccountButton();

			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}

	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC034_ValidateCancelOfAWellnessServiceAppointmentForAnUser(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	       	    
	       	CreateProfilePage = SignInPage.clickOnCreateAccountButton();
		
	    	CreateProfilePage.CreateAProfileInTreat();
			
			AppNavPage=CreateProfilePage.clickOnSkipForNow(); 
	        
//			   SignInPage.EnterUserNameAndPassword();
//	        
//	        AppNavPage=SignInPage.clickOnSignInButton();
	  
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnWellnessServicesButton();
			
			Appointments_WellnessServicesPage=AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();
			
			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_WellnessServicesPage = AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();

			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_WellnessServicesPage.ValidateWellnessServiceEligibilityText();

			Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentNonMemberForSelf();

			Appointments_WellnessServicesPage.ValidateReviewYourAppointmentDetails();

			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();

			Appointments_WellnessServicesPage.ValidateBookingConfirmedDetails();

			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingWellnessServiceButton();

			AppointmentsPage.ValidateLatestUpcomingAppointments();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetailsForWellnessService();
						
			AppointmentsPage.ValidateCancelWellnessAppointmentInUpcomingAppointmentsPage();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MembershipPlansPage = MyProfilePage.clickOnBecomeATreatMemberButton();

			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();

			MembershipPlansPage.SelectPlanInMembershipPlans();

			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();

			BuyMembershipPage.SelectCardToBuyMembership();

			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();

			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();
            
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
             
			AppointmentsPage.clickOnWellnessServicesButton();
			
            Appointments_WellnessServicesPage=AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();
			
			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_WellnessServicesPage = AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();

			Appointments_WellnessServicesPage.ValidateSelectedWellnessCenterLocation();

			Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentNonMemberForSelf();

			Appointments_WellnessServicesPage.ValidateReviewYourAppointmentDetails();

			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();

			Appointments_WellnessServicesPage.ValidateBookingConfirmedDetails();

			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.clickOnUpcomingWellnessServiceButton();

			AppointmentsPage.ValidateLatestUpcomingAppointments();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();

			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetailsForWellnessService();
			
			AppointmentsPage.ValidateCancelWellnessAppointmentInUpcomingAppointmentsPage();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	
	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC035_ValidateTheFieldsInWellnessServiceAppointmentsFlow(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);

	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        
	        SignInPage.EnterUserNameAndPassword();
	        
	        AppNavPage=SignInPage.clickOnSignInButton();
	        		   	       
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
		
			AppointmentsPage.clickOnWellnessServicesButton();
			
			Appointments_WellnessServicesPage=AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();
			
			Appointments_WellnessServicesPage.ValidateSelectTravellingDateErrorMessageInWellSenessServices();
			
			Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentNonMemberForSelf();
			
			Appointments_WellnessServicesPage.clickOnConfirmBookingButton();
			
			AppointmentsPage = Appointments_WellnessServicesPage.clickOnDoneInBookingConfirmed();

			AppointmentsPage.clickOnUpcomingWellnessServiceButton();

			Appointments_BookingDetailsPage = AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateSelectReasonForCancelErrorMessageForWellnessServices();
			
			Appointments_BookingDetailsPage.clickOnNavBackButtonInCancelBooking();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetailsForWellnessService();
			
            AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}

	
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC038_ValidateCreatingAHealthServicesAppointmentForADependent(String deviceName,
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
			
			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
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
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.ValidateMembershipAppointmentBenfitText();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
		
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
			
			MembershipDetailsPage.ValidateAvailedMembershipBenfitCountForDependent();
			
			MyProfilePage=MembershipDetailsPage.clickOnBackButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceSecondAppointment(Constants.Child);
			
            Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
             
            Appointments_HealthServicesPage.ValidateMembershipAppointmentBenfitText();
			
            Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
			
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.ValidateSecondUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForSecondUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
            MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
         
            MembershipDetailsPage.ValidateAvailedMembershipBenfitCountForDependent();
			
            MyProfilePage=MembershipDetailsPage.clickOnBackButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
			AppNavPage.clickOnHealthWalletButton();
			
            AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceThirdAppointment(Constants.Child);
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
								
	        Appointments_HealthServicesPage.clickOnConfirmBookingButton();
				
	        Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
				
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.ValidateThirdUpcomingAppointmentForHealth();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForThirdUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppNavPage=Appointments_BookingDetailsPage.clickOnNavBackButtonInBookingDetails();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			MembershipDetailsPage=MyProfilePage.clickOnMembershipDetailsButton();
				
			MyProfilePage=MembershipDetailsPage.clickOnBackButton();
				
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC039_ValidateReschduleAndCancelOfAHealthServicesAppointmentForADependent(String deviceName,
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
		    
		    MyProfilePage=AppNavPage.clickOnMyAccountButton();
		    
		    MembershipPlansPage = MyProfilePage.clickOnBecomeATreatMemberButton();

			MembershipPlansPage.SwipeUpTillSelectMembershipPlan();

			MembershipPlansPage.SelectPlanInMembershipPlans();

			BuyMembershipPage = MembershipPlansPage.clickOnProceedButton();

			BuyMembershipPage.SelectCardToBuyMembership();

			MembershipCongratulationsPage = BuyMembershipPage.clickOnMakePaymentButton();

			AppNavPage = MembershipCongratulationsPage.clickOnDonebutton();
		    
            ChatCarePage = AppNavPage.clickOnChatCareButton();
			
			ChatCare_PatientDetails=ChatCarePage.SelectChildToAddInChatCare();
			
			ChatCare_PatientDetails.AddChildInChatCarePatientDetailsPage();
			
			AppNavPage=ChatCare_PatientDetails.clickOnChatCareTextPopUpOkButton();
			
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateAHealthServiceAppointment(Constants.Child);
			
			Appointments_HealthServicesPage.ValidateHealthProfileTextForChatCareDependent();
			
			Appointments_HealthServicesPage.ValidateReviewYourAppointmentDetails();
			
			Appointments_HealthServicesPage.ValidateMembershipAppointmentBenfitText();
			
			Appointments_HealthServicesPage.clickOnConfirmBookingButton();
			
			Appointments_HealthServicesPage.ValidateBookingConfirmedDetails();
		
			AppointmentsPage=Appointments_HealthServicesPage.clickOnDoneInBookingConfirmed();
			
			AppointmentsPage.clickOnUpcomingHealthServiceButton();
			
			AppointmentsPage.ValidateLatestUpcomingAppointments();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			Appointments_BookingDetailsPage.RescheduleAppointmentInBookingDetails();
			
            AppointmentsPage=Appointments_BookingDetailsPage.clickOnDoneInBookingUpdated();
			
			Appointments_BookingDetailsPage=AppointmentsPage.clickOnProceedArrowbuttonForLatestUpComingAppointments();
			
			Appointments_BookingDetailsPage.ValidateAppointmentDetailsInBookingDetailsPage();
			
			AppointmentsPage=Appointments_BookingDetailsPage.CancelAppointmentInBookingDetails();
			
			AppointmentsPage.ValidateCancelHealthAppointmentInUpcomingAppointmentsPage();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	@Test
	@Parameters({ "selenium.deviceName", "selenium.PlatformName", "selenium.PlatformVersion" })
	public void MOB_TC040_ValidateCreateAnInvalidAppointmentsForADependent(String deviceName,
			String platformName, String platFormVersion) {
		
		String strName = new Exception().getStackTrace()[0].getMethodName();

		data.setColIndex(strName);

		for (String dataset : datasets) {

			data.setIndex(dataset);

			TreatLandingPage = TestBase.setUp(data);	
			
	        SignInPage = TreatLandingPage.clickOnSignInButtonInLandingPage();
	        
            SignInPage.EnterUserNameAndPassword();
	        
	        AppNavPage=SignInPage.clickOnSignInButton();
	       			
			AppointmentsPage=AppNavPage.clickOnBookingsButton();
			
			AppointmentsPage.clickOnHealthServicesButton();
			
			Appointments_HealthServicesPage=AppointmentsPage.SelectWellnessCenterLocationForHealthServices();
			
			Appointments_HealthServicesPage.ValidateIVTheraphyAvailabilityText();
			
			Appointments_HealthServicesPage.ValidateSelectedWellnessCenterLocation();
			
			Appointments_HealthServicesPage.ValidateCreateIVTheraphyHealthServiceAppointmentForDependent();
			
			AppointmentsPage=Appointments_HealthServicesPage.ClickOnCloseAppointmentAtSelectAppointmentFor();
			
			AppointmentsPage.clickOnWellnessServicesButton();
			
            Appointments_WellnessServicesPage=AppointmentsPage.SelectWellnessCenterLocationForWellnessServices();
			
            Appointments_WellnessServicesPage.ValidateCreateAWellnessServiceAppointmentForDependent();
            
            AppointmentsPage=Appointments_WellnessServicesPage.ClickOnCloseAppointmentAtSelectAppointmentFor();
			
			AppNavPage=AppointmentsPage.NavigateToAppNavPage();
			
			MyProfilePage=AppNavPage.clickOnMyAccountButton();
			
			AppNavPage=MyProfilePage.NavigateToAppNavPage();
			
			MyProfilePage.clickOnSignOutButton();

			TestBase.tearDown();

			datasetEnd();
		}

	}
	
	
	
	
	
	
	
	
	
	
	


	

}
